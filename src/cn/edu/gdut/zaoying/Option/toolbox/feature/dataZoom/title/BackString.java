package cn.edu.gdut.zaoying.Option.toolbox.feature.dataZoom.title;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface BackString {
    String value() default "";
}