package cn.edu.gdut.zaoying.Option.series.lines.markLine.data.p0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface XNumber {
    double value() default 0;
}