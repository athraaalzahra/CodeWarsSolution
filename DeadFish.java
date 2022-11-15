package CodeWarsSolution;

/*Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.*/



public class DeadFish {
	
	public static int[] parse(String data) {
	      
	      int len = 0;
	      int ans_int = 0;
	      int index = 0;
	      for(int i = 0; i<data.length(); i++){
	        if(data.charAt(i) == 'o'){
	          len++;
	        }
	      }
	      
	      int[] ans = new int[len];
	      
	      for(int i = 0; i<data.length(); i++){
	        
	        if(data.charAt(i) == 'i'){
	          ans_int++;
	        }
	        
	        else if(data.charAt(i) == 'd'){
	          ans_int--;
	        }
	        
	        else if(data.charAt(i) == 's'){
	          ans_int *= ans_int;
	        }
	        
	        else if(data.charAt(i) == 'o'){
	          ans[index] = ans_int;
	          index++;
	        }
	      }
	      
	      return ans;
	    }

}
