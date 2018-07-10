package designpatterns.visitor.wiki;

public interface CarElement {
	void accept(CarElementVisitor visitor);
}
