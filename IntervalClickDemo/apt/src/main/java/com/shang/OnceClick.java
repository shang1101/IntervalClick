package com.shang;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 一定time时间内该点击事件只能执行一次。
 * id：控件Id
 * time：间隔时间。 time = -1:间隔时间为默认时间。
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface OnceClick {

    int id();
    int time();

}
