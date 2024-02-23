package Calculos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import java.awt.Color;

public class calculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSalario;
	private JTextField txtDesconto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculos frame = new calculos();
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
	public calculos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 847);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UNIX");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel.setBounds(181, 11, 55, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Salário \r\n");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 86, 106, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Percentual de Desconto\r\n");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 183, 169, 23);
		contentPane.add(lblNewLabel_1_1);
		
		txtSalario = new JTextField();
		txtSalario.setFont(new Font("Arial", Font.BOLD, 11));
		txtSalario.setBounds(10, 113, 86, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		txtDesconto = new JTextField();
		txtDesconto.setFont(new Font("Arial Black", Font.BOLD, 11));
		txtDesconto.setBounds(10, 217, 86, 20);
		contentPane.add(txtDesconto);
		txtDesconto.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultados");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_2.setBounds(181, 464, 76, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblMensal = new JLabel("");
		lblMensal.setFont(new Font("Arial", Font.BOLD, 12));
		lblMensal.setBounds(10, 522, 415, 23);
		contentPane.add(lblMensal);
		
		JLabel lblAnual = new JLabel("");
		lblAnual.setFont(new Font("Arial", Font.BOLD, 12));
		lblAnual.setBounds(10, 556, 415, 23);
		contentPane.add(lblAnual);
		
		JLabel lblDecimo = new JLabel("");
		lblDecimo.setFont(new Font("Arial", Font.BOLD, 12));
		lblDecimo.setBounds(10, 624, 415, 23);
		contentPane.add(lblDecimo);
		
		JLabel lblFerias = new JLabel("");
		lblFerias.setFont(new Font("Arial", Font.BOLD, 12));
		lblFerias.setBounds(10, 590, 415, 23);
		contentPane.add(lblFerias);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			double salario = Double.parseDouble(txtSalario.getText());
			double percentual = Double.parseDouble(txtDesconto.getText());
			double resultado = salario-(salario/100)*percentual;
			double anual = (resultado*12);
			double decimo = (resultado);
			double ferias = (salario/3)+resultado;
			
			DecimalFormat tratamento = new DecimalFormat("#0.00");
			 
			String ResultadoF = tratamento.format(resultado);
			String AnualF = tratamento.format(anual);
			String DecimoF = tratamento.format(decimo);
			String FeriasF = tratamento.format(ferias);
			
			
			lblMensal.setText("Valor mensal:R$ "+ResultadoF);
			lblAnual.setText("Valor Anual:R$ "+AnualF);
			lblDecimo.setText("13°Salário:R$ "+DecimoF);
			lblFerias.setText("Valor das férias:R$ "+FeriasF);
			
			
			
			
			
			
			
			
			}
		});
		btnCalcular.setBackground(UIManager.getColor("info"));
		btnCalcular.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnCalcular.setBounds(151, 336, 130, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_3 = new JLabel("Dev. LK");
		lblNewLabel_3.setForeground(new Color(0, 255, 255));
		lblNewLabel_3.setBackground(SystemColor.text);
		lblNewLabel_3.setBounds(181, 28, 46, 14);
		contentPane.add(lblNewLabel_3);
	}
}
