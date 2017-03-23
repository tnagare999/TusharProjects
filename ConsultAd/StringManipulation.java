package ConsultAd;

import java.util.Scanner;

public class StringManipulation {

	  public static void main(String args[]){
	        
	        String s = "Username: Consultadd Password: 505";
	        String rev = new String(" ");
	        int count = s.trim().split(" ").length; 
	        int co = 0;
	        int spaces =0;
	        System.out.println("Total words in string: " + count);
	        
	        System.out.println();
	        
	        for(int i=0;i<s.length();i++)
	        {
	        	if(s.charAt(i) == ' '){
	        		spaces++;
	        	}
	            int ch=s.charAt(i);
	            if(ch>64&&ch<91)
	            {
	                ch=ch+32;
	                System.out.print( (char) ch);
	            }
	            else if(ch>96&&ch<123)
	            {
	                ch=ch-32;
	                System.out.print( (char) ch);
	            }
	            else if(ch>46&&ch<58)
	            {
	                
	                System.out.print( (char) ch);
	            }
	            else {
	            	System.out.print( (char) ch);
	            	co++;
	            	
	            }

	        }
	        
	       System.out.println("\n\nno of special characters are:"+co);
	       System.out.println("\nNo of Spaces: "+spaces);
	       for(int j = s.length()-1; j>=0; j--) {
	    	   rev += s.charAt(j);
	       }
	       System.out.println("\n"+rev);
	       
	        
	    }

}
