package com.praveennaga.others;

import java.util.Arrays;
import java.util.List;

public class Example {
	
	
	public static void main(String args[]) {
		
		String key="ABC,DEF,LOP";		
		String val="aBc";
		
		if(key!=null && val!=null) {
			String keys[]= key.split(",");
			List<String> keyList= Arrays.asList(keys);
			if(keyList.size()>0 && keyList.contains(val.toUpperCase())) {
				System.out.println("Present");
			}else {
				System.out.println("Not Present");
			}
		}
	}

}
