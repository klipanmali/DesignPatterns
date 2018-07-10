package designpatterns.adapter.hf2;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
		Vector<String> v = new Vector<>(Arrays.asList(args));
		Iterator<String> iterator = new EnumerationIterator<>(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
