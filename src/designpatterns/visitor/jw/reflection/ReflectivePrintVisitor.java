// https://www.javaworld.com/article/2077602/learn-java/java-tip-98--reflect-on-the-visitor-design-pattern.html
package designpatterns.visitor.jw.reflection;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;

// This is modified reflective visitor implementation
// No need for Visitable, this version don't use them
// Actually it is more of the dispatcher than the visitor pattern
// it simply finds the appropriate method for the object's Class
// This is to avoid adding new visit(...) method for every new object
// Every new object will use default visitObject method

public class ReflectivePrintVisitor implements ReflectiveVisitor {

	public void visitCollection(Collection collection) {
	      Iterator iterator = collection.iterator();
	    	      while (iterator.hasNext()) {
	    	      Object o = iterator.next();
	    	         visit(o);
	    	   }
	}

	public void visitString(String string) {
		System.out.println("'" + string + "'");
	}

	public void visitFloat(Float floatNum) {
		System.out.println(floatNum.toString() + "f");
	}

	public void visitObject(Object o) {
		System.out.println(o.toString());
	}

	@Override
	public void visit(Object o) {
	     Method method = getMethod(o.getClass());
	     try {
			method.invoke(this, new Object[] {o});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected Method getMethod(Class c) {
		Class newc = c;
		Method m = null;
		// Class.getName() returns package information as well.
		// This strips off the package information giving us
		// just the class name
		// Try the superclasses
		while (m == null && newc != Object.class) {
			String method = newc.getName();
			method = "visit" + method.substring(method.lastIndexOf('.') + 1);
			try {
				m = getClass().getMethod(method, new Class[] { newc });
			} catch (NoSuchMethodException e) {
				newc = newc.getSuperclass();
			}
		}
		// Try the interfaces. If necessary, you
		// can sort them first to define 'visitable' interface wins
		// in case an object implements more than one.
		if (newc == Object.class) {
			Class[] interfaces = c.getInterfaces();
			for (int i = 0; i < interfaces.length; i++) {
				String method = interfaces[i].getName();
				method = "visit" + method.substring(method.lastIndexOf('.') + 1);
				try {
					m = getClass().getMethod(method, new Class[] { interfaces[i] });
				} catch (NoSuchMethodException e) {
				}
			}
		}
		if (m == null) {
			try {
				m = this.getClass().getMethod("visitObject", new Class[] { Object.class });
			} catch (Exception e) {
				// Can't happen
			}
		}
		return m;
	}
}
