package www.xieguopei.com.context;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public final class BaseGenericContext extends GenericApplicationContext {
    public BaseGenericContext() {
    }

    public BaseGenericContext(DefaultListableBeanFactory beanFactory) {
        super(beanFactory);
    }

    public BaseGenericContext(ApplicationContext parent) {
        super(parent);
    }

    public BaseGenericContext(DefaultListableBeanFactory beanFactory, ApplicationContext parent) {
        super(beanFactory, parent);
    }
}
