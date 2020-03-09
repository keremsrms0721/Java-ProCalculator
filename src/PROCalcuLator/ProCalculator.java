package PROCalcuLator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;

public class ProCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton topla;
	private JButton cikar;
	private JButton carp;
	private JButton bol;
	private JButton gerisil;
	double result,value;
	int statement;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProCalculator frame = new ProCalculator();
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
	public void butonEnabled() {
		topla.setEnabled(true);
		cikar.setEnabled(true);
		carp.setEnabled(true);
		bol.setEnabled(true);
		gerisil.setEnabled(true);
	}
	public void butonDisabled() {
		topla.setEnabled(false);
		cikar.setEnabled(false);
		carp.setEnabled(false);
		bol.setEnabled(false);
	}
	public ProCalculator() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Standart Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Standart");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 120, 34);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(250, 235, 215));
		textField.setFont(new Font("Tahoma", Font.BOLD, 19));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(10, 39, 264, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton mod = new JButton("%");
		
		mod.setForeground(UIManager.getColor("TextPane.inactiveBackground"));
		mod.setFont(new Font("Tahoma", Font.BOLD, 14));
		mod.setBackground(new Color(250, 235, 215));
		mod.setBounds(10, 90, 58, 46);
		contentPane.add(mod);
		
		JButton CE = new JButton("CE");
		
		CE.setBackground(new Color(250, 235, 215));
		CE.setBounds(78, 90, 58, 46);
		contentPane.add(CE);
		
		JButton C = new JButton("C");
		C.setBackground(new Color(250, 235, 215));

		C.setBounds(148, 90, 58, 46);
		contentPane.add(C);
		
		 gerisil = new JButton("<-");
		gerisil.setBackground(new Color(250, 235, 215));

		gerisil.setBounds(216, 90, 58, 46);
		
		contentPane.add(gerisil);
		
		 bol = new JButton("/");
		bol.setBackground(new Color(250, 235, 215));
		bol.setBounds(216, 147, 58, 46);
		contentPane.add(bol);
		
		JButton xkarekok = new JButton("sqrt(x)");
		
		xkarekok.setBackground(new Color(250, 235, 215));

		xkarekok.setFont(new Font("Tahoma", Font.PLAIN, 8));
		xkarekok.setBounds(148, 147, 58, 46);
		contentPane.add(xkarekok);
		
		JButton xkare = new JButton("x*x");
		
		xkare.setForeground(new Color(0, 0, 0));
		xkare.setBackground(new Color(250, 235, 215));

		xkare.setBounds(78, 147, 58, 46);
		contentPane.add(xkare);
		
		JButton birbolux = new JButton("1/x");
		
		birbolux.setBackground(new Color(250, 235, 215));
		
		birbolux.setBounds(10, 147, 58, 46);
		contentPane.add(birbolux);
		
		 carp = new JButton("x");
		carp.setBackground(new Color(250, 235, 215));
		carp.setBounds(216, 201, 58, 46);
		contentPane.add(carp);
		
		JButton dokuz = new JButton("9");
		dokuz.setBackground(new Color(255, 248, 220));
		dokuz.setBounds(148, 201, 58, 46);
		contentPane.add(dokuz);
		
		JButton sekiz = new JButton("8");
		sekiz.setForeground(SystemColor.menuText);
		sekiz.setBackground(new Color(255, 248, 220));
		sekiz.setBounds(78, 201, 58, 46);
		contentPane.add(sekiz);
		
		JButton yedi = new JButton("7");
		yedi.setBackground(new Color(255, 248, 220));
		yedi.setBounds(10, 201, 58, 46);
		contentPane.add(yedi);
		
		 cikar = new JButton("-");
		cikar.setBackground(new Color(250, 235, 215));
		cikar.setBounds(216, 252, 58, 46);
		contentPane.add(cikar);
		
		JButton alti = new JButton("6");
		alti.setBackground(new Color(255, 248, 220));
		alti.setBounds(148, 252, 58, 46);
		contentPane.add(alti);
		
		JButton bes = new JButton("5");
		bes.setBackground(new Color(255, 248, 220));
		bes.setBounds(78, 252, 58, 46);
		contentPane.add(bes);
		
		JButton dort = new JButton("4");
		dort.setBackground(new Color(255, 248, 220));
		dort.setBounds(10, 252, 58, 46);
		contentPane.add(dort);
		
		topla = new JButton("+");
		topla.setBackground(new Color(250, 235, 215));


		topla.setBounds(216, 306, 58, 46);
		contentPane.add(topla);
		
		JButton uc = new JButton("3");
		uc.setBackground(new Color(255, 248, 220));
		uc.setBounds(148, 306, 58, 46);
		contentPane.add(uc);
		
		JButton iki = new JButton("2");
		iki.setBackground(new Color(255, 248, 220));
		iki.setBounds(78, 306, 58, 46);
		contentPane.add(iki);
		
		JButton bir = new JButton("1");
		bir.setBackground(new Color(255, 248, 220));

		bir.setBounds(10, 306, 58, 46);
		contentPane.add(bir);
		
		JButton esit = new JButton("=");
		esit.setBackground(new Color(250, 235, 215));


		esit.setBounds(148, 359, 125, 46);
		contentPane.add(esit);

		
		JButton sifir = new JButton("0");
		sifir.setBackground(new Color(255, 248, 220));
		sifir.setBounds(78, 359, 58, 46);
		contentPane.add(sifir);
		
		JButton zitcarp = new JButton("+/-");
		zitcarp.setBackground(new Color(255, 248, 220));

		zitcarp.setBounds(10, 359, 58, 46);
		contentPane.add(zitcarp);
		
		JLabel goster = new JLabel("");
		goster.setForeground(new Color(255, 255, 255));
		goster.setBounds(168, 23, 106, 14);
		contentPane.add(goster);
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {
			zitcarp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double degeral = Double.parseDouble(textField.getText());
					textField.setText(String.valueOf(degeral*(-1)));
				}
			});
			gerisil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String x2 = textField.getText().toString();
					StringBuilder x3 = new StringBuilder(x2).deleteCharAt(x2.length()-1);
					
					if(!textField.getText().isEmpty()) {
					textField.setText(x3.toString());
					}
					if(textField.getText().isEmpty()) {
						gerisil.setEnabled(false);
					}
					textField.setText("");
				}
			});
			C.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("");
				}
			});
			mod.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double al = Double.parseDouble(textField.getText());
					double deger = al/100.0;
					textField.setText(String.valueOf(deger));
				}
			});
			CE.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("");
				}
			});
			xkarekok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double x2 = Double.parseDouble(textField.getText().toString());
					textField.setText(String.valueOf(StrictMath.sqrt(x2)));
				}
			});
			xkare.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double x2 = Double.parseDouble(textField.getText().toString());
					textField.setText(String.valueOf(StrictMath.pow(x2, 2)));
				}
			});
			birbolux.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double x1 = Double.parseDouble(textField.getText().toString());
					textField.setText(Double.toString(1.0/x1));
				}
			});
		topla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = Double.parseDouble(textField.getText().toString());
				statement = 1;
				butonDisabled();
				textField.setText("");
				goster.setText(goster.getText()+"+");
			}
		});
		cikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = Double.parseDouble(textField.getText().toString());
				statement = 2;
				butonDisabled();
				textField.setText("");
				goster.setText(goster.getText()+"-");
			}
		});
		carp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = Double.parseDouble(textField.getText().toString());
				statement = 3;
				butonDisabled();
				textField.setText("");
				goster.setText(goster.getText()+"*");
			}
		});
		bol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = Double.parseDouble(textField.getText().toString());
				statement = 4;
				butonDisabled();
				textField.setText("");
				goster.setText(goster.getText()+"/");
			}
		});
		sifir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goster.setText(goster.getText()+"0");
				textField.setText(textField.getText()+"0");
				butonEnabled();
			}
		});
		bir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goster.setText(goster.getText()+"1");
				textField.setText(textField.getText()+"1");
				butonEnabled();
			}
		});
		iki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goster.setText(goster.getText()+"2");
				textField.setText(textField.getText()+"2");
				butonEnabled();
			}
		});
		uc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goster.setText(goster.getText()+"3");
				textField.setText(textField.getText()+"3");
				butonEnabled();
			}
		});
		dort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goster.setText(goster.getText()+"4");
				textField.setText(textField.getText()+"4");
				butonEnabled();
			}
		});
		bes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goster.setText(goster.getText()+"5");
				textField.setText(textField.getText()+"5");
				butonEnabled();
			}
		});
		alti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goster.setText(goster.getText()+"6");
				textField.setText(textField.getText()+"6");
				butonEnabled();
			}
		});
		yedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goster.setText(goster.getText()+"7");
				textField.setText(textField.getText()+"7");
				butonEnabled();
			}
		});
		sekiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goster.setText(goster.getText()+"8");
				textField.setText(textField.getText()+"8");
				butonEnabled();
			}
		});
		dokuz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goster.setText(goster.getText()+"9");
				textField.setText(textField.getText()+"9");
				butonEnabled();
			}
		});
		esit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sonuc();
			}
		});}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	
		
	}
	public void sonuc() {
		switch(statement) {
		case 1:
			
			result = value+Double.parseDouble(textField.getText().toString());
			textField.setText(String.valueOf(result));
			break;
		case 2:
			result = value-Double.parseDouble(textField.getText().toString());
			textField.setText(Double.toString(result));
			break;
		case 3:
			result = value*Double.parseDouble(textField.getText().toString());
			textField.setText(Double.toString(result));
			break;
		case 4:
			try {
			result = value/Double.parseDouble(textField.getText().toString());
			textField.setText(Double.toString(result));
			}catch(Exception e) {
				e.printStackTrace();
			}break;
		}
		
	}

}
