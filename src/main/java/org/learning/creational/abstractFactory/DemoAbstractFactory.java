package org.learning.creational.abstractFactory;

public class DemoAbstractFactory {

	public static void main(String[] args) {
		HttpClient client = AbstractHttpClientFactory.getHttpClient(ClientType.BASIC);
		client.getDetails();
		client = AbstractHttpClientFactory.getHttpClient(ClientType.OAUTH);
		client.getDetails();
		client = AbstractHttpClientFactory.getHttpClient(ClientType.DEFAULT);
		client.getDetails();
	}

}
