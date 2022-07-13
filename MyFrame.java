import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame{

    // Color.decode("#494F55")
    Font myFont = new Font(Font.MONOSPACED,Font.BOLD,   20);
    Color bgFrameColor = Color.decode("#413839");
    Color bgButtonColor = Color.decode("#3B3C36");
    Color bgTextFieldColor = Color.decode("#FFFAFA");
    Color textColor = Color.white;

    JTextField textField;

    Double var1 = 0.0;
    Double var2 = 0.0;
    char operator;
    boolean switchOperator = true;
    boolean switchEquals = true;

    

    public MyFrame(){
        this.setSize(465, 480);

        textField = new JTextField();
        textField.setBounds(20, 50, 415, 70);
        textField.setBackground(bgTextFieldColor);
        textField.setForeground(Color.decode("#494F55"));
        textField.setFont(new Font(Font.MONOSPACED,Font.BOLD,   25));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        JButton button9 = new JButton("9");
        button9.setBounds(20, 150, 100, 50);
        button9.setFont(myFont);
        button9.setFocusPainted(false);
        button9.setBackground(bgButtonColor);
        button9.setForeground(textColor);
        button9.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + "9";
                textField.setText(content);
            }
        });


        JButton button8 = new JButton("8");
        button8.setBounds(125, 150, 100, 50);
        button8.setFont(myFont);
        button8.setFocusPainted(false);
        button8.setBackground(bgButtonColor);
        button8.setForeground(textColor);
        button8.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + "8";
                textField.setText(content);
            }
        });

        JButton button7 = new JButton("7");
        button7.setBounds(230, 150, 100, 50);
        button7.setFont(myFont);
        button7.setFocusPainted(false);
        button7.setBackground(bgButtonColor);
        button7.setForeground(textColor);
        button7.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + "7";
                textField.setText(content);
            }
        });

        JButton buttonAdd = new JButton("+");
        buttonAdd.setBounds(335, 150, 100, 50);
        buttonAdd.setFont(myFont);
        buttonAdd.setFocusPainted(false);
        buttonAdd.setBackground(bgButtonColor);
        buttonAdd.setForeground(textColor);
        buttonAdd.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("") && !textField.getText().equals("unable to divide by zero")) {
                    
                    if(var1 == 0 || switchOperator == false) { 
                        var1 = Double.valueOf(textField.getText());
                        switchOperator = true; 
                    } else {
                        checkOperator();
                    }
                    System.out.println(var1);
                    textField.setText("");
                    switchEquals = true;
                    operator = '+';
                }
            }
        });


        JButton button6 = new JButton("6");
        button6.setBounds(20, 205, 100, 50);
        button6.setFont(myFont);
        button6.setFocusPainted(false);
        button6.setBackground(bgButtonColor);
        button6.setForeground(textColor);
        button6.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + "6";
                textField.setText(content);
            }
        });


        JButton button5 = new JButton("5");
        button5.setBounds(125, 205, 100, 50);
        button5.setFont(myFont);
        button5.setFocusPainted(false);
        button5.setBackground(bgButtonColor);
        button5.setForeground(textColor);
        button5.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + "5";
                textField.setText(content);
            }
        });

        JButton button4 = new JButton("4");
        button4.setBounds(230, 205, 100, 50);
        button4.setFont(myFont);
        button4.setFocusPainted(false);
        button4.setBackground(bgButtonColor);
        button4.setForeground(textColor);
        button4.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + "4";
                textField.setText(content);
            }
        });

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(335, 205, 100, 50);
        buttonMinus.setFont(myFont);
        buttonMinus.setFocusPainted(false);
        buttonMinus.setBackground(bgButtonColor);
        buttonMinus.setForeground(textColor);
        buttonMinus.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("") && !textField.getText().equals("unable to divide by zero")) {
                    
                    if(var1 == 0 || switchOperator == false) { 
                        var1 = Double.valueOf(textField.getText());
                        switchOperator = true; 
                    } else {
                        checkOperator();
                    }
                    
                    System.out.println(var1);
                    textField.setText("");
                    switchEquals = true;
                    operator = '-';
                }
            }
        });

        JButton button3 = new JButton("3");
        button3.setBounds(20, 260, 100, 50);
        button3.setFont(myFont);
        button3.setFocusPainted(false);
        button3.setBackground(bgButtonColor);
        button3.setForeground(textColor);
        button3.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + "3";
                textField.setText(content);
            }
        });


        JButton button2 = new JButton("2");
        button2.setBounds(125, 260, 100, 50);
        button2.setFont(myFont);
        button2.setFocusPainted(false);
        button2.setBackground(bgButtonColor);
        button2.setForeground(textColor);
        button2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + "2";
                textField.setText(content);
            }
        });

        JButton button1 = new JButton("1");
        button1.setBounds(230, 260, 100, 50);
        button1.setFont(myFont);
        button1.setFocusPainted(false);
        button1.setBackground(bgButtonColor);
        button1.setForeground(textColor);
        button1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + "1";
                textField.setText(content);
            }
        });

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(335, 260, 100, 50);
        buttonMultiply.setFont(myFont);
        buttonMultiply.setFocusPainted(false);
        buttonMultiply.setBackground(bgButtonColor);
        buttonMultiply.setForeground(textColor);
        buttonMultiply.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("") && !textField.getText().equals("unable to divide by zero")) {
                    
                    if(var1 == 0 || switchOperator == false) { 
                        var1 = Double.valueOf(textField.getText());
                        switchOperator = true; 
                    } else {
                        checkOperator();
                    }
                    System.out.println(var1);
                    textField.setText("");
                    switchEquals = true;
                    operator = '*';
                }
            }
        });


        JButton button0 = new JButton("0");
        button0.setBounds(20, 315, 100, 50);
        button0.setFont(myFont);
        button0.setFocusPainted(false);
        button0.setBackground(bgButtonColor);
        button0.setForeground(textColor);
        button0.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + "0";
                textField.setText(content);
            }
        });


        JButton buttonDot = new JButton(".");
        buttonDot.setBounds(125, 315, 100, 50);
        buttonDot.setFont(myFont);
        buttonDot.setFocusPainted(false);
        buttonDot.setBackground(bgButtonColor);
        buttonDot.setForeground(textColor);
        buttonDot.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textField.getText() + ".";
                textField.setText(content);
            }
        });

        JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(230, 315, 100, 50);
        buttonEquals.setFont(myFont);
        buttonEquals.setFocusPainted(false);
        buttonEquals.setBackground(bgButtonColor);
        buttonEquals.setForeground(textColor);
        buttonEquals.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("") && switchEquals == true) {
                    
                    var2 = Double.valueOf(textField.getText());
                    System.out.println(var2);
                    double result = 0;
                    switchOperator = false;
                    switchEquals = false;

                    switch (operator) {
                        case '+':
                            result = var1 + var2;
                            textField.setText(String.valueOf(result));
                            break;
                        case '-':
                            result = var1 - var2;
                            textField.setText(String.valueOf(result));
                            break;
                        case '*':
                            result = var1 * var2;
                            textField.setText(String.valueOf(result));
                            break;
                        case '/':

                            if(var2 == 0) {
                                textField.setText("unable to divide by zero");
                            }   else {
                                result = var1 / var2;
                                textField.setText(String.valueOf(result));  
                            } 
                            
                            
                            break;     
                    
                        default:
                            System.out.println("Something went wrong");
                            break;
                    }
                }
            }
        });

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(335, 315, 100, 50);
        buttonDivide.setFont(myFont);
        buttonDivide.setFocusPainted(false);
        buttonDivide.setBackground(bgButtonColor);
        buttonDivide.setForeground(textColor);
        buttonDivide.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("") && !textField.getText().equals("unable to divide by zero")) {
                    
                    if(var1 == 0 || switchOperator == false) { 
                        var1 = Double.valueOf(textField.getText());
                        switchOperator = true; 
                    } else {
                        checkOperator();
                    }
                    System.out.println(var1);
                    textField.setText("");
                    switchEquals = true;
                    operator = '/';
                }
            }
        });


        JButton buttonDelete = new JButton("X");
        buttonDelete.setBounds(125, 370, 100, 50);
        buttonDelete.setFont(myFont);
        buttonDelete.setFocusPainted(false);
        buttonDelete.setBackground(bgButtonColor);
        buttonDelete.setForeground(textColor);
        buttonDelete.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(!textField.getText().equals("")) {
                    int len = textField.getText().length();   
                    char content;
                    String text = "";

                    for(int i = 0; i < len - 1 ; i++) {
                        content = textField.getText().charAt(i);
                        text += content;
                    }
                    textField.setText(text);
                    
                }
                    
                
            }
        });




        JButton buttonClear = new JButton("CLEAR");
        buttonClear.setBounds(230, 370, 100, 50);
        buttonClear.setFont(myFont);
        buttonClear.setFocusPainted(false);
        buttonClear.setBackground(bgButtonColor);
        buttonClear.setForeground(textColor);
        buttonClear.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    operator = ' ';
                    var1 = 0.0;
                    var2 = 0.0;                    
                    textField.setText("");
                
            }
        });


        this.add(buttonDelete);
        this.add(buttonClear);
        this.add(textField);
        this.add(button9);
        this.add(button8);
        this.add(button7);
        this.add(buttonAdd);
        this.add(button6);
        this.add(button5);
        this.add(button4);
        this.add(buttonMinus);
        this.add(button3);
        this.add(button2);
        this.add(button1);
        this.add(buttonMultiply);
        this.add(button0);
        this.add(buttonDot);
        this.add(buttonEquals);
        this.add(buttonDivide);
        this.setLayout(null);
        this.getContentPane().setBackground(bgFrameColor);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }    
    


    public void checkOperator() {

        switch (operator) {
            case '+':
                var1 += Double.valueOf(textField.getText());        
                break;
            case '-':
                var1 -= Double.valueOf(textField.getText());
                break;
            case '*':
                var1 *= Double.valueOf(textField.getText());
                break;
            case '/':
                var1 /= Double.valueOf(textField.getText());
            
                
                break;     
        
            default:
                System.out.println("Something went wrong");
                break;
        }
    }
}