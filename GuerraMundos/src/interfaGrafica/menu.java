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
import java.util.ArrayList;

import javax.swing.ImageIcon;



public class menu extends JFrame {

	private JPanel contentPane;
	private ArrayList<Integer> coordenadas;

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
		
		coordenadas = new ArrayList<Integer>();
		
		
		
		
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
		
		final JPanel panelFinal = new JPanel();
		panelFinal.setBounds(22, 122, 521, 310);
		panelFinal.setLayout(null);
		panelFinal.setBackground(new Color(5,0,66));
		contentPane.add(panelFinal);
		panelFinal.hide();
		
		final JButton botonIniciar = new JButton("Iniciar!");
		botonIniciar.setBounds(310, 123, 150, 37);
		panelFinal.add(botonIniciar);
		
		
		
		final JButton botonOpciones = new JButton("Ayuda");
		botonOpciones.setBounds(10, 123, 548, 37);
		botonOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mensaje ayuda
			}
		});
		contentPane.add(botonOpciones);
		
		final JButton botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
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
		
		JLabel labelPet3 = new JLabel("Seleccione la posicion de");
		labelPet3.setForeground(new Color(255, 255, 255));
		labelPet3.setFont(new Font("Calibri", Font.PLAIN,17));
		labelPet3.setBounds(310, 0, 200, 100);
		panelMatriz2.add(labelPet3);
		
		JLabel labelPet4 = new JLabel("un primer conector:");
		labelPet4.setForeground(new Color(255, 255, 255));
		labelPet4.setFont(new Font("Calibri", Font.PLAIN,17));
		labelPet4.setBounds(310, 15, 200, 100);
		panelMatriz2.add(labelPet4);
		
		JLabel labelPet5 = new JLabel("Seleccione la posicion del");
		labelPet5.setForeground(new Color(255, 255, 255));
		labelPet5.setFont(new Font("Calibri", Font.PLAIN,17));
		labelPet5.setBounds(310, 0, 200, 100);
		panelMatriz3.add(labelPet5);
		
		JLabel labelPet6 = new JLabel("primer mercado:");
		labelPet6.setForeground(new Color(255, 255, 255));
		labelPet6.setFont(new Font("Calibri", Font.PLAIN,17));
		labelPet6.setBounds(310, 15, 200, 100);
		panelMatriz3.add(labelPet6);
		
		final JButton botonJugar = new JButton("Jugar");
		botonJugar.setBackground(new Color(204, 255, 255));
		botonJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(peticion > 0 )
				{
					hide();
					menu frame2 = new menu();
					frame2.setVisible(true);
					
				}
				
				// AL HACER CLICK
				botonOpciones.setBounds(10,443,548,27);
				botonSalir.setBounds(10,491,548,27);
				setBounds(100, 100, 590, 571);
				
				botonJugar.setText("Cancelar");
				peticion = 1;
				matriz(panelMatriz,panelMatriz2,panelMatriz3,panelFinal);
				panelMatriz.show();
				panelMatriz2.hide();
				panelMatriz3.hide();
				panelFinal.hide();
					
				
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
	
	
	
	public void matriz(final JPanel panel , final JPanel panel2, final JPanel panel3, final JPanel panel4 )
	{
		//MATRIZ
		int columna;
		int fila;
		final int c;
		int f;
		final boolean click;
		for(fila = 0 ; fila < 15 ; fila++)
		{
			for(columna = 0 ; columna < 15 ; columna++)
			{
				final JButton botonAux = new JButton("");
				botonAux.setBackground(new Color(255,255,255));
				botonAux.setBounds(fila*20 ,columna*20, 20, 20);
				if(peticion == 1)
				{	
					final int columnaClickeada = columna;
					final int filaClickeada = fila;
					if(columna != 14 && fila != 14)
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
						botonAux.addMouseListener(new MouseAdapter(){
							public void mouseClicked(MouseEvent arg0) {
								peticion = 2;
								panel.hide();
								panel2.show();
								coordenadas.add(filaClickeada);
								coordenadas.add(columnaClickeada);
								coordenadas.add(filaClickeada);
								coordenadas.add(columnaClickeada+1);
								coordenadas.add(filaClickeada+1);
								coordenadas.add(columnaClickeada);
								coordenadas.add(filaClickeada+1);
								coordenadas.add(columnaClickeada+1);
								matriz(panel,panel2,panel3,panel4);	
							}
						});
						
						
					}
					panel.add(botonAux);
				}
				if(peticion == 2)
				{	
					if((columna == coordenadas.get(1) && fila == coordenadas.get(0)) || (columna == coordenadas.get(7) && fila == coordenadas.get(6)) || (columna == coordenadas.get(5) && fila == coordenadas.get(4)) || (columna == coordenadas.get(3) && fila == coordenadas.get(2)))
						botonAux.setBackground(new Color(255,36,4));
					else
					{
						if(validarPuente(fila,columna))
						{
							final int columnaClickeada = columna;
							final int filaClickeada = fila;
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
							botonAux.addMouseListener(new MouseAdapter(){
								public void mouseClicked(MouseEvent arg0) {
									peticion = 3;
									panel2.hide();
									panel3.show();
									coordenadas.add(filaClickeada);
									coordenadas.add(columnaClickeada);
									matriz(panel,panel2,panel3,panel4);
									
								}
							});
						}
					}
					panel2.add(botonAux);
				}
				if(peticion == 3)
				{	
					if((columna == coordenadas.get(1) && fila == coordenadas.get(0)) || (columna == coordenadas.get(7) && fila == coordenadas.get(6)) || (columna == coordenadas.get(5) && fila == coordenadas.get(4)) || (columna == coordenadas.get(3) && fila == coordenadas.get(2)))
						botonAux.setBackground(new Color(255,36,4));
					else
					{
						if(columna == coordenadas.get(9) && fila == coordenadas.get(8))
							botonAux.setBackground(new Color(0,255,64));
						else
						{
							if(validarMercado(fila,columna))
							{
								final int columnaClickeada = columna;
								final int filaClickeada = fila;
								botonAux.addMouseListener(new MouseAdapter(){
									public void mouseClicked(MouseEvent arg0) {
										peticion = 4;
										panel3.hide();
										panel4.show();
										coordenadas.add(filaClickeada);
										coordenadas.add(columnaClickeada);
										buscarRestoMercado();
										matriz(panel,panel2,panel3,panel4);
										
									}
								});
								botonAux.addMouseListener(new MouseAdapter(){
									public void mouseEntered(MouseEvent arg0) {
										botonAux.setBackground(new Color(63,72,204));
									}
								});
								botonAux.addMouseListener(new MouseAdapter(){
									public void mouseExited(MouseEvent arg0) {
										botonAux.setBackground(new Color(255,255,255));
									}
								});
							}
						}
					}
					panel3.add(botonAux);
				}
				if(peticion == 4)
				{	
					if((columna == coordenadas.get(1) && fila == coordenadas.get(0)) || (columna == coordenadas.get(7) && fila == coordenadas.get(6)) || (columna == coordenadas.get(5) && fila == coordenadas.get(4)) || (columna == coordenadas.get(3) && fila == coordenadas.get(2)))
						botonAux.setBackground(new Color(255,36,4));
					else
					{
						if(columna == coordenadas.get(9) && fila == coordenadas.get(8))
							botonAux.setBackground(new Color(0,255,64));
						else
						{
							if(columna==coordenadas.get(13) && fila==coordenadas.get(12) || columna==coordenadas.get(11) && fila==coordenadas.get(10))
								botonAux.setBackground(new Color(63,72,204));
						}
					
					}
					panel4.add(botonAux);
				}
				
			}
		}
	}
	
	
	public boolean validarPuente(int fila, int columna)
	{
		boolean validez = false;
		if(fila==coordenadas.get(0) || fila==coordenadas.get(2) || fila==coordenadas.get(4) || fila==coordenadas.get(6))
		{
			if(columna==coordenadas.get(1)-1 || columna==coordenadas.get(3)+1 || columna==coordenadas.get(5)-1 || columna==coordenadas.get(7)+1)
				validez = true;
		}
		if(columna==coordenadas.get(1) || columna==coordenadas.get(3) || columna==coordenadas.get(5) || columna==coordenadas.get(7))
		{
			if(fila==coordenadas.get(0)-1 || fila==coordenadas.get(4)+1 || fila==coordenadas.get(2)-1 || fila==coordenadas.get(6)+1)
				validez = true;
		}
		return validez;
	}
	
	public boolean validarMercado(int fila, int columna)
	{
		boolean validez = false;
		if(fila==coordenadas.get(8))
		{
			if(columna==coordenadas.get(9)+1 || columna==coordenadas.get(9)-1)
				validez = true;
		}
		if(columna==coordenadas.get(9))
		{
			if(fila==coordenadas.get(8)+1 || fila==coordenadas.get(8)-1)
				validez = true;
		}
		return validez;
	}
	
	public void buscarRestoMercado()
	{
		int mercadoFila = coordenadas.get(10);
		int mercadoColumna = coordenadas.get(11);
		
		int f1,f2,f3,f4, c1,c2,c3,c4;
		f1 = mercadoFila;
		c1 = mercadoColumna + 1;
		f2 = f1 - 1;
		c2 = c1 - 1;
		f3 = f1;
		c3 = c1 - 2;
		f4 = f1 + 1;
		c4 = c2;
		
		int c ,f;
		int[][] pareja = {{f1,c1},{f2,c2},{f3,c3},{f4,c4}} ;
		int[] parAux ; 
		
		int i;
		for(i = 0 ; i < 4 ; i++)
		{
			
			parAux = pareja[i];
			f = parAux[0];
			c = parAux[1];
			System.out.println(f);
			System.out.println(c);
			if(! ( (f==coordenadas.get(0) && c==coordenadas.get(1)) || (f==coordenadas.get(2) && c==coordenadas.get(3)) || (f==coordenadas.get(4) && c==coordenadas.get(5)) || (f==coordenadas.get(6) && c==coordenadas.get(7)) || (f==coordenadas.get(8) && c==coordenadas.get(9)) ))
			{
				coordenadas.add(f);
				coordenadas.add(c);
				//break;
			}
		}
		
	}
	
}
