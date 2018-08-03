package com.abc.factory;

import java.util.ResourceBundle;

import com.abc.provider.MessageProvider;
import com.abc.renderer.MessageRenderer;

public class MessageFactory {
	
	public static MessageRenderer geMessageRenderer() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		ResourceBundle bundle = ResourceBundle.getBundle("context");
		
		String provideStr = bundle.getString("provider");
		MessageProvider provider = (MessageProvider) Class.forName(provideStr).newInstance();
		String rendererStr = bundle.getString("renderer");
		MessageRenderer renderer = (MessageRenderer) Class.forName(rendererStr).newInstance();
		
		renderer.setMessageProvider(provider);
		
		return renderer;
		
	}

}
