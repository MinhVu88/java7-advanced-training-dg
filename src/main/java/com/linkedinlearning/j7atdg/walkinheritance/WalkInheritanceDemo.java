package main.java.com.linkedinlearning.j7atdg.walkinheritance;

public class WalkInheritanceDemo {
	public static void main(String[] args) {
		Object obj = new Ligurio();
		Class<?> someClass = obj.getClass();
		System.out.println("\nsub class: " + someClass.getSimpleName());
		
		Class<?> superClass = someClass.getSuperclass();
		System.out.println("\nsuper class: " + superClass.getSimpleName());
		
		Class<?> topClass = superClass.getSuperclass();
		System.out.println("\ntop class of all: " + topClass.getSimpleName());
		
		Package p = someClass.getPackage();
		System.out.println("\npackage: " + p.getName());
	}
}
