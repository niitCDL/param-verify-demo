package com.example.web.check;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckParams {
    String attributeName();
    CheckType type();
    String value() default "";
    String errorMessage() default "参数数值不合法!";
}
