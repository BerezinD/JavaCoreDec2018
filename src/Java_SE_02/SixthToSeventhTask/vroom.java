package Java_SE_02.SixthToSeventhTask;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface vroom {
    int minHorsePower();
    String madeIn() default "China";
}