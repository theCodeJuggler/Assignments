package com.abc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.factory.MessageFactory;
import com.abc.renderer.MessageRenderer;

public class Test {

	public static void main(String[] args){

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		MessageRenderer renderer = (MessageRenderer) context.getBean("renderer");

		renderer.render();
	}

}
