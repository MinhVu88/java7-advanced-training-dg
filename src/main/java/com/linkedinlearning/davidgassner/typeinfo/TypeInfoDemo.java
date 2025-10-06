package main.java.com.linkedinlearning.davidgassner.typeinfo;

import java.lang.reflect.Constructor;

public class TypeInfoDemo {
	public static void main(String[] args) {
		//Olive o = new Olive(OliveName.PICHOLINE, 0x00FF00);
		Olive o = new Olive(OliveName.PICHOLINE, OliveColor.GREEN);
		
		Class<?> someClass = o.getClass();
		System.out.println("\nthe fully qualified package name & class name, preceded by the word 'class': " + someClass);
		System.out.println("\nthe fully qualified package name & class name, without 'class': " + someClass.getName());
		System.out.println("\njust the class name: " + someClass.getSimpleName());
		
		Constructor<?>[] constructors = someClass.getConstructors(); // an array of constructor objects 
		System.out.println("\nthe number of constructors in 'someClass': " + constructors.length);
		
		Constructor<?> cons = constructors[0]; // get a reference to an element in the constructors array
		
		Object obj = null;
		
		try {
			// use the Constructor class's newInstance() method to dynamically instantiate the object
			//obj = cons.newInstance(OliveName.PICHOLINE, 0x00ff00); 
			obj = cons.newInstance(OliveName.PICHOLINE, OliveColor.GREEN);
			System.out.println(obj);
		} catch(Exception e) {
			System.out.println("\n* Exception: " + e.getMessage());
		}
	}
}
