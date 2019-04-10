package members;

import java.lang.reflect.Method;

public class method_type {
	 public static void main(String[] args) {

	      Method[] methods = sandesh_example_1.class.getMethods();
	      Class returnType = methods[0].getReturnType();
	      System.out.println(returnType.getName());
	      Class[] parameterTypes = methods[1].getParameterTypes();

	      for(Class parameterType: parameterTypes){
	         System.out.println(parameterType.getName());   
	   }
}
}

class sandesh_example_1 {
	   private String sampleField;

	   public String getSampleField() {
	      return sampleField;
	   }

	   public void setSampleField(String sampleField,int x,long y) {
	      this.sampleField = sampleField;
	   } 
}