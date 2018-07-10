package designpatterns.visitor.wiki;

public class VisitorDemo {

	public static void main(String[] args) {
        final Car car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());

	}

}
