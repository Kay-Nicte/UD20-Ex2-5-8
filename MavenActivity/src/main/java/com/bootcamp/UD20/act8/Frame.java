package com.bootcamp.UD20.act8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Cantidad;
	private JTextField textField_Resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(32, 46, 122, 13);
		contentPane.add(lblNewLabel);

		textField_Cantidad = new JTextField();
		textField_Cantidad.setBounds(164, 42, 60, 19);
		contentPane.add(textField_Cantidad);
		textField_Cantidad.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(244, 45, 78, 13);
		contentPane.add(lblNewLabel_1);

		textField_Resultado = new JTextField();
		textField_Resultado.setBounds(330, 42, 96, 19);
		textField_Resultado.setBackground(Color.WHITE);
		contentPane.add(textField_Resultado);
		textField_Resultado.setColumns(10);

		// Botón para convertir
		JButton btnNewButton = new JButton("Euros a ptas");
		btnNewButton.setBounds(65, 91, 135, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String str = String.valueOf(textField_Cantidad.getText());

				/*
				 * if(isNumeric) {
				 * 
				 * } else{ textField_Resultado.setText("No es un número");
				 * //System.out.println(!isNumeric); }
				 */

				try {
					boolean isNumeric = str.matches("[+-]?\\d*(\\.\\d+)?");
					double pesetas = Double.valueOf(textField_Cantidad.getText()) * 166.386;
					textField_Resultado.setText(String.valueOf(pesetas));
				} catch (Exception e1) {
					textField_Resultado.setText("Valor incorrecto");
				} 
			}
		});

		contentPane.add(btnNewButton);

		// Botón para cambiar de moneda
		JButton btnNewButton_1 = new JButton("Cambiar");
		btnNewButton_1.setBounds(210, 91, 101, 21);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Modo Pesetas -> Euros");
				double euros = Double.valueOf(textField_Cantidad.getText().toString()) / 166.386;
				textField_Resultado.setText(String.valueOf(euros));

			}
		});

		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);

		// Botón para borrar el contenido
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setBounds(330, 91, 101, 21);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField_Cantidad.setText("");
				textField_Resultado.setText("");

			}
		});
		contentPane.add(btnNewButton_2);
	}
}