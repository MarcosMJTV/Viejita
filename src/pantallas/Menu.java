package pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Viejita;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private JPanel contentPane;
	public ImageIcon image;
	private JLabel label;
	private JButton boton;
	
	
	public  Menu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 327);
		contentPane = new Textura(this);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Viejita.direc+"vvv.png"));
		contentPane.add(label,BorderLayout.CENTER);
		
		
		boton = new JButton("Jugar");
		boton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Viejita.yoa.close();
				Viejita.iniciarJuego();
				dispose();
				
			}
		});
		contentPane.add(boton,BorderLayout.SOUTH);
		setVisible(true);
	}

	public JPanel getContentPane() {
		return contentPane;
	}
	public JLabel getLblNewLabel() {
		return label;
	}
	public JButton getBoton() {
		return boton;
	}
}
