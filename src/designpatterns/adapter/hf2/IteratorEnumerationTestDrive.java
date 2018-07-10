package designpatterns.adapter.hf2;

import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		ArrayList<String> l = new ArrayList<>(Arrays.asList(args));
		Enumeration<String> enumeration = new IteratorEnumeration<>(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
