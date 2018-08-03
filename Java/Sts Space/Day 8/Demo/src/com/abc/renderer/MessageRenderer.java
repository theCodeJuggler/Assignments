package com.abc.renderer;

import com.abc.provider.MessageProvider;

public interface MessageRenderer {
	
	public void render();
	public void setMessageProvider(MessageProvider provider);

}
