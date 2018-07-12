package designpatterns.adapter.udemy;

/*
 *    http://www.udemy.com/java-design-patterns-tutorial
 */

public class App {

	/**
	 * ConsolPrinter prints some text to a console using print method.
	 * But Logger has a dependency on another class that uses write method
	 * If we wont to use Logger to write messages to a Console we need to adapt
	 * the interface.
	 * We can do that by using adapters.
	 */
	public static void main(String[] args) {
		
		Logger logger = new Logger(new WritertoConsoleAdapter1());
		logger.log("Some string 1");
		
		logger = new Logger(new WritertoConsolAdapter2());
		logger.log("Some other text 2");
	

	}

}
