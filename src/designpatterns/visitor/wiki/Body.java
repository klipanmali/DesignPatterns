package designpatterns.visitor.wiki;

public class Body implements CarElement {

	@Override
	public void accept(final CarElementVisitor visitor) {
		visitor.visit(this);
	}

}
