package in.src.calculate;

/**
 * <p>The application class has the main
 * method from where the application starts</p>
 * 
 * @author Charanpreet Singh Bedi
 * @version 1.0
 * @since 2019-07-26
 */

public class Application {

	/**
	 * This is the main method used to start the application.
	 * @param args unused
	 */
	public static void main(String args[]) {
		
		View view = new View();
		Model model = new Model();
		@SuppressWarnings("unused")
		Controller controller = new Controller(view, model);
		
		view.setVisible(true);
	}
}
