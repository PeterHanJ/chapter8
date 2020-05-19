package com.smart.aspectj.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Monitorable {
    boolean value() default true;
}
