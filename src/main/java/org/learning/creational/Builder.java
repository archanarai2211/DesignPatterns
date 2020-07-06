package org.learning.creational;

public class Builder {
	
	//Inner static class
	public static class UriBuilder{
		private String path;
		private String method;
		private String body;
		
		public UriBuilder() {
			
		}
		
		public Builder build() {
			return new Builder(this);
		}
		
		public UriBuilder path(String path) {
			this.path = path;
			return this;
		}
		
		public UriBuilder body(String body) {
			this.body = body;
			return this;
		}
		
		public UriBuilder method(String method) {
			this.method = method;
			return this;
		}
	}

	//Immutable values
	private final String path;
	private final String method;
	private final String body;
	
	public Builder(UriBuilder uriBuilder) {
		this.path = uriBuilder.path;
		this.method = uriBuilder.method;
		this.body = uriBuilder.body;
	}
	
	public void value() {
		System.out.println(this.method + "  "+ this.path);
		System.out.println(this.body);
	}

	public static void main(String[] args) {
		Builder.UriBuilder uriBuilder = new UriBuilder();
		Builder builder = uriBuilder.method("POST").path("http://google.com").body("Hello").build();
		builder.value();
	}

}
