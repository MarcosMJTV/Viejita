package main;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import dominio.Logistica;
import pantallas.Menu;
import pantallas.Pantalla;

public class Viejita {

	public static Pantalla pan;
	public static Logistica log;
	public static Menu menu;
	public static String direc = "C:\\Users\\marco\\Documents\\WorkSpace\\Viejita\\src\\Elementos\\";
	public static boolean gana = false;
	public static int X = 0;
	public static int Y = 0;
	public static Clip yoa;
	public static Clip bea;
	
	public static void main(String[] agrs) {
		 iniciarMenu();
		
	}

	public static void iniciarJuego() {
		bea = ReproducirSonido(direc+"BEAS.wav", 0.3f);
		pan = new Pantalla();
		

	}
	
	public static void iniciarMenu() {
		yoa = ReproducirSonido(direc+"8bitYoa.wav", 0.8f);
		menu = new Menu();
		
	}
	public static Clip ReproducirSonido(String nombreSonido, float volumen) {
		Clip clip = null;
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			setVolume(volumen, clip);
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
			System.out.println("Error al reproducir el sonido.");
		}
		return clip;
	}

	public static void setVolume(float volume, Clip clip) {
		if (volume < 0f || volume > 1f) {
			throw new IllegalArgumentException("Volume not valid: " + volume);
		}
		FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(20f * (float) Math.log10(volume));

	}
	
}
