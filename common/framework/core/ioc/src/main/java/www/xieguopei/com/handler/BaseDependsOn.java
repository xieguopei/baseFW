package www.xieguopei.com.handler;

import org.springframework.context.annotation.DependsOn;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@DependsOn
public @interface BaseDependsOn {
    String[] value() default {};
}
