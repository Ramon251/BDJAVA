import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Produto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnome;
	private JTextField textFieldcod;
	private JTextField textFieldvalor;
	private JTextField textFieldfornecedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produto frame = new Produto();
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
	public Produto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(36, 41, 100, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(36, 120, 100, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(36, 190, 100, 41);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fornecedor:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(36, 265, 100, 41);
		contentPane.add(lblNewLabel_3);
		
		textFieldnome = new JTextField();
		textFieldnome.setBounds(146, 53, 198, 20);
		contentPane.add(textFieldnome);
		textFieldnome.setColumns(10);
		
		textFieldcod = new JTextField();
		textFieldcod.setBounds(146, 132, 198, 20);
		contentPane.add(textFieldcod);
		textFieldcod.setColumns(10);
		
		textFieldvalor = new JTextField();
		textFieldvalor.setBounds(146, 202, 198, 20);
		contentPane.add(textFieldvalor);
		textFieldvalor.setColumns(10);
		
		textFieldfornecedor = new JTextField();
		textFieldfornecedor.setBounds(146, 277, 198, 20);
		contentPane.add(textFieldfornecedor);
		textFieldfornecedor.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(36, 399, 115, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar Dados");
		btnNewButton_1.setBounds(210, 399, 115, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setBounds(407, 399, 115, 23);
		contentPane.add(btnNewButton_2);
	}

}
