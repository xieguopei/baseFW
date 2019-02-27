package www.xieguopei.com.handler;

import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
public @interface BaseConfiguration {
    String value() default "";
}
