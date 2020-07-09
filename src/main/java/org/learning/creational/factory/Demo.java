package org.learning.creational.factory;

public class Demo {

	public static void main(String[] args) {
		Template mustache = TemplateFactory.getTemplate("Mustache");
		System.out.println(mustache.getTemplateData());
		Template freemarker = TemplateFactory.getTemplate("Freemarker");
		System.out.println(freemarker.getTemplateData());

	}

}
