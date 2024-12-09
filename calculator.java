package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class calculator implements ActionListener {
	 double input, result;
	    String cal;
	    JFrame frame;
	    JLabel label = new JLabel();
	    JTextField textView = new JTextField();
	    JButton symClr = new JButton("CLR");
	    JButton symDel = new JButton("DEL");
	    JButton symMultiply = new JButton("*");
	    JButton symDivide = new JButton("/");
	    JButton numSeven = new JButton("7");
	    JButton numEight = new JButton("8");
	    JButton numNine = new JButton("9");
	    JButton symMinus = new JButton("-");
	    JButton numFour = new JButton("4");
	    JButton numFive = new JButton("5");
	    JButton numSix = new JButton("6");
	    JButton symPlus = new JButton("+");
	    JButton numOne = new JButton("1");
	    JButton numTwo = new JButton("2");
	    JButton numThree = new JButton("3");
	    JButton symEqual = new JButton("=");
	    JButton numZero = new JButton("0");
	    JButton symDot = new JButton(".");

	    calculator() {
	        createInterface();
	        interfaceComponents();
	        addInterfaceEventListener();
	    }

	    public void createInterface() {
	        frame = new JFrame();
	        frame.setTitle("Java Calculator");
	        frame.getContentPane().setLayout(null);
	        frame.setLocationRelativeTo(null);
	        frame.setResizable(false);
	        frame.setSize(305, 400);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public void interfaceComponents() {
	        // OUTPUT ROW
	        label.setBounds(240, 0, 40, 40);
	        frame.add(label);
	        textView.setBounds(10, 40, 270, 60);
	        textView.setEditable(false);
	        textView.setHorizontalAlignment(SwingConstants.RIGHT);
	        frame.add(textView);

	        // First row
	        symClr.setBounds(10, 110, 60, 40);
	        frame.add(symClr);
	        symDel.setBounds(80, 110, 60, 40);
	        frame.add(symDel);
	        symMultiply.setBounds(150, 110, 60, 40);
	        frame.add(symMultiply);
	        symDivide.setBounds(220, 110, 60, 40);
	        frame.add(symDivide);
	        // Second row
	        numSeven.setBounds(10, 160, 60, 40);
	        frame.add(numSeven);
	        numEight.setBounds(80, 160, 60, 40);
	        frame.add(numEight);
	        numNine.setBounds(150, 160, 60, 40);
	        frame.add(numNine);
	        symMinus.setBounds(220, 160, 60, 40);
	        frame.add(symMinus);
	        // Third row
	        numFour.setBounds(10, 210, 60, 40);
	        frame.add(numFour);
	        numFive.setBounds(80, 210, 60, 40);
	        frame.add(numFive);
	        numSix.setBounds(150, 210, 60, 40);
	        frame.add(numSix);
	        symPlus.setBounds(220, 210, 60, 40);
	        frame.add(symPlus);
	        // Fourth row
	        numThree.setBounds(150, 260, 60, 40);
	        frame.add(numThree);
	        numTwo.setBounds(80, 260, 60, 40);
	        frame.add(numTwo);
	        numOne.setBounds(10, 260, 60, 40);
	        frame.add(numOne);
	        symEqual.setBounds(220, 260, 60, 90);
	        frame.add(symEqual);
	        // Fifth row
	        numZero.setBounds(10, 310, 130, 40);
	        frame.add(numZero);
	        symDot.setBounds(150, 310, 60, 40);
	        frame.add(symDot);
	    }

	    public void addInterfaceEventListener() {
	        // First row
	        symClr.addActionListener(this);
	        symDel.addActionListener(this);
	        symMultiply.addActionListener(this);
	        symDivide.addActionListener(this);
	        // Second row
	        numSeven.addActionListener(this);
	        numEight.addActionListener(this);
	        numNine.addActionListener(this);
	        symMinus.addActionListener(this);
	        // Third row
	        numFour.addActionListener(this);
	        numFive.addActionListener(this);
	        numSix.addActionListener(this);
	        symPlus.addActionListener(this);
	        // Fourth row
	        numThree.addActionListener(this);
	        numTwo.addActionListener(this);
	        numOne.addActionListener(this);
	        symEqual.addActionListener(this);
	        // Fifth row
	        numZero.addActionListener(this);
	        symDot.addActionListener(this);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        Object event = e.getSource();

	        // Input values
	        if (event == numOne) {
	            textView.setText(textView.getText() + "1");
	        } else if (event == numTwo) {
	            textView.setText(textView.getText() + "2");
	        } else if (event == numThree) {
	            textView.setText(textView.getText() + "3");
	        } else if (event == numFour) {
	            textView.setText(textView.getText() + "4");
	        } else if (event == numFive) {
	            textView.setText(textView.getText() + "5");
	        } else if (event == numSix) {
	            textView.setText(textView.getText() + "6");
	        } else if (event == numSeven) {
	            textView.setText(textView.getText() + "7");
	        } else if (event == numEight) {
	            textView.setText(textView.getText() + "8");
	        } else if (event == numNine) {
	            textView.setText(textView.getText() + "9");
	        } else if (event == numZero) {
	            if (!textView.getText().equals("0")) {
	                textView.setText(textView.getText() + "0");
	            }
	        } else if (event == symDot) {
	            if (!textView.getText().contains(".")) {
	                textView.setText(textView.getText() + ".");
	            }
	        } else if (event == symClr) {
	            label.setText("");
	            textView.setText("");
	            input = 0; // Reset input
	            result = 0; // Reset result
	        } else if (event == symDel) {
	            int length = textView.getText().length();
	            if (length > 0) {
	                StringBuilder numString = new StringBuilder(textView.getText());
	                numString.deleteCharAt(length - 1);
	                textView.setText(numString.toString());
	            }
	            if (textView.getText().isEmpty()) {
	                label.setText("");
	            }
	        } else if (event == symMultiply) {
	            String presentNumber = textView.getText();
	            if (!presentNumber.isEmpty()) {
	                input = Double.parseDouble(presentNumber);
	                textView.setText("");
	                label.setText(presentNumber + " * ");
	                cal = "*";
	            }
	        } else if (event == symDivide) {
	            String presentNumber = textView.getText();
	            if (!presentNumber.isEmpty()) {
	                input = Double.parseDouble(presentNumber);
	                textView.setText("");
	                label.setText(presentNumber + " / ");
	                cal = "/";
	            }
	        } else if (event == symMinus) {
	            String presentNumber = textView.getText();
	            if (!presentNumber.isEmpty()) {
	                input = Double.parseDouble(presentNumber);
	                textView.setText("");
	                label.setText(presentNumber + " - ");
	                cal = "-";
	            }
	        } else if (event == symPlus) {
	            String presentNumber = textView.getText();
	            if (!presentNumber.isEmpty()) {
	                input = Double.parseDouble(presentNumber);
	                textView.setText("");
	                label.setText(presentNumber + " + ");
	                cal = "+";
	            }
	        } else if (event == symEqual) {
	            if (!textView.getText().isEmpty()) {
	                switch (cal) {
	                    case "*":
	                        result = input * Double.parseDouble(textView.getText());
	                        break;
	                    case "/":
	                        if (Double.parseDouble(textView.getText()) != 0) {
	                            result = input / Double.parseDouble(textView.getText());
	                        } else {
	                            textView.setText("Error");
	                            return;
	                        }
	                        break;
	                    case "-":
	                        result = input - Double.parseDouble(textView.getText());
	                        break;
	                    case "+":
	                        result = input + Double.parseDouble(textView.getText());
	                        break;
	                }
	                if (Double.toString(result).endsWith(".0")) {
	                    textView.setText(Double.toString(result).replace(".0", ""));
	                } else {
	                    textView.setText(Double.toString(result));
	                }
	                label.setText("");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        new calculator();
	    }
	}