package org.learning.creational.abstractFactory;

public class AbstractHttpClientFactory {

	public static HttpClient getHttpClient(ClientType type) {
		switch(type) {
		case DEFAULT:
			return HttpClientFactory.getHttpClient(type);
		default:
			return AbstractAuthHttpClientFactory.getHttpClient(type);
		}
	}
}
