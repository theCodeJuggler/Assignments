package com.abc.renderer;

import com.abc.provider.MessageProvider;

public class PDFMessageRenderer implements MessageRenderer{
	
	private MessageProvider provider;
	
	@Override
	public void render() {
		System.out.println(provider.getMessage() + " On PDF :-D ");
	}
	
	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.provider = messageProvider;
	}
}
