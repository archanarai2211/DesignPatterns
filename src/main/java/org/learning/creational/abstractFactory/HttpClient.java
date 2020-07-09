package org.learning.creational.abstractFactory;

public class HttpClient {
//dummy Http client
	String msg;

public void setMessage(String msg) {
	this.msg = msg;
}

	public void getDetails() {
		System.out.println(msg);
	}
}
