package cn.edu.gdut.zaoying.Option.angleAxis.axisLine.lineStyle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ShadowOffsetYNumber {
    double value() default 0;
}