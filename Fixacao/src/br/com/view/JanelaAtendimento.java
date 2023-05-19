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

public class JanelaAtendimento extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtStatus;
	private JTextField txtDataResolucao;
	private JTextField txtResponsavel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaAtendimento frame = new JanelaAtendimento();
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
	public JanelaAtendimento() {
		setTitle("Sistema de Suporte - Atendente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID do Chamado:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(234, 36, 90, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdDoChamado = new JLabel(" Status do Chamado:");
		lblIdDoChamado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdDoChamado.setBounds(418, 36, 121, 14);
		contentPane.add(lblIdDoChamado);
		
		txtID = new JTextField();
		txtID.setBounds(196, 61, 160, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtStatus = new JTextField();
		txtStatus.setBounds(394, 61, 173, 20);
		contentPane.add(txtStatus);
		txtStatus.setColumns(10);
		
		JLabel lblDataDeResoluo = new JLabel("Data de resolução do Chamado:");
		lblDataDeResoluo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataDeResoluo.setBounds(196, 119, 211, 14);
		contentPane.add(lblDataDeResoluo);
		
		txtDataResolucao = new JTextField();
		txtDataResolucao.setBounds(196, 151, 160, 20);
		contentPane.add(txtDataResolucao);
		txtDataResolucao.setColumns(10);
		
		JLabel lblResponsavelDoChamado = new JLabel("Responsavel do Chamado:");
		lblResponsavelDoChamado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResponsavelDoChamado.setBounds(400, 119, 154, 14);
		contentPane.add(lblResponsavelDoChamado);
		
		txtResponsavel = new JTextField();
		txtResponsavel.setBounds(394, 151, 173, 20);
		contentPane.add(txtResponsavel);
		txtResponsavel.setColumns(10);
		
		JLabel lblObservaes = new JLabel("Observações");
		lblObservaes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblObservaes.setBounds(332, 208, 90, 14);
		contentPane.add(lblObservaes);
		
		JTextArea txtObservacoes = new JTextArea();
		txtObservacoes.setBounds(182, 233, 423, 160);
		contentPane.add(txtObservacoes);
		
		JButton btnNewButton = new JButton("Atualizar Chamados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CRUDChamado cc = new CRUDChamado();
				
				Chamado cr = new Chamado(); 
				 
				if(txtResponsavel.getText().trim().equals("") || txtStatus.getText().trim().equals("") || 
						txtID.getText().trim().equals("") || txtDataResolucao.getText().trim().equals("")) {
				 JOptionPane.showMessageDialog(null, "Os campos Responsável Chamado, Id do Chamado, Status do Chamado e Data de Resolução devem ser preenchidos", "Erro 4000765x" , JOptionPane.ERROR_MESSAGE);
				
				 
				} 
				else { 
				 
				 cr.setDataResolucao(txtDataResolucao.getText()); 
				cr.setStatusChamado(txtStatus.getText()); 
				cr.setAtendente(txtResponsavel.getText()); 
				cr.setObservacoes(txtObservacoes.getText()); 
				cr.setIdChamado(Long.parseLong(txtID.getText())); 
				 JOptionPane.showMessageDialog(null, cc.atualizar(cr)); 
				 
				} 

			}
		});
		btnNewButton.setBounds(26, 89, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir Chamados");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CRUDChamado cc = new CRUDChamado();
				
				if(txtID.equals(null)) { 
					JOptionPane.showMessageDialog(null,"Selecione o chamado a ser excluído.","Erro 4000770x",JOptionPane.ERROR_MESSAGE); 
					} 
					else { 
					if(JOptionPane.showConfirmDialog(null, "Você tem certeza desta ação? \nEstá ação é permanente "+ "e não pode ser desfeita", "ATENÇÃO", JOptionPane.YES_NO_OPTION, 
					 JOptionPane.QUESTION_MESSAGE) == 0) { 
					Chamado cr = new Chamado(); 
					cr.setIdChamado(Long.parseLong(txtID.getText())
							); 
					JOptionPane.showConfirmDialog(null, cc.apagar(cr)); 
					} 

					}
			}
		});
		btnNewButton_1.setBounds(26, 150, 127, 23);
		contentPane.add(btnNewButton_1);
	}

}
