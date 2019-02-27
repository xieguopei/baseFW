package www.xieguopei.com.handler;

import org.springframework.context.annotation.Primary;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Primary
public @interface BasePrimary {
}
