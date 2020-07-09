package org.learning.creational.factory;

public class TemplateFactory {
	
	public static Template getTemplate(String template) {
		switch(template) {
			case "Mustache":
				return new MustacheTemplate();
			case "Freemarker":
				return new FreemarkerTemplate();
			default:
				return null;
		}
		
	}

}
