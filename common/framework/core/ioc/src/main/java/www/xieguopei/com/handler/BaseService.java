package www.xieguopei.com.handler;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface BaseService {
}
