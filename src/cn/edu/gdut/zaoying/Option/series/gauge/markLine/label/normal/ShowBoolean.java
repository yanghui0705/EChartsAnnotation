package cn.edu.gdut.zaoying.Option.series.gauge.markLine.label.normal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ShowBoolean {
    boolean value() default true;
}