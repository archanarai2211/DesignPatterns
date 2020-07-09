package org.learning.creational.abstractFactory;

public class DefaultHttpClient {

	public HttpClient createClient() {
		HttpClient client = new HttpClient();
		client.setMessage("No Auth");
		return client;
	}

	
}
