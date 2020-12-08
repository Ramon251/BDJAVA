import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnome;
	private JTextField textFieldCPF;
	private JTextField textFieldtelefone;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
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
	public Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton BTadd = new JToggleButton("Adicionar");
		BTadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
					
				
			}
		});
		BTadd.setBounds(48, 366, 121, 23);
		contentPane.add(BTadd);
		
		JButton BTexcluir = new JButton("Excluir");
		BTexcluir.setBounds(446, 366, 121, 23);
		contentPane.add(BTexcluir);
		
		JButton BTeditar = new JButton("Editar");
		BTeditar.setBounds(259, 366, 121, 23);
		contentPane.add(BTeditar);
		
		JLabel lbnome = new JLabel("Nome:");
		lbnome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbnome.setBounds(53, 58, 71, 35);
		contentPane.add(lbnome);
		
		JLabel lbcpf = new JLabel("CPF:");
		lbcpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbcpf.setBounds(53, 121, 46, 35);
		contentPane.add(lbcpf);
		
		JLabel lbtel = new JLabel("Telefone:");
		lbtel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbtel.setBounds(53, 189, 71, 29);
		contentPane.add(lbtel);
		
		textFieldnome = new JTextField();
		textFieldnome.setBounds(123, 67, 241, 20);
		contentPane.add(textFieldnome);
		textFieldnome.setColumns(10);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(123, 130, 241, 20);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		textFieldtelefone = new JTextField();
		textFieldtelefone.setBounds(123, 195, 241, 20);
		contentPane.add(textFieldtelefone);
		textFieldtelefone.setColumns(10);
		
		JLabel lbcod = new JLabel("C\u00F3digo:");
		lbcod.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbcod.setBounds(53, 257, 71, 19);
		contentPane.add(lbcod);
		
		textField = new JTextField();
		textField.setBounds(123, 256, 241, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbcid = new JLabel("Cidade:");
		lbcid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbcid.setBounds(48, 309, 61, 23);
		contentPane.add(lbcid);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 299, 241, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
	
		
		
	}

