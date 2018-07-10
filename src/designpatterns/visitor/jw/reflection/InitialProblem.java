package designpatterns.visitor.jw.reflection;

import java.util.Collection;
import java.util.Iterator;

// Collections are commonly used in object-oriented programming and often raise code-related questions.
// For example, "How do you perform an operation across a collection of different objects?"
// You don't want a piece of code with a huge list of if-else statements!
// How do you avoid that? The Visitor pattern comes to the rescue.

public class InitialProblem {
	
	public void messyPrintCollection(Collection collection) {
		   Iterator iterator = collection.iterator();
		   while (iterator.hasNext()) {
		      Object o = iterator.next();
		      if (o instanceof Collection)
		         messyPrintCollection((Collection)o);
		      else if (o instanceof String)
		         System.out.println("'"+o.toString()+"'");
		      else if (o instanceof Float)
		         System.out.println(o.toString()+"f");
		      else
		         System.out.println(o.toString());
		   }
		}
}
