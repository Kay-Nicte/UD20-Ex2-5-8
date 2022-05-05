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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.EmptyStackException;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField tf_cantidad;
	private JTextField tf_resultado;
	private JButton btn_transformar;
	private boolean cambiar = false;

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

		tf_cantidad = new JTextField();
		tf_cantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_B:
					borrar();
					break;
				case KeyEvent.VK_C:
					invertir();
					break;
				case KeyEvent.VK_P:
					borrarUltimoCaracter();
					transformar();
					break;
				case KeyEvent.VK_E:
					borrarUltimoCaracter();
					transformar();
					break;
				default:
					break;
				}
			}
		});
		tf_cantidad.setBounds(164, 42, 60, 19);
		contentPane.add(tf_cantidad);
		tf_cantidad.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(244, 45, 78, 13);
		contentPane.add(lblNewLabel_1);

		tf_resultado = new JTextField();
		tf_resultado.setEditable(false);
		tf_resultado.setBounds(330, 42, 96, 19);
		tf_resultado.setBackground(Color.WHITE);
		contentPane.add(tf_resultado);
		tf_resultado.setColumns(10);

		// Botón para convertir
		btn_transformar = new JButton("Euros a Ptas");
		btn_transformar.setBounds(65, 91, 135, 21);
		btn_transformar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				transformar();
		
				/*
				 * if(isNumeric) {
				 * 
				 * } else{ textField_Resultado.setText("No es un número");
				 * //System.out.println(!isNumeric); }
				 */

				/*try {
					boolean isNumeric = str.matches("[+-]?\\d*(\\.\\d+)?");
					double pesetas = Double.valueOf(tf_cantidad.getText()) * 166.386;
					tf_resultado.setText(String.valueOf(pesetas));
				} catch (Exception e1) {
					tf_resultado.setText("Valor incorrecto");
				} */
			}
		});

		contentPane.add(btn_transformar);

		// Botón para cambiar de moneda
		JButton btn_invertir = new JButton("Cambiar");
		btn_invertir.setBounds(210, 91, 101, 21);
		btn_invertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				invertir();
				/*JOptionPane.showMessageDialog(null, "Modo Pesetas -> Euros");
				double euros = Double.valueOf(tf_cantidad.getText().toString()) / 166.386;
				tf_resultado.setText(String.valueOf(euros));*/
			}
		});
		contentPane.add(btn_invertir);
		contentPane.add(btn_transformar);

		// Botón para borrar el contenido
		JButton btn_borrar = new JButton("Borrar");
		btn_borrar.setBounds(330, 91, 101, 21);
		btn_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		contentPane.add(btn_borrar);
	}
	public void borrar() {
		tf_cantidad.setText("");
		tf_resultado.setText("");
		tf_cantidad.requestFocus();
	}
	public void invertir() {
		cambiar = !cambiar;
		if(cambiar) {
			btn_transformar.setText("Ptas a Euros");
		}else {
			btn_transformar.setText("Euros a Ptas");
		}
		tf_cantidad.requestFocus();
	}
	public void transformar() {
		String str = tf_cantidad.getText().toString();
		try {
			if(!cambiar) {
				tf_resultado.setText(""+(Double.parseDouble(str) * 166.386));
			}else {
				tf_resultado.setText(""+Math.round((Double.parseDouble(str) / 166.386)*100d)/100d);
			}	
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "El valor introducido no se puede tratar, porfavor introduce solo digitos.");
			System.out.println(e.getMessage());
		}
		tf_cantidad.requestFocus();
		
	}
	public void borrarUltimoCaracter() {
		int positionLastChar = (tf_cantidad.getText().toString().length()-1);
		String valor_tf_cantidad = tf_cantidad.getText().toString().substring(0,positionLastChar);
		tf_cantidad.setText(valor_tf_cantidad);
	}
}