package JavaReflectionApi_InputAndOutput;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SampleAnnotation {
    String value();
}
