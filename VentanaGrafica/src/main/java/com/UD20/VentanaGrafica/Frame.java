package com.UD20.VentanaGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Frame extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(24, 11, 400, 239);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(24, 74, 158, 14);
		panel.add(lblNewLabel);

		JButton btnNewButton1 = new JButton("Botón1");
		btnNewButton1.setBounds(191, 70, 92, 23);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Has clicado el Botón 1");
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton1);

		JButton btnNewButton2 = new JButton("Botón2");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Has clicado el Botón 2");
			}
		});
		btnNewButton2.setBounds(293, 70, 97, 23);
		panel.add(btnNewButton2);

	}
}
