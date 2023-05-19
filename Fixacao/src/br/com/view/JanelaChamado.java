package br.com.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.DAO.CRUDChamado;
import br.com.dominio.Chamado;

public class JanelaChamado extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDepartamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaChamado frame = new JanelaChamado();
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
	public JanelaChamado() {
		setTitle("Sistema de Suporte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Preencha todos os campos para efetuar um chamado ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(216, 11, 393, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira seu nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(216, 73, 142, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(216, 98, 273, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Informe com qual departamento deseja falar:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(216, 139, 283, 20);
		contentPane.add(lblNewLabel_1_1);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setBounds(216, 170, 273, 20);
		contentPane.add(txtDepartamento);
		txtDepartamento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Conte-nos mais sobre seu problema:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(216, 225, 273, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtDescricao = new JTextArea();
		txtDescricao.setBounds(216, 250, 409, 128);
		contentPane.add(txtDescricao);
		
		JButton btnNewButton = new JButton("Registrar Chamado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CRUDChamado cc = new CRUDChamado();
				
				Chamado soliChamado = new Chamado(); 
				if(txtNome.getText().trim().equals("") || 
						txtDepartamento.getText().trim().equals("") || 
						txtDescricao.getText().trim().equals("")) { 
						 JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.", "Erro 4000765x" , JOptionPane.ERROR_MESSAGE); 
						} 
						else { 
						 
						soliChamado.setSolicitacao(txtNome.getText()); 
						 
						soliChamado.setDepSolicitado(txtDepartamento.getText()); 
						 
						soliChamado.setDescChamado(txtDescricao.getText()); 
						 
						 JOptionPane.showMessageDialog(null, cc.registrar(soliChamado)); 
					}
			}
		});
		btnNewButton.setBounds(10, 161, 162, 39);
		contentPane.add(btnNewButton);
	}
	
}

