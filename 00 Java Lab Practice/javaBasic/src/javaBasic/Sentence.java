package javaBasic;

import java.util.*;
public class Sentence {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s =scan.nextLine();
		System.out.println("Enter word to find");
		String word =scan.nextLine();
		System.out.println("No. of occurance "+occurance(s,word));
		
	}
	public static int occurance(String s, String word){
		String w="";
		s=s.trim();
		word=word.trim();
		int count=0;
		for(int i=0; i<s.length(); i++){
			char ch =s.charAt(i);
			if(ch!=' '){
				w=w+s.charAt(i);
			}
			else{
				w="";
			}
			if(w.equalsIgnoreCase(word)){
				w="";
				count++;
			}
			
		}
		return count;
	}

}
