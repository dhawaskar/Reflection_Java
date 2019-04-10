/*Reference:https://www.tutorialspoint.com/javareflect/*/
package members;

import java.lang.reflect.Field;

public class fields_gettype {

   public static void main(String[] args) throws NoSuchFieldException, 
      SecurityException, IllegalArgumentException, IllegalAccessException {
          
      Field field = SampleClass1.class.getField("sampleField");
      System.out.println(field.getType());
   }
}

class SampleClass1 {
   public static long sampleField = 5;
}