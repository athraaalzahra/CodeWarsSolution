package CodeWarsSolution;


/*If we list all the natural numbers below 10 that are multiples of 3 or 5,
 we get 3, 5, 6 and 9. The sum of these multiples is 23.
Finish the solution so that it returns the sum of all the multiples of 3 or 5
below the number passed in. Additionally, if the number is negative,
return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once
 */


import java.util.ArrayList;
public class MultiplesOf3_or_5 {


	  public int solution(int number) {
	      ArrayList<Integer> x = new ArrayList<Integer>();
	        
	        int[] idk = new int[number-1];
	        int ans = 0;
	        for(int i = 0; i<number-1; i++){
	                idk[i] = i+1;
	          }
	        
	        
	        for(Integer i : idk){
	          
	          for(int j = 0; j<idk.length; j++){
	            
	            if(i*3 == idk[j] && i*5 == idk[j]){
	              x.add(idk[j]);
	              
	            }
	            
	            else if(i*3 == idk[j]){
	              if(!x.contains(idk[j])) {
	              x.add(idk[j]);
	            }}
	            
	            else if(i*5 == idk[j] && i != 3){
	              if(!x.contains(idk[j])) {
	                x.add(idk[j]);
	              }
	            }
	          }
	          
	        }
	        
	        for(int i = 0; i<x.size(); i++) {
	          ans += x.get(i);
	        }
	        
	        return ans;
	    
	    }
}

