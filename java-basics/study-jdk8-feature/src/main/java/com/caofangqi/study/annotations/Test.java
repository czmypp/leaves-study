package com.caofangqi.study.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Repeatable(Tests.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {

}
