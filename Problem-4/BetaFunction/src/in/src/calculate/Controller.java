package in.src.calculate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * <p>The Controller class serves as the interaction between
 * the Model and the View class.</p>
 * 
 * @author Charanpreet Singh Bedi
 * @version 1.0
 * @since 2019-07-26
 */

public class Controller {
	
	private View view;
	private Model model;
	
	/**
	 * <p>This is the Controller constructor to set up view and model objects.</p>
	 * @param view This is the view object
	 * @param model This is the model object
	 */
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		
		this.view.resultListener(new BetaListener());
	}
	
	/**
	 * <p>The BetaListener class implements the ActionListener class and overrides
	 * the actionPermormed method to act on events.</p>
	 * 
	 * @author Charanpreet Singh Bedi
	 * @version 1.0
	 * @since 2019-07-26
	 */
	
	class BetaListener implements ActionListener{

		@Override
		/**
		 * <p>The actionPerformed methods helps interaction between
		 * the view and model and facilitates the calculation of Beta function.</P>
		 */
		public void actionPerformed(ActionEvent e) {
			
			DecimalFormat formatter = new DecimalFormat("0.000000000000000000000");
			
			double numOne = 0;
			double numTwo = 0;
			try {
				
				numOne = Double.parseDouble(view.getNumOne());
				numTwo = Double.parseDouble(view.getNumTwo());
				
				if(numOne > 99 || numTwo >99) {
					view.displayError("Please enter numbers less than 100 due to constraint of this program.");
					System.exit(0);
				}
				double result = model.calculateBeta(numOne, numTwo);
				view.setResult(formatter.format(result));
				
			}catch (NumberFormatException error) {
				error.printStackTrace();
				view.displayError("Please enter valid numbers.");
			}
			
			
			
		}
		
	}

}
