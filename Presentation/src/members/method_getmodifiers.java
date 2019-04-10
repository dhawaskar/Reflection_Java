package members;

import java.lang.*;
import java.lang.reflect.Modifier;

public class method_getmodifiers {

   public static void main(String[] args) {

      method_getmodifiers c = new method_getmodifiers();
      Class cls = c.getClass();

      // returns the Java language modifiers for this class
      int i = cls.getModifiers();
      String retval = Modifier.toString(i);
      System.out.println("Class Modifier = " + retval);
   }
} 