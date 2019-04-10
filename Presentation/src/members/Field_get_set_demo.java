/*Reference:https://www.tutorialspoint.com/javareflect/*/
package members;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class Field_get_set_demo {

   public static void main(String[] args) throws NoSuchFieldException, 
      SecurityException, IllegalArgumentException, IllegalAccessException {
          
      SampleClass sampleObject = new SampleClass();
      sampleObject.setSampleField("data");
      
      Field field = SampleClass.class.getField("sampleField");
      System.out.println(field.get(sampleObject));
      field.set(sampleObject, "sandesh");
      Field field1 = SampleClass.class.getField("sampleField");
      System.out.println(field1.get(sampleObject));
   }
}

@CustomAnnotation(name = "SampleClass",  value = "Sample Class Annotation")
class SampleClass {

   @CustomAnnotation(name="sampleClassField",  value = "Sample Field Annotation")
   public String sampleField;
    
   public String getSampleField() {
      return sampleField;
   }

   public void setSampleField(String sampleField) {
      this.sampleField = sampleField;
   }
}

@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
   public String name();
   public String value();
}
