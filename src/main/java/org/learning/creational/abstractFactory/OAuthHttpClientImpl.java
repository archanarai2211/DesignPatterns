package org.learning.creational.abstractFactory;

public class OAuthHttpClientImpl extends AbstractAuthHttpClientFactory {

	@Override
	HttpClient createClient() {
		HttpClient client = new HttpClient();
		client.setMessage("OAuth");
		return client;
	}

	@Override
	void close() {
		// TODO Auto-generated method stub
		
	}
	
	public void setOAuthToken(String token) {
		
	}

}
