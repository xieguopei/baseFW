package www.xieguopei.com.handler;

import org.springframework.scheduling.annotation.Async;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Async
public @interface BaseAsync {
}
