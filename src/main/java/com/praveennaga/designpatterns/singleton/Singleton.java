package com.praveennaga.designpatterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

	public static Singleton soleInstance = null;

	private Singleton() {
		
		// Fixing Reflection
		if (soleInstance != null) {
			throw new RuntimeException(
					"Cannot create, please use getInstance()");
		}
		// proceed with creation
		System.out.println("Creating....");
	}
	
	// using synchronized for fixing multithreaded issue

	public static Singleton getInstance() {
		// Double check locking
		if (null == soleInstance) {
			synchronized(Singleton.class){
				if(null== soleInstance){
					soleInstance = new Singleton();
				}
			}
		}
		return soleInstance;

	}

	protected Object Clone() throws CloneNotSupportedException {
		// fixing cloning issue
		throw new CloneNotSupportedException();
		//return super.clone();
	}
	
	// Fixing Serialization issue
	private Object readResolve() throws ObjectStreamException{
		System.out.println("... readresolve"); 
		return soleInstance;
	}

}
