import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnunfun;
	private JTextField textFieldtelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
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
	public Funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(35, 67, 63, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00B0 do funcion\u00E1rio:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(35, 156, 136, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(35, 265, 136, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton BTadd = new JButton("Adicionar");
		BTadd.setBounds(50, 352, 121, 23);
		contentPane.add(BTadd);
		
		JButton btnNewButton_1 = new JButton("Alterar Dados");
		btnNewButton_1.setBounds(281, 352, 121, 23);
		contentPane.add(btnNewButton_1);
		
		JButton BTexcluir = new JButton("Excluir");
		BTexcluir.setBounds(474, 352, 121, 23);
		contentPane.add(BTexcluir);
		
		JTextArea textAreanome = new JTextArea();
		textAreanome.setBounds(148, 73, 245, 22);
		contentPane.add(textAreanome);
		
		textFieldnunfun = new JTextField();
		textFieldnunfun.setBounds(148, 169, 245, 20);
		contentPane.add(textFieldnunfun);
		textFieldnunfun.setColumns(10);
		
		textFieldtelefone = new JTextField();
		textFieldtelefone.setBounds(148, 264, 245, 20);
		contentPane.add(textFieldtelefone);
		textFieldtelefone.setColumns(10);
	}
}
