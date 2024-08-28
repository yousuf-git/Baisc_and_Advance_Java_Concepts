package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)                   // applicable to class only
@Retention(RetentionPolicy.RUNTIME)         // available at runtime
public @interface MyAnnotation {
    int value() default 69;             // An Attribute with default value 69, seems like method but its not
}
