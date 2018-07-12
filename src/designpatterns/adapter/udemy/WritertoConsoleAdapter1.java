package designpatterns.adapter.udemy;

/**
 * 
 * This Writer to Console adapter will use composition
 *
 */
public class WritertoConsoleAdapter1 implements Writer{

	private ConsolPrinter consolPrinter = new ConsolPrinter();
	
	@Override
	public void write(String text) {
		consolPrinter.print(text);
		
	}
	

}
