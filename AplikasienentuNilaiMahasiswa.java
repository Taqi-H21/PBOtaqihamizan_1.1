import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AplikasienentuNilaiMahasiswa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField theName;
	private JTextField textField_work;
	private JTextField textField_mid;
	private JTextField textField_fin;
	private JLabel nameLable;
    private JLabel average;
    private JLabel grades;
    private JLabel well;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplikasienentuNilaiMahasiswa frame = new AplikasienentuNilaiMahasiswa();
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
	public AplikasienentuNilaiMahasiswa() {
		setTitle("AplikasiPenentuNilaiMahasiswa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fullname = new JLabel(" Nama Lengkap");
		fullname.setFont(new Font("Tahoma", Font.BOLD, 11));
		fullname.setForeground(new Color(255, 255, 255));
		fullname.setBackground(new Color(255, 128, 128));
		fullname.setBounds(56, 21, 323, 45);
		contentPane.add(fullname);
		
		theName = new JTextField();
		theName.setBounds(146, 33, 215, 20);
		contentPane.add(theName);
		theName.setColumns(10);
		
		JLabel point = new JLabel(" Nilai");
		point.setBackground(new Color(0, 0, 0));
		point.setFont(new Font("Tahoma", Font.BOLD, 11));
		point.setForeground(new Color(255, 255, 255));
		point.setBounds(56, 77, 46, 14);
		contentPane.add(point);
		
		JLabel homework = new JLabel("Tugas");
		homework.setFont(new Font("Tahoma", Font.BOLD, 11));
		homework.setForeground(new Color(255, 255, 255));
		homework.setBounds(56, 110, 46, 14);
		contentPane.add(homework);
		
		JLabel mid = new JLabel("UTS");
		mid.setFont(new Font("Tahoma", Font.BOLD, 11));
		mid.setForeground(new Color(255, 255, 255));
		mid.setBounds(56, 147, 46, 14);
		contentPane.add(mid);
		
		JLabel fin = new JLabel("UAS");
		fin.setFont(new Font("Tahoma", Font.BOLD, 11));
		fin.setForeground(new Color(255, 255, 255));
		fin.setBounds(56, 185, 46, 14);
		contentPane.add(fin);
		
		JLabel result = new JLabel(" Hasil");
		result.setBackground(new Color(0, 0, 0));
		result.setFont(new Font("Tahoma", Font.BOLD, 11));
		result.setForeground(new Color(255, 255, 255));
		result.setBounds(193, 77, 168, 14);
		contentPane.add(result);
		
		nameLable = new JLabel("Nama");
		nameLable.setFont(new Font("Tahoma", Font.BOLD, 11));
		nameLable.setForeground(new Color(255, 255, 255));
		nameLable.setBounds(193, 110, 168, 14);
		contentPane.add(nameLable);
		
		average = new JLabel("Nilai Rata-rata");
		average.setFont(new Font("Tahoma", Font.BOLD, 11));
		average.setForeground(new Color(255, 255, 255));
		average.setBounds(193, 135, 168, 14);
		contentPane.add(average);
		
		grades = new JLabel("Grade");
		grades.setFont(new Font("Tahoma", Font.BOLD, 11));
		grades.setForeground(new Color(255, 255, 255));
		grades.setBounds(193, 160, 168, 14);
		contentPane.add(grades);
		
		well = new JLabel("Hasil");
		well.setFont(new Font("Tahoma", Font.BOLD, 11));
		well.setForeground(new Color(255, 255, 255));
		well.setBounds(193, 185, 168, 14);
		contentPane.add(well);
		
		JButton count = new JButton("Hitung");
		count.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float work, midterm, finterm, ave;
				String name, grad, asa;
				try {					
					work = Float.parseFloat(textField_work.getText());
					midterm = Float.parseFloat(textField_mid.getText());
					finterm = Float.parseFloat(textField_fin.getText());
					ave = (work + midterm + finterm) / 3;
					average.setText(Float.toString(ave));
					name = theName.getText();
					nameLable.setText("Nama: " + name);
					average.setText("Nilai Rata-rata; " + String.format("%.2f", ave));
					if (ave >= 90) {grad = "A";asa = "LULUS";}
					else if (ave >= 80) {grad = "B";asa = "LULUS";}
					else if (ave >= 70) {grad = "C";asa = "LULUS";}
					else if (ave >= 60) {grad = "D";asa = "LULUS";}
					else if (ave >= 40) {grad = "E";asa = "LULUS";}
					else {grad = "F";asa = "TIDAK LULUS";}
					grades.setText("Grade: " + grad);
					well.setText("Hasil: " + asa);
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Input tidak valid", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Terjadi kesalahan", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		count.setBounds(35, 222, 114, 23);
		contentPane.add(count);
		 
		JButton exit = new JButton("Keluar"); 
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(274, 222, 114, 23);
		contentPane.add(exit);
		
		JButton clear = new JButton("Bersihkan");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theName.setText("");
				textField_work.setText("");
				textField_mid.setText("");
				textField_fin.setText("");
				nameLable.setText("Nama");
				average.setText("Nilai rata-rata");
				grades.setText("Grade");
				well.setText("Hasil");
			}
		});
		clear.setBounds(154, 222, 114, 23);
		contentPane.add(clear);
		
		textField_work = new JTextField();
		textField_work.setBounds(114, 107, 43, 20);
		contentPane.add(textField_work);
		textField_work.setColumns(10);
		
		textField_mid = new JTextField();
		textField_mid.setColumns(10);
		textField_mid.setBounds(114, 145, 43, 20);
		contentPane.add(textField_mid);
		
		textField_fin = new JTextField();
		textField_fin.setColumns(10);
		textField_fin.setBounds(114, 182, 43, 20);
		contentPane.add(textField_fin);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 128));
		panel.setBounds(35, 21, 353, 45);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 128));
		panel_1.setBounds(35, 64, 139, 147);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 255, 255));
		panel_2.setBounds(173, 64, 215, 147);
		contentPane.add(panel_2);

	}
}
