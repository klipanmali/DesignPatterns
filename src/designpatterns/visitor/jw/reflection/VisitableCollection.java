package designpatterns.visitor.jw.reflection;

import java.util.Collection;

public class VisitableCollection implements Visitable {
	
	private Collection collection;

	public VisitableCollection(Collection collection) {
		this.collection = collection;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitCollection(collection);
	}

}
