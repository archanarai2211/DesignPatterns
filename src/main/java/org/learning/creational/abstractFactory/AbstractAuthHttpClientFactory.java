package org.learning.creational.abstractFactory;

public abstract class AbstractAuthHttpClientFactory {

	
	abstract HttpClient createClient();
	
	abstract void close();
	
	public static HttpClient getHttpClient(ClientType type) {
		switch(type) {
		case BASIC:
			BasicAuthHttpClient basic =  new BasicAuthHttpClient();
			return basic.createClient();
		case OAUTH:
			OAuthHttpClientImpl oauth = new OAuthHttpClientImpl();
			return oauth.createClient();
		default:
			return null;
		}
	}
}
