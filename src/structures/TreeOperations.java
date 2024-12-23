package structures;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // Дозволяє застосовувати анотацію до методів
public @interface TreeOperations {
    String description();
}