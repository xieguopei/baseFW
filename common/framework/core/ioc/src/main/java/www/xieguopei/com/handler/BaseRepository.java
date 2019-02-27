package www.xieguopei.com.handler;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
@Repository
public @interface BaseRepository {
    String value() default "";
}
