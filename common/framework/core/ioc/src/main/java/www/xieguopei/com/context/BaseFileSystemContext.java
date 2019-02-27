package www.xieguopei.com.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public final class BaseFileSystemContext extends FileSystemXmlApplicationContext {
    public BaseFileSystemContext() {
    }

    public BaseFileSystemContext(ApplicationContext parent) {
        super(parent);
    }

    public BaseFileSystemContext(String configLocation) throws BeansException {
        super(configLocation);
    }

    public BaseFileSystemContext(String... configLocations) throws BeansException {
        super(configLocations);
    }

    public BaseFileSystemContext(String[] configLocations, ApplicationContext parent) throws BeansException {
        super(configLocations, parent);
    }

    public BaseFileSystemContext(String[] configLocations, boolean refresh) throws BeansException {
        super(configLocations, refresh);
    }

    public BaseFileSystemContext(String[] configLocations, boolean refresh, ApplicationContext parent) throws BeansException {
        super(configLocations, refresh, parent);
    }
}
