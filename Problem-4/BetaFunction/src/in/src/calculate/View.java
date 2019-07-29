package in.src.calculate;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * <p>The view is used to setup the UI elements,
 *  serves as taking the input values
 *  and interact with controller
 * to calculate the Beta function</p>
 * 
 * @author Charanpreet Singh Bedi
 * @version 1.0
 * @since 2019-07-26
 */
public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * <p>Declaring the UI elements</p>
	 */
	
	private JLabel notice;
	private JLabel labelOne;
	private JLabel labelTwo;
	private JTextField fieldOne;
	private JTextField fieldTwo;
	private JTextField result;
	private JButton button;
	private JPanel mainPanel;
	
	View() {
		
		/**
		 * <p>setting up the UI elements</p>
		 */
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
		
		/**
		 * <p>Adding the UI elements to JFrame panel</p>
		 */
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
	
	
	/**
	 * <p>The method getNumOne returns the first input number</p>
	 *  @return the first number as string
	 */
	public String getNumOne() {		
		String str = fieldOne.getText();
		return str;
	}
	
	/**
	 *<p>The method getNumOne returns the second input number</p>
	 * @return the second number as string
	 */
	public String getNumTwo() {
		String str = fieldTwo.getText();
		return str;
	}
	
	/**
	 * <p>This method setResult sets the result value to UI</p>
	 * @param This is the result from beta function
	 */
	public void setResult(String num) {
		result.setText(num);
	}
	
	/**
	 * <p>The method resultListener handles the action for the button click</p>
	 * @param This is the ActionListener object
	 */
	public void resultListener(ActionListener listener) {
		
		button.addActionListener(listener);
	}
	
	/**
	 * <p>The method displayError is used to display error messages on UI</p>
	 * @param This is the input error message
	 */
	public void displayError(String error) {
		JOptionPane.showMessageDialog(this, error);
	}

}
