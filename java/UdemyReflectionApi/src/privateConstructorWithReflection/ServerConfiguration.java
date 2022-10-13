package privateConstructorWithReflection;

import java.net.InetSocketAddress;

public class ServerConfiguration {
	
	private static ServerConfiguration serverConfigurationInstance;

	private final InetSocketAddress serverAddress;
	private final String greeetingMessage;
	
	private ServerConfiguration(int port, String greetingMessage) {
		
		this.serverAddress = new InetSocketAddress("localhost", port);
		this.greeetingMessage=greetingMessage;
		
		if(serverConfigurationInstance == null) {
			serverConfigurationInstance =this;
		}
	}//constructor(-,-)
	
	public ServerConfiguration getInstance() {
		return serverConfigurationInstance;
	}

	public InetSocketAddress getServerAddress() {
		return serverAddress;
	}

	public String getGreeetingMessage() {
		return greeetingMessage;
	}
	
	
}
