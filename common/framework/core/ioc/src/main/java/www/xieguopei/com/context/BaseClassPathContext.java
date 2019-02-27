package www.xieguopei.com.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public final class BaseClassPathContext extends ClassPathXmlApplicationContext {
    public BaseClassPathContext() {
        super();
    }

    public BaseClassPathContext(ApplicationContext parent) {
        super(parent);
    }

    public BaseClassPathContext(String configLocation) throws BeansException {
        super(configLocation);
    }

    public BaseClassPathContext(String... configLocations) throws BeansException {
        super(configLocations);
    }

    public BaseClassPathContext(String[] configLocations, ApplicationContext parent) throws BeansException {
        super(configLocations, parent);
    }

    public BaseClassPathContext(String[] configLocations, boolean refresh) throws BeansException {
        super(configLocations, refresh);
    }

    public BaseClassPathContext(String[] configLocations, boolean refresh, ApplicationContext parent) throws BeansException {
        super(configLocations, refresh, parent);
    }

    public BaseClassPathContext(String path, Class<?> clazz) throws BeansException {
        super(path, clazz);
    }

    public BaseClassPathContext(String[] paths, Class<?> clazz) throws BeansException {
        super(paths, clazz);
    }

    public BaseClassPathContext(String[] paths, Class<?> clazz, ApplicationContext parent) throws BeansException {
        super(paths, clazz, parent);
    }

    @Override
    protected Resource[] getConfigResources() {
        return super.getConfigResources();
    }
}
