package designpatterns.adapter.udemy;

/**
 * 
 * This Writer to Console Adapter will use inheritance
 */
public class WritertoConsolAdapter2 extends ConsolPrinter implements Writer {

	@Override
	public void write(String text) {
		this.print(text);
	}

}
