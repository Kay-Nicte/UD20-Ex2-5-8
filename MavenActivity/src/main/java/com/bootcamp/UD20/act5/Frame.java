package com.bootcamp.UD20.act5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;

public class Frame extends JFrame  {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel textArea;

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

		textArea = new JLabel();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText("El ratón se ha clicado.");
			}
			@Override
			public void mouseEntered(MouseEvent e) {

				textArea.setText("El ratón ha entrado.");
			}

			@Override
			public void mouseExited(MouseEvent e) {

				textArea.setText("El ratón ha salido.");
			}
		});
		textArea.setText("Label");
		textArea.setBounds(54, 86, 335, 115);
		contentPane.add(textArea);

		btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}

		});
		btnNewButton.setBounds(172, 34, 89, 23);
		contentPane.add(btnNewButton);

	}
}