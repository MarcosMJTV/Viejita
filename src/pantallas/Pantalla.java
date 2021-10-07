package pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Logistica;
import main.Viejita;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Pantalla extends JFrame {

	public static String turno = "X";
	public static String siguienteJuego = "O";
	public static JLabel paqL[] = new JLabel[9];
	private JPanel contentPane;

	private JPanel panel;
	private JLabel label1;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label3;
	private JLabel label2;
	private JLabel label4;
	private JLabel marcaX;
	private JLabel Xmuestra;
	private JLabel marcaO;
	private JLabel Omarcador;
	private JButton reiniciar;
	private JButton Salir;
	private JPanel panelBar;
	private JPanel panelM;
	private JPanel panelB;
	private JPanel panelMX;
	private JPanel panelMO;

	public Pantalla() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 345);
		contentPane = new Textura(this); 
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		BorderLayout bl_contentPane = new BorderLayout();
		bl_contentPane.setVgap(5);
		bl_contentPane.setHgap(5);
		contentPane.setLayout(bl_contentPane);

		panelBar = new JPanel();
		BorderLayout bl_panelBar = new BorderLayout();
		bl_panelBar.setVgap(5);
		bl_panelBar.setHgap(5);
		panelBar.setLayout(bl_panelBar);
		panelM = new JPanel();
		BorderLayout bl_panelM = new BorderLayout();
		bl_panelM.setVgap(5);
		bl_panelM.setHgap(5);
		panelM.setLayout(bl_panelM);
		panelB = new JPanel();
		BorderLayout bl_panelB = new BorderLayout();
		bl_panelB.setVgap(5);
		bl_panelB.setHgap(5);
		panelB.setLayout(bl_panelB);
		panelBar.setOpaque(false);

		contentPane.add(panelBar, BorderLayout.EAST);
		panelBar.add(panelM, BorderLayout.NORTH);
		panelBar.add(panelB, BorderLayout.SOUTH);

		panelMX = new JPanel();
		BorderLayout bl_panelMX = new BorderLayout();
		bl_panelMX.setVgap(5);
		bl_panelMX.setHgap(5);
		panelMX.setLayout(bl_panelMX);
		panelMO = new JPanel();
		BorderLayout bl_panelMO = new BorderLayout();
		bl_panelMO.setVgap(5);
		bl_panelMO.setHgap(5);
		panelMO.setLayout(bl_panelMO);

		panelM.add(panelMX, BorderLayout.NORTH);
		panelM.add(panelMO, BorderLayout.SOUTH);

		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(27, 40, 284, 212);
		contentPane.add(panel, BorderLayout.CENTER);

		label1 = new JLabel("");
		label1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Viejita.log.presionar(1);
			}
		});
		panelM.setOpaque(false);
		panelB.setOpaque(false);
		panelMX.setOpaque(false);
		panelMO.setOpaque(false);
		
		panel.setLayout(new GridLayout(3, 3, 10, 10));
		label1.setFont(new Font("Arial Black", Font.PLAIN, 36));
		label1.setBackground(Color.WHITE);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setOpaque(true);

		label2 = new JLabel("");
		label2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Viejita.log.presionar(2);
			}
		});
		label2.setFont(new Font("Arial Black", Font.PLAIN, 36));
		label2.setBackground(Color.WHITE);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setOpaque(true);

		label3 = new JLabel("");
		label3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Viejita.log.presionar(3);
			}
		});
		label3.setFont(new Font("Arial Black", Font.PLAIN, 36));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setOpaque(true);

		label4 = new JLabel("");
		label4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Viejita.log.presionar(4);
			}
		});
		label4.setFont(new Font("Arial Black", Font.PLAIN, 36));
		label4.setBackground(Color.WHITE);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setOpaque(true);

		label5 = new JLabel("");
		label5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Viejita.log.presionar(5);
			}
		});
		label5.setFont(new Font("Arial Black", Font.PLAIN, 36));
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setBackground(Color.WHITE);
		label5.setOpaque(true);

		label6 = new JLabel("");
		label6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Viejita.log.presionar(6);
			}
		});
		label6.setFont(new Font("Arial Black", Font.PLAIN, 36));
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setBackground(Color.WHITE);
		label6.setOpaque(true);

		label9 = new JLabel("");
		label9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Viejita.log.presionar(9);
			}
		});

		label8 = new JLabel("");
		label8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Viejita.log.presionar(8);
			}
		});

		label7 = new JLabel("");
		label7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Viejita.log.presionar(7);
			}
		});
		label7.setFont(new Font("Arial Black", Font.PLAIN, 36));
		label7.setBackground(Color.WHITE);
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setOpaque(true);
		paqL[6] = label7;
		label8.setFont(new Font("Arial Black", Font.PLAIN, 36));
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setBackground(Color.WHITE);
		label8.setOpaque(true);
		paqL[7] = label8;
		label9.setFont(new Font("Arial Black", Font.PLAIN, 36));
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setBackground(Color.WHITE);
		label9.setOpaque(true);

		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);
		panel.add(label7);
		panel.add(label8);
		panel.add(label9);

		setVisible(true);

		paqL[0] = label1;
		paqL[1] = label2;
		paqL[2] = label3;
		paqL[3] = label4;
		paqL[4] = label5;
		paqL[5] = label6;
		paqL[8] = label9;

		marcaX = new JLabel("0");
		marcaX.setHorizontalAlignment(SwingConstants.CENTER);
		marcaX.setBackground(Color.WHITE);
		marcaX.setOpaque(true);
		

		Xmuestra = new JLabel("Marcador X");
		Xmuestra.setHorizontalAlignment(SwingConstants.CENTER);
		Xmuestra.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		

		marcaO = new JLabel("0");
		marcaO.setOpaque(true);
		marcaO.setHorizontalAlignment(SwingConstants.CENTER);
		marcaO.setBackground(Color.WHITE);
		

		Omarcador = new JLabel("Marcador O");
		Omarcador.setHorizontalAlignment(SwingConstants.CENTER);
		Omarcador.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
		

		reiniciar = new JButton("Reiniciar");
		reiniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (int i = 0; i < paqL.length; i++) {
					paqL[i].setText("");
					paqL[i].setBackground(new Color(250, 250, 250));
					Viejita.gana = false;
					getMarcaX().setText("" + Viejita.X);
					getMarcaO().setText("" + Viejita.Y);
				}
			}
		});
		

		Salir = new JButton("Salir");
		Salir.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

		panelMX.add(marcaX, BorderLayout.SOUTH);
		panelMX.add(Xmuestra, BorderLayout.NORTH);
		panelMO.add(marcaO, BorderLayout.SOUTH);
		panelMO.add(Omarcador, BorderLayout.NORTH);

		panelB.add(reiniciar, BorderLayout.NORTH);
		panelB.add(Salir, BorderLayout.SOUTH);

	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JLabel getLblNewLabel() {
		return label1;
	}

	public JLabel getLabel5() {
		return label5;
	}

	public JLabel getLabel6() {
		return label6;
	}

	public JLabel getLabel7() {
		return label7;
	}

	public JLabel getLblNewLabel_6() {
		return label8;
	}

	public JLabel getLblNewLabel_8() {
		return label9;
	}

	public JLabel getLabel3() {
		return label3;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public JLabel getLabel4() {
		return label4;
	}

	public JLabel getMarcaX() {
		return marcaX;
	}

	public JLabel getXmuestra() {
		return Xmuestra;
	}

	public JLabel getOmarcador() {
		return Omarcador;
	}

	public JButton getReiniciar() {
		return reiniciar;
	}

	public JButton getSalir() {
		return Salir;
	}

	public JLabel getMarcaO() {
		return marcaO;
	}
}
