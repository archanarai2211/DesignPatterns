package org.learning.creational.abstractFactory;

public class BasicAuthHttpClient extends AbstractAuthHttpClientFactory {

	@Override
	HttpClient createClient() {
		HttpClient client = new HttpClient();
		client.setMessage("Basic Auth");
		return client;
	}

	@Override
	void close() {
		// close Http client
		
	}
	
	public void setUsername() {
		
	}
	
	public void setPassword() {
		
	}
	
	

}
