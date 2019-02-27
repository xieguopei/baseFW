package www.xieguopei.com.handler;

import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Order
public @interface BaseOrder {
    int value() default 2147483647;
}
