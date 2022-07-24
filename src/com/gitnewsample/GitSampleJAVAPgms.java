package com.gitnewsample;

import java.util.LinkedHashMap;
import java.util.Map;

public class GitSampleJAVAPgms {

	
	  public static void main(String[] args) {
	      //System.out.println("Hello, World!"); 
//	      String s="Suganya";
//	      String output="";
//	      for(int i=s.length()-1;i>=0;i--){
//	          char c=s.charAt(i);
//	          output=output+c;
//	      }
//	      output=output+"";
//	    System.out.println(output);
//	   
	    
	    String s1="java";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0; i<s1.length(); i++){
            char c=s1.charAt(i);
            if(map.containsKey(c)){
                Integer in=map.get(c);
                map.put(c,in+1);
            }
            else{
                map.put(c,1);
            }
            System.out.println(map);
            System.out.println(map);
        }
        
        
        
	    
	    
	    
	    }   
	  
}
