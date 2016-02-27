package cn.edu.gdut.zaoying.Option.series.treemap.itemStyle.normal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ColorAlphaNumber {
    double value() default 0;
}