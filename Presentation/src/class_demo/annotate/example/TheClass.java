package class_demo.annotate.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TheClass {
    @MyAnnotation(name="SomeName", value = "Hello World")
    public void doSomething(){
        System.out.println("I'm here");
    }
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TheClass theClass = new TheClass();
        Class aClass = TheClass.class;
        Method[] methods = aClass.getMethods();
        for (Method method: methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof MyAnnotation) {
                    MyAnnotation myAnnotation = (MyAnnotation) annotation;
                    System.out.println("name:" + myAnnotation.name());
                    System.out.println("value:" + myAnnotation.value());
                    method.invoke(theClass);
                }
            }
        }
    }
}
