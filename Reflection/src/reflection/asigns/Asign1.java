package reflection.asigns;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

public class Asign1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Fully Qualified Name: ");
		String cname = br.readLine();

		Class c = Class.forName(cname);

		Constructor con = c.getConstructor(char[].class, int.class, int.class);

		char[] chars = { 'w', 'e', 'l', 'c', 'o', 'm', 'e' };
		Object object = con.newInstance(chars, 2, 5);

		String string = (String) object;
		System.out.println(string);

//		System.out.println("Enter the method name: ");

//		String mname = br.readLine();

//		Method method = c.getMethod(mname, String.class);
//		System.out.println(method.invoke(object, "come"));
	}
}
