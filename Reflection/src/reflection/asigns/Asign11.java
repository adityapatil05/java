package reflection.asigns;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Asign11 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Fully Qualified Name");
		String cname = br.readLine();

		Class c = Class.forName(cname);

		System.out.println("Constructors.........\n\n");
		Constructor[] allcons = c.getConstructors();
		for (Constructor cons : allcons)
			System.out.println(cons);

		System.out.println("Methods in Class.......\n\n");
		Method[] allMethods = c.getDeclaredMethods();
		for (Method method : allMethods)
			System.out.println(method);

		int z = c.getModifiers();
		if (java.lang.reflect.Modifier.isAbstract(z))
			System.out.println("Class is abstract\n\n");
		else
			System.out.println("Class is Not Abstract\n\n\n ");
		if (java.lang.reflect.Modifier.isFinal(z))
			System.out.println("Class is Final\n\n\n");
		else
			System.out.println("Class is Not Final\n\n\n");
		if (java.lang.reflect.Modifier.isPublic(z))
			System.out.println("Class is Public \n\n\n");
		else {
			System.out.println("Class is Not Public \n\n\n");
		}

		System.out.println("Package : " + c.getPackageName());
		Class supClass = c.getSuperclass();
		System.out.println("Super Class :" + supClass);
		System.out.println("Super Class2 : " + c.getSuperclass());

		System.out.println("Implemented Interfaces :");
		Class[] ifaces = c.getInterfaces();
		for (Class iface : ifaces)
			System.out.println(iface);

	}

}
