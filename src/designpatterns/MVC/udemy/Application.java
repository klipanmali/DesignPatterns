package designpatterns.MVC.udemy;

import javax.swing.SwingUtilities;

import designpatterns.MVC.udemy.controller.Controller;
import designpatterns.MVC.udemy.model.Model;
import designpatterns.MVC.udemy.view.View;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				runApp();
			}
			
		});
	}
	
	public static void runApp() {
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);
		
		view.setLoginListener(controller);
	}

}
