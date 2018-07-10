package designpatterns.visitor.jw.reflection;

public class VisitableFloat implements Visitable {
	
	private Float floatVal;

	public VisitableFloat(Float floatVal) {
		super();
		this.floatVal = floatVal;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitFloat(floatVal);
	}

}
