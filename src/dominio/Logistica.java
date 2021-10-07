package dominio;

import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.Color;

import main.Viejita;

public class Logistica {

	public static int comb[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 },
			{ 3, 5, 7 }, { 1, 5, 9 }, };

	public static void presionar(int casilla) {
		if (Viejita.gana) {
			return;
		}
		if (Viejita.pan.paqL[casilla - 1].getText().equals("")) {
			Viejita.pan.paqL[casilla - 1].setText(Viejita.pan.turno);
			cambiarTurno();
			ganador();
		}
	}

	public static void cambiarTurno() {
		if (Viejita.pan.turno.equals("X")) {
			Viejita.pan.turno = "O";
		} else {
			Viejita.pan.turno = "X";
		}
	}

	public static void ganador() {

		for (int i = 0; i < comb.length; i++) {
			if (Viejita.pan.paqL[comb[i][0] - 1].getText().equals("X")
					&& Viejita.pan.paqL[comb[i][1] - 1].getText().equals("X")
					&& Viejita.pan.paqL[comb[i][2] - 1].getText().equals("X")) {
				System.out.println("gano X");
				Viejita.X = Viejita.X +1;
				Viejita.pan.paqL[comb[i][0] - 1].setBackground(new Color(255, 0, 0));
				Viejita.pan.paqL[comb[i][1] - 1].setBackground(new Color(255, 0, 0));
				Viejita.pan.paqL[comb[i][2] - 1].setBackground(new Color(255, 0, 0));
				Viejita.gana = true;
				
			}
			if (Viejita.pan.paqL[comb[i][0] - 1].getText().equals("O")
					&& Viejita.pan.paqL[comb[i][1] - 1].getText().equals("O")
					&& Viejita.pan.paqL[comb[i][2] - 1].getText().equals("O")) {
				Viejita.Y = Viejita.Y+1;
				Viejita.pan.paqL[comb[i][0] - 1].setBackground(new Color(255, 0, 0));
				Viejita.pan.paqL[comb[i][1] - 1].setBackground(new Color(255, 0, 0));
				Viejita.pan.paqL[comb[i][2] - 1].setBackground(new Color(255, 0, 0));
				Viejita.gana = true;

			}
		}
		
		
	}

}