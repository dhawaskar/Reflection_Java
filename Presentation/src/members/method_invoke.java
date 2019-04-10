package members;



import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class method_invoke {
   public static void main(String[] args) 
      throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

      Method[] methods = sandesh_method_invoke.class.getMethods();
      sandesh_method_invoke sampleObject = new sandesh_method_invoke();
      methods[1].invoke(sampleObject, "data");
      System.out.println(methods[0].invoke(sampleObject));
   }
}

class sandesh_method_invoke {
   private String sampleField;

   public String getSampleField() {
      return sampleField;
   }

   public void setSampleField(String sampleField) {
      this.sampleField = sampleField;
   } 
}
