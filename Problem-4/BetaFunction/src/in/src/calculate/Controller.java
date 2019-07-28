package in.src.calculate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Controller {
	
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		
		this.view.resultListener(new BetaListener());
	}
	
	class BetaListener implements ActionListener{

		@Override
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
