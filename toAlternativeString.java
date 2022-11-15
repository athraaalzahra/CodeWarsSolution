package CodeWarsSolution;

/*each lowercase letter becomes uppercase
 *  and each uppercase letter becomes lowercase
 */


public class toAlternativeString {
	
	  
	  public static String ToAlternativeString(String string) {
	    
	    String[] whatever = string.split("");
	    String result = "";
	    
	    for(String i : whatever) {
	      if(i.toUpperCase() == i) {
	        result += i.toLowerCase();
	        result += " ";
	      }
	      else if(i.toLowerCase() == i) {
	        result += i.toUpperCase();
	        result += " ";
	      }
	      else {
	        result += i;
	        result += " ";
	      }
	    }
	    
	    String ans = "";
	    System.out.println(result);
	    for(int i = 0; i<result.length()-1; i++){
	      if(result.charAt(i) == ' ' && result.charAt(i+1) == ' '){
	        ans +=" ";
	      }
	      else if(result.charAt(i) != ' '){
	        ans += result.charAt(i);
	      }
	    }
	    return ans.replaceAll("\\s+"," ");
	  }
	}

