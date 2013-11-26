package interfaGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	int peticion = 0;
	
	public menu() {
		setTitle("Guerra de los Mundos - Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 265);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(5,0,66));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel panelMatriz2 = new JPanel();
		panelMatriz2.setBounds(22, 122, 521, 310);
		panelMatriz2.setLayout(null);
		panelMatriz2.setBackground(new Color(5,0,66));
		contentPane.add(panelMatriz2);
		panelMatriz2.hide();
		
			final JPanel panelMatriz = new JPanel();
			panelMatriz.setBounds(22, 122, 521, 310);
			panelMatriz.setLayout(null);
			panelMatriz.setBackground(new Color(5,0,66));
			contentPane.add(panelMatriz);
			panelMatriz.hide();
		
		final JPanel panelMatriz3 = new JPanel();
		panelMatriz3.setBounds(22, 122, 521, 310);
		panelMatriz3.setLayout(null);
		panelMatriz3.setBackground(new Color(5,0,66));
		contentPane.add(panelMatriz3);
		panelMatriz3.hide();
		
		final JButton botonOpciones = new JButton("Opciones");
		botonOpciones.setBounds(10, 123, 548, 37);
		contentPane.add(botonOpciones);
		
		final JButton botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peticion = 2;
				panelMatriz.hide();
				matriz(panelMatriz2);
				panelMatriz2.show();
			}
		});
		botonSalir.setBounds(10, 171, 548, 37);
		contentPane.add(botonSalir);
		
		JLabel lblGuerraDeLos = new JLabel("Guerra de los Mundos");
		lblGuerraDeLos.setForeground(new Color(255, 255, 255));
		lblGuerraDeLos.setFont(new Font("Trajan Pro 3", Font.PLAIN, 26));
		lblGuerraDeLos.setBounds(122, 37, 337, 27);
		contentPane.add(lblGuerraDeLos);
		
		JLabel labelPet1 = new JLabel("Seleccione la posicion inicial");
		labelPet1.setForeground(new Color(255, 255, 255));
		labelPet1.setFont(new Font("Calibri", Font.PLAIN,17));
		labelPet1.setBounds(310, 0, 200, 100);
		panelMatriz.add(labelPet1);
		
		JLabel labelPet2 = new JLabel("de su mundo:");
		labelPet2.setForeground(new Color(255, 255, 255));
		labelPet2.setFont(new Font("Calibri", Font.PLAIN,17));
		labelPet2.setBounds(310, 15, 200, 100);
		panelMatriz.add(labelPet2);
		
		JButton botonJugar = new JButton("Jugar");
		botonJugar.setBackground(new Color(204, 255, 255));
		botonJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// AL HACER CLICK
				botonOpciones.setBounds(10,443,548,27);
				botonSalir.setBounds(10,491,548,27);
				setBounds(100, 100, 590, 571);
				
				peticion = 1;
				matriz(panelMatriz);
				panelMatriz.show();
				panelMatriz2.hide();
				panelMatriz3.hide();
				
				//botonOpciones.disable();
				//botonSalir.disable();
				
			}
		});
		botonJugar.setBounds(10, 75, 548, 37);
		contentPane.add(botonJugar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Nicolas\\Desktop\\Juego Nico\\planeta2.PNG"));
		label.setBounds(0, -16, 198, 158);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(122, 407, 191, 137);
		contentPane.add(label_1);
		label_1.setIcon(new ImageIcon("C:\\Users\\Nicolas\\Desktop\\Juego Nico\\Nave1.PNG"));
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Nicolas\\Desktop\\Juego Nico\\Planeta1.PNG"));
		label_2.setBounds(439, 11, 132, 107);
		contentPane.add(label_2);
		
		
		
		
	}
	
	
	
	public void matriz(JPanel panel)
	{
		//MATRIZ
		int columna,fila;
		for(fila = 0 ; fila < 15 ; fila++)
		{
			for(columna = 0 ; columna < 15 ; columna++)
			{
				final JButton botonAux = new JButton("");
				botonAux.setBackground(new Color(255,255,255));
				botonAux.setBounds(fila*20 ,columna*20, 20, 20);
				if(peticion == 1)
				{	
					botonAux.addMouseListener(new MouseAdapter(){
						public void mouseEntered(MouseEvent arg0) {
							botonAux.setBackground(new Color(255,36,4));
						}
					});
					botonAux.addMouseListener(new MouseAdapter(){
						public void mouseExited(MouseEvent arg0) {
							botonAux.setBackground(new Color(255,255,255));
						}
					});
				}
				if(peticion == 2)
				{	
					botonAux.addMouseListener(new MouseAdapter(){
						public void mouseEntered(MouseEvent arg0) {
							botonAux.setBackground(new Color(0,255,64));
						}
					});
					botonAux.addMouseListener(new MouseAdapter(){
						public void mouseExited(MouseEvent arg0) {
							botonAux.setBackground(new Color(255,255,255));
						}
					});
				}
				if(peticion == 3)
				{	
					botonAux.addMouseListener(new MouseAdapter(){
						public void mouseEntered(MouseEvent arg0) {
							botonAux.setBackground(new Color(35,75,176));
						}
					});
					botonAux.addMouseListener(new MouseAdapter(){
						public void mouseExited(MouseEvent arg0) {
							botonAux.setBackground(new Color(255,255,255));
						}
					});
				}
				panel.add(botonAux);
			}
		}
	}
}
