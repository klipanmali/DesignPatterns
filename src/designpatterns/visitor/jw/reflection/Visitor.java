package designpatterns.visitor.jw.reflection;

import java.util.Collection;

public interface Visitor {
	   public void visitCollection(Collection collection);
	   public void visitString(String string);
	   public void visitFloat(Float floatNum);
}
