package cn.edu.gdut.zaoying.Option.toolbox.feature.restore;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TitleBoolean {
    boolean value() default true;
}