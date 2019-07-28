package in.src.calculate;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//UI elements used for JFrame
	
	private JLabel notice;
	private JLabel labelOne;
	private JLabel labelTwo;
	private JTextField fieldOne;
	private JTextField fieldTwo;
	private JTextField result;
	private JButton button;
	private JPanel mainPanel;
	
	View() {
		
		//declare UI elements
		notice = new JLabel("If the numbers are large(even two digit) the result value will be very very small, which is rounded off to 0 upto certain decimal points");
		labelOne = new JLabel("Please enter the first number");
		labelTwo = new JLabel("Please enter the second number");
		fieldOne = new JTextField(5);
		fieldTwo = new JTextField(5);
		result = new JTextField(25);
		button = new JButton("Calculate Beta Function");
		mainPanel = new JPanel();
		
		this.setSize(800,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add elements to JFrame panel
		this.setTitle("Calculate Beta Function");
		mainPanel.add(notice);
		mainPanel.add(labelOne);
		mainPanel.add(fieldOne);
		mainPanel.add(labelTwo);		
		mainPanel.add(fieldTwo);
		mainPanel.add(button);
		mainPanel.add(result);
		
		this.add(mainPanel);
	}
	
	
	//setting first number to variable
	public String getNumOne() {		
		String str = fieldOne.getText();
		return str;
	}
	
	//setting second number to variable
	public String getNumTwo() {
		String str = fieldTwo.getText();
		return str;
	}
	
	//setting the result value to UI
	public void setResult(String num) {
		result.setText(num);
	}
	
	public void resultListener(ActionListener listener) {
		
		button.addActionListener(listener);
	}
	
	public void displayError(String error) {
		JOptionPane.showMessageDialog(this, error);
	}

}
