package cn.edu.gdut.zaoying;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 祖荣 on 2016/2/19 0019.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DuplexChart {
    String exportTo() default "";
    String extendFrom() default "";
}
