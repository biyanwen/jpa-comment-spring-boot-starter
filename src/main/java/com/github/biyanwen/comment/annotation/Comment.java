package com.github.biyanwen.comment.annotation;

import java.lang.annotation.*;

/**
 * @Author byw
 * @Date 2021/12/13 14:09
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Comment {
	/**
	 * 注释的值
	 *
	 * @return {@link String}
	 */
	String value() default "";
}
