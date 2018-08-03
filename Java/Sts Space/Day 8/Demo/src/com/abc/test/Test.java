package com.abc.test;

import com.abc.factory.MessageFactory;
import com.abc.renderer.MessageRenderer;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		MessageRenderer renderer = MessageFactory.geMessageRenderer();
		
		renderer.render();
	}

}
