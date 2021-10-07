package pantallas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.TexturePaint;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


import main.Viejita;

import javax.swing.JPanel;

public class Textura extends JPanel{	
	private static BufferedImage bi;
	private JFrame ven;
	
		public Textura(JFrame ven) {
			this.ven = ven;
		}
	
		static {
			try {
				bi = ImageIO.read(new File(Viejita.direc+"fondo.png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			TexturePaint textura = new TexturePaint(bi, new Rectangle(50,50));
			Graphics2D g2d = (Graphics2D)g;
			g2d.setPaint(textura);
			g2d.fillRect(0, 0, ven.getContentPane().getWidth(), ven.getContentPane().getHeight());

		}
	
}
