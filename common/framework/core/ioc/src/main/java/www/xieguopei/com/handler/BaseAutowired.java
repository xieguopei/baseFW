package www.xieguopei.com.handler;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Autowired
public @interface BaseAutowired {
    boolean required() default true;
}
