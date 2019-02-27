package www.xieguopei.com.handler;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.context.annotation.RequestScope;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestScope
public @interface BaseRequestScope {
    @AliasFor(
            annotation = Scope.class
    )
    ScopedProxyMode proxyMode() default ScopedProxyMode.TARGET_CLASS;
}
