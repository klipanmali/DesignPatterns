package designpatterns.adapter.udemy;

public class Logger {

	private Writer writer;
	
	public Logger(Writer writer){
		this.writer = writer;
	}
	public void log(String text){
		writer.write(text);
	}
}
