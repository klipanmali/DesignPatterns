package designpatterns.visitor.jw.reflection;

public class VisitableString implements Visitable {
	
	private String string;
	

	public VisitableString(String string) {
		this.string = string;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitString(string);
	}

}
