package com.praveennaga.string;

public class StringExercise {
	
	public static void main(String args[]) {
		
		String s1 = "aabcccaaaa";
		System.out.println(compress(s1));//"a2b1c3a4"		
	}
	
	
	public static String compress(String s){
        StringBuffer sb = new StringBuffer();
        
        int i,j;
        for(i = 0; i < s.length(); i++){
            j = i + 1;
            while(j < s.length() && s.charAt(j) == s.charAt(i)){
                j++;
            }
            
            sb.append(s.charAt(i));
            sb.append(j - i);
            
            i = j - 1;
        }
        
        String sbString = sb.toString();
        return sbString.length() <= s.length()? sbString.toString() : s;
    }

}
