package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Girl implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean, GoodGirl {
    public Girl() {
        System.out.println("Girl : Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("Hi.. Hi..");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl : BeanFactoryAware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Girl : BeanNameAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl : Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl : Initializing");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl : ApplicationContextAware");
    }
}
