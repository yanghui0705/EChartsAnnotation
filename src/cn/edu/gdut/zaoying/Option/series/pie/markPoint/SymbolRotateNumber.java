package cn.edu.gdut.zaoying.Option.series.pie.markPoint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SymbolRotateNumber {
    double value() default 0;
}