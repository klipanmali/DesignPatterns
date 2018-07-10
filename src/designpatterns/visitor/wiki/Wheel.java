package designpatterns.visitor.wiki;

public class Wheel implements CarElement {
	
	private String name;
	
	public Wheel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void accept(final CarElementVisitor visitor) {
		visitor.visit(this);
	}

}
