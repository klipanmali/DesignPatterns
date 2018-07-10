package designpatterns.visitor.wiki;

public class Engine implements CarElement {

	@Override
	public void accept(final CarElementVisitor visitor) {
		visitor.visit(this);
	}

}
