package com.UD20.ACT2.VentanaGrafica;
import javax.swing.*;

public class VentanaGrafica extends JFrame {
	
	/*
	 * Panel de la aplicación
	 */
	
	private static final String EXIT_ON_CLOSE = null;
	private JPanel contentPane;
	
	public VentanaGrafica() {
		
		//Añade un título. No es estrictamente necesario
		setTitle("Título de la ventana.");
		
		/*Coordenadas x y de la aplicación y su altura y longitud,
		 * si no lo indicamos aparecerá una ventana muy pequeña.
		 */
		
		setBounds(400, 200, 250, 300);
		
		/*
		 * Indica que cuando se cierre la ventana se acaba la aplicación, 
		 * si no lo indicamos cuando cerremos la ventana la aplicación seguirá 
		 * funcionando
		 */
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Hace visible la ventana, si no lo hacemos no veremos la aplicación 
		setVisible(true);
		
		//Creamos el panel
		contentPane = new JPanel();
		
		//Indicamos su diseño
		contentPane.setLayout(null);
		
		//Asigno el panel a la ventana
		setContentPane(contentPane);
		
		
		//Creación de componentes
		
		//Creo el componente
	
		JButton btn1 = new JButton("Botón 1");
		JButton btn2 = new JButton("Botón 2");
		
		//Colocamos el componente
		btn1.setBounds(43, 133, 89, 23);
		btn2.setBounds(43, 133, 89, 23);

		//Añadimos el elemento al panel, si no, no se verá
		contentPane.add(btn1);
		contentPane.add(btn2);
	}


}