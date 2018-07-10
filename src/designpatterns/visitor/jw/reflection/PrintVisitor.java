package designpatterns.visitor.jw.reflection;

import java.util.Collection;
import java.util.Iterator;

// This is traditional visitor pattern implementation

public class PrintVisitor implements Visitor {

	@Override
	public void visitCollection(Collection collection) {
	      Iterator iterator = collection.iterator();
	    	      while (iterator.hasNext()) {
	    	      Object o = iterator.next();
	    	      if (o instanceof Visitable)
	    	         ((Visitable)o).accept(this);
	    	   }
	}

	@Override
	public void visitString(String string) {
		System.out.println("'" + string + "'");
	}

	@Override
	public void visitFloat(Float floatNum) {
	      System.out.println(floatNum.toString()+"f");
	}

//	If you want to add a new Visitable object, you have to change the Visitor interface
//	and then implement that method in each of your Visitor implementation classes.
//	You could use an abstract base class Visitor with default no-op functions instead of an interface. 
//	That would be similar to the Adapter classes in Java GUIs.
//	The problem with that approach is that you need to use up your single inheritance,
//	which you often want to save for something else, such as extending StringWriter.
//	It would also limit you to only be able to visit Visitable objects successfully.
}
