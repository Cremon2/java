/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chem4;

/**
 *
 * @author sheilo roxas
 */
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;
public class Chem4 {

	public static void main(String[] args) throws MalformedURLException {
		 JFrame frame = new JFrame ("GRADING SYSTEM");
	        JPanel panel = new JPanel ();
	        panel.setLayout(null);
	        JLabel label1 = new JLabel("WANBOL UNIVERSITY");
	        JLabel tittle = new JLabel ("<< GRADING SYSTEM >>");
	        JLabel Q1 = new JLabel ("Quiz No.1:");
	        JTextField f1 = new JTextField( );
	        JLabel Q2 = new JLabel ("Quiz No.2:");
	        JTextField f2 = new JTextField();
	        JLabel Q3 = new JLabel ("Quiz No.3:");
	        JTextField f3 = new JTextField();
	        JLabel PE = new JLabel ("Prelim Exam:");
	        JTextField f4 = new JTextField();
	        JLabel ME = new JLabel ("Midterm Exam:");
	        JTextField f5 = new JTextField();
	        JLabel FE = new JLabel ("Final Exam:");
	        JTextField f6 = new JTextField();
	        JLabel AQ = new JLabel ("Average Quiz:");
	        JTextField f7 = new JTextField();
	        JLabel FG = new JLabel ("Final Grade:");
	        JTextField f8 = new JTextField();
	        JLabel TG = new JLabel ("Transmuted Grade:");
	        JTextField f9 = new JTextField();
	        JLabel R = new JLabel ("Remarks:");
	        JTextField f10 = new JTextField();
	        JButton b1 = new JButton("Compute");
	        JButton b2 = new JButton("Clear");
	        JButton b3 = new JButton("Exit");
	        
	        label1.setBounds(310, 30, 335, 40);
	        label1.setFont(new Font("Times New Roman", Font.BOLD, 25));
	        label1.setForeground(Color.black);
	        tittle.setBounds(295, 60, 300, 40);
	        tittle.setFont(new Font("Times New Roman", Font.BOLD, 24));
	        tittle.setForeground(Color.black);
	        Q1.setBounds(100, 100, 100, 40);
	        Q1.setFont (new Font("Arial", Font.BOLD, 18));
	        Q1.setForeground(Color.black);
	        f1.setBounds(200, 110, 100, 25);
	        Q2.setBounds(100, 140, 100, 40);
	        Q2.setFont (new Font("Arial", Font.BOLD, 18));
	        Q2.setForeground(Color.black);
	        f2.setBounds (200, 150, 100, 25);
	        Q3.setBounds(100, 180, 100, 40);
	        Q3.setFont (new Font("Arial", Font.BOLD, 18));
	        Q3.setForeground(Color.black);
	        f3.setBounds (200, 190, 100, 25);
	        PE.setBounds(600, 100, 120, 40);
	        PE.setFont (new Font("Arial", Font.BOLD, 18));
	        PE.setForeground(Color.black);
	        f4.setBounds (735, 110, 100, 25);
	        ME.setBounds(600, 140, 140, 40);
	        ME.setFont (new Font("Arial", Font.BOLD, 18));
	        ME.setForeground(Color.black);
	        f5.setBounds (735, 150, 100, 25);
	        FE.setBounds(600, 180, 130, 40);
	        FE.setFont (new Font("Arial", Font.BOLD, 18));
	        FE.setForeground(Color.black);
	        f6.setBounds (735, 190, 100, 25);
	        AQ.setBounds(100, 250, 135, 40);
	        AQ.setFont (new Font("Arial", Font.BOLD, 18));
	        AQ.setForeground(Color.black);
	        f7.setBounds (240, 260, 100, 25);
	        FG.setBounds(100, 290, 135, 40);
	        FG.setFont (new Font("Arial", Font.BOLD, 18));
	        FG.setForeground(Color.black);
	        f8.setBounds (240, 300, 100, 25);
	        TG.setBounds(550, 290, 170, 40);
	        TG.setFont (new Font("Arial", Font.BOLD, 18));
	        TG.setForeground(Color.black);
	        f9.setBounds (735, 300, 100, 25);
	        R.setBounds(320, 330, 100, 40);
	        R.setFont (new Font("Arial", Font.BOLD, 18));
	        R.setForeground(Color.black);
	        f10.setBounds (420, 340, 200, 25);
	        b1.setBounds(250, 400, 120, 25);
	        b1.setFont (new Font("Arial", Font.BOLD, 18));
	        b2.setBounds(400, 400, 100, 25);
	        b2.setFont (new Font("Arial", Font.BOLD, 18));
	        b3.setBounds(530, 400, 100, 25);
	        b3.setFont (new Font("Arial", Font.BOLD, 18));
	        
	        frame.setVisible(true);
	        frame.setSize(900,550);
	        frame.setLocationRelativeTo(null);
	        frame.add(panel);
	        
	        panel.setBorder(BorderFactory.createMatteBorder(
	                20, 20, 20, 20, Color.black));
	        panel.setBackground(Color.white);   
	        panel.add(label1);
	        panel.add(tittle);
	        panel.add(Q1);
	        panel.add(Q2);
	        panel.add(Q3);
	        panel.add(PE);
	        panel.add(ME);
	        panel.add(FE);
	        panel.add(AQ);
	        panel.add(FG);
	        panel.add(TG);
	        panel.add(R);
	        panel.add(b1);
	        panel.add(b2);
	        panel.add(b3);
	        panel.add(f1);
	        panel.add(f2);
	        panel.add(f3);
	        panel.add(f4);
	        panel.add(f5);
	        panel.add(f6);
	        panel.add(f7);
	        panel.add(f8);
	        panel.add(f9);
	        panel.add(f10);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        b1.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ex){
	                String snum1 = f1.getText();
	                int num1 = Integer.parseInt(snum1);    
	        b1.addActionListener(new ActionListener(){
	                    public void actionPerformed(ActionEvent ex){
	                        String snum1 = f1.getText();
	                        int num1 = Integer.parseInt(snum1);
	                        String snum2 = f2.getText();
	                        int num2 = Integer.parseInt(snum2);
	                        String snum3 = f3.getText();
	                        int num3 = Integer.parseInt(snum3);
	                        int sum = ((num1 + num2 + num3) / 3);
	                        String ssum = String.valueOf(sum);
	                        f7.setText(ssum);
	                        String snum4 = f4.getText();
	                        int num4 = Integer.parseInt(snum4);
	                        String snum5 = f5.getText();
	                        int num5 = Integer.parseInt(snum5);
                                String snum6 = f6.getText();
	                        int num6 = Integer.parseInt(snum6);
	                        int fg = (int) ((0.1*num4)+(0.2*num5)+(0.4*num6)+(0.3*sum));
	                        String sfg = String.valueOf(fg);
	                        f8.setText(sfg);
	                        
	                        if (fg <= 74) 
	                        {
	                            f9.setText("Failed!");
	                            f10.setText("5.0");
	                            
	                        }
	                        else if (fg >=75 && fg <= 80){
	                                f9.setText("Passed!");
	                                f10.setText("3.0");
	                                
	                        }
	                            else if (fg >=81 && fg <= 84){
	                                f9.setText("High Passed!");
	                                f10.setText("2.75");
	                                    
	                        }
	                            else if (fg >=85 && fg <= 88){
	                                f9.setText("2.50");
	                                f10.setText("Satisfactory!");
	                                        
	                        }
	                            else if (fg >=89 && fg <= 91){
	                                f9.setText("2.0");
	                                f10.setText("Very Satisfactory!");
	                        
	                        }
	                            else if (fg >=92 && fg <= 95){
	                                f9.setText("1.75");
	                                f10.setText("Good!");
	                                            
	                        }
	                            else if (fg >=96 && fg <= 99){
	                                f9.setText("1.50");
	                                f10.setText("Very Good!");
	                                               
	                        }
	                            else if (fg == 100){
	                                f9.setText("1.0");
	                                f10.setText("Excellent!");
	                            }
	                    }
	                    private void setText(String failed) {
	                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	                    }
	                });
	        b2.addActionListener(new ActionListener() {
                public void actionPerformed (ActionEvent ex){
                    
                    f1.setText(null);
                    f2.setText(null);
                    f3.setText(null);
                    f4.setText(null);
                    f5.setText(null);
                    f6.setText(null);
                    f7.setText(null);
                    f8.setText(null);
                    f9.setText(null);
                    f10.setText(null);
                }    
            });
            
            b3.addActionListener(new ActionListener (){
                public void actionPerformed(ActionEvent ex){  
                    System.exit(0);
                }
                
            });

	            }
	        });
	}}