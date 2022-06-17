package com.yq;


import com.yq.config.MyConfig;
import com.yq.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);

		System.out.println(ac.getBean(User.class));
	}
}
