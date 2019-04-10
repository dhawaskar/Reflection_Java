package class_demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

public class reflection_class {
	static byte[] bit=new byte[10];
	static Set<String> s=new HashSet<String>();
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		System.out.println("Demo of Object.getClass()");
		gettype a=new gettype(10);
		Class b=a.getClass();//reflection for the object of class gettype
		System.out.println("Class name of object b is\t"+b);
		Class c=bit.getClass();//byte object
		System.out.println("Class name of object c is\t"+c);
		Class d=s.getClass();//Hash set object
		System.out.println("Class name of object d is\t"+d);
		
		System.out.println("\n***Demo of .class() for non-created objects***\n");
		System.out.println("Class name of boolean variable\t"+boolean.class);
		System.out.println("Class name of int variables\t"+int.class);
		System.out.println("class name of three dimention integer array\t"+int[][][].class);
		
		System.out.println("\n***Demo of TYPE Field for Primitive Type Wrappers***\n");
		System.out.println("Class name of Double using type\t"+Double.TYPE);
		System.out.println("Class name of void using type \t"+Void.TYPE);
		System.out.println("class name of three dimention integer array\t"+int[][][].class);
		
		System.out.println("\n***Demo of reteriving the class modifers***\n");
		System.out.println("All the infomration regarding a class\nCanonical Name\n"+b.getCanonicalName()+
				"\n Name of class\n"+b.getName()+"\n"+"Modifers of class\n"+
				Modifier.toString(b.getModifiers())+"\nType parameters of class\n"+b.getTypeParameters());
		
		System.out.println("\n***Demo of Discovering Class Members***\n");
		Field[] fields = b.getDeclaredFields();
        for(int i = 0; i < fields.length; i++) {
           System.out.println("Field = " + fields[i].toString());
        }
        Method[] m = b.getDeclaredMethods();
        for(int i = 0; i < m.length; i++) {
           System.out.println("method = " + m[i].toString());
        }
        Class<gettype> cns = gettype.class;
        Constructor<gettype> cons = cns.getDeclaredConstructor();
        System.out.println(cons);	
        Constructor<gettype> cons1 = cns.getDeclaredConstructor(int.class);
        System.out.println(cons1);
        Constructor<gettype> cons2 = cns.getDeclaredConstructor(String.class);
        System.out.println(cons2);
        
	}

}
