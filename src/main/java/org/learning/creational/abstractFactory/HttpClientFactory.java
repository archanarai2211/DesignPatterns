package org.learning.creational.abstractFactory;

public class HttpClientFactory {

	public static HttpClient getHttpClient(ClientType type) {
		switch(type) {
		case DEFAULT:
			DefaultHttpClient client = new DefaultHttpClient();
			return client.createClient();
		default:
			return null;
		
		}
	}
}
