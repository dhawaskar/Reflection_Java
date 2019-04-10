package members;



import java.lang.reflect.*;

public class constructor_getconstrucots {

   public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

	  System.out.println("Getting the constructos of a given class\n\n");
	   constructor_getconstrucots cls = new constructor_getconstrucots();
      Class c = cls.getClass();

      // constructors
      Constructor[] ct = c.getDeclaredConstructors();
      for(int i = 0; i < ct.length; i++) {
         System.out.println("Constructor found: " + ct[i].toString());
      }
      
      System.out.println("Getting the constructors parameter types\n\n");
      Type[] parameters = ct[1].getGenericParameterTypes();
      for (int i = 0; i < parameters.length; i++) {
         System.out.println(parameters[i]);
      }
      
      System.out.println("Getting the constructos modifiers using Relfection\n\n");
      for (Constructor constructor : ct) {
          System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers()));
          System.out.println("Constructor: " + constructor.toGenericString());
       }
      
      System.out.println("Creating the object using relfection of constructors\n\n");
      Constructor constructor = sandesh_demo_constructor.class.getConstructor(String.class);
      sandesh_demo_constructor sampleObject = (sandesh_demo_constructor)constructor.newInstance("data");
      System.out.println(sampleObject.getSampleField());
   }

   private constructor_getconstrucots() {
      System.out.println("no argument constructor");
   }

   public constructor_getconstrucots(Double d, Long l) {
      this.d = d;
      this.l = l;
   }

   Double d = new Double(3.9d);
   Long l = new Long(7687);
} 


class sandesh_demo_constructor {
	   private String sampleField;
	   
	   public sandesh_demo_constructor(){
	   }

	   public sandesh_demo_constructor(String sampleField){
	      this.sampleField = sampleField;
	   }

	   public String getSampleField() {
	      return sampleField;
	   }

	   public void setSampleField(String sampleField) {
	      this.sampleField = sampleField;
	   } 
	}