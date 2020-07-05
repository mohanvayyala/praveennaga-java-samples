package com.praveennaga.designpatterns.singleton;

public class EnumSingletonTest {
	
	static EnumSingleton useSingleton(){
		EnumSingleton s= EnumSingleton.INSTANCE;
	 return s;
    }

	public static void main(String[] args) throws Exception {
		EnumSingleton s1= useSingleton();
		EnumSingleton s2=useSingleton();
		System.out.println(s1==s2);
	}
}
