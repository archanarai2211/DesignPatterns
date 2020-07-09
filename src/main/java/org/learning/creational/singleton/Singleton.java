package org.learning.creational.singleton;

public class Singleton {
	
	//static for single reference and volatile for thread safe
	//static variable get space in heap post java 8
	//lazy loading so initialize with null
	private static volatile Singleton instance = null;
	
	//private constructor to ensure that new instance can be created only through getInstance
	//nobody can invoke constructor
	//through error if invoked from reflection
	private Singleton() {
		if(instance != null)
			throw new RuntimeException("Use getInstance() to create");
	}

	//Singleton pattern does not take arguments
	//lazy loading so initializing it here
	//Here, we run into a problem. Suppose that 
	//there are two threads running. Both can get 
	//inside of the if statement concurrently when 
	//the instance is null. Then, one thread enters 
	//the synchronized block to initialize the instance, 
	//while the other is blocked. When the first thread exits 
	//in the synchronized block, the waiting thread enters and 
	//creates another singleton object. Note that when the 
	//second thread enters the synchronized block, 
	//it does not check to see if the instance is non-null.
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
			
		}
		return instance;
	}
	
	public void printInstance() {
		System.out.println("SingletonInstance");
	}
	
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.printInstance();
		

	}
}
