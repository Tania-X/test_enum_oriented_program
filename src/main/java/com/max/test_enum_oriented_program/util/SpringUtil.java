package com.max.test_enum_oriented_program.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.ObjectUtils;

public class SpringUtil implements ApplicationContextAware {

  private static ApplicationContext applicationContext = null;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    if (ObjectUtils.isEmpty(applicationContext)) {
      SpringUtil.applicationContext = applicationContext;
    }
  }

  public static ApplicationContext getApplicationContext() {
    return applicationContext;
  }

  public static Object getBean(String beanName) {
    return getApplicationContext().getBean(beanName);
  }

  public static <T> T getBean(Class<T> clazz) {
    return applicationContext.getBean(clazz);
  }
}
