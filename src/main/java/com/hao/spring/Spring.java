package com.hao.spring;

import com.hao.service.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Teddy
 * @date 2019年3月18日 10:37:52
 */
public class Spring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("services.xml");
        TestBean testBean = (TestBean) classPathXmlApplicationContext.getBean("testBean");
        System.out.println(testBean.hello());
    }
}
