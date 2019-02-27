package www.xieguopei.com.handler;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.context.annotation.SessionScope;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@SessionScope
public @interface BaseSessionScope {
    @AliasFor(
            annotation = SessionScope.class
    )
    ScopedProxyMode proxyMode() default ScopedProxyMode.TARGET_CLASS;
}
