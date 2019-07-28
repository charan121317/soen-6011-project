package in.src.calculate;

public class Application {

	public static void main(String args[]) {
		
		View view = new View();
		Model model = new Model();
		@SuppressWarnings("unused")
		Controller controller = new Controller(view, model);
		
		view.setVisible(true);
	}
}
