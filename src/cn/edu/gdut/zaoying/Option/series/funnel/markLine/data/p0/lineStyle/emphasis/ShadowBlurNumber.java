package cn.edu.gdut.zaoying.Option.series.funnel.markLine.data.p0.lineStyle.emphasis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ShadowBlurNumber {
    double value() default 0;
}