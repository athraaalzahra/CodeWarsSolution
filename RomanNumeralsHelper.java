package CodeWarsSolution;


/*Create a RomanNumerals class that can convert a roman numeral to and from an integer value.
 It should follow the API demonstrated in the examples below. 
 Multiple roman numeral values will be tested for each helper method.

Modern Roman numerals are written by expressing each digit separately starting with the left most d
igit and skipping any digit with a value of zero.
In Roman numerals 1990 is rendered: 1000=M, 900=CM,
 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
  1666 uses each Roman symbol in descending order: MDCLXVI.
Input range : 1 <= n < 4000

In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").*/

public class RomanNumeralsHelper {

	public static String toRoman(int n) {
	    String resul = "";
	    while (n >= 1000) {
	        resul += "M";
	        n -= 1000;        }
	    while (n >= 900) {
	        resul += "CM";
	        n -= 900;
	    }
	    while (n >= 500) {
	        resul += "D";
	        n -= 500;
	    }
	    while (n >= 400) {
	        resul += "CD";
	        n -= 400;
	    }
	    while (n >= 100) {
	        resul += "C";
	        n -= 100;
	    }
	    while (n >= 90) {
	        resul += "XC";
	        n -= 90;
	    }
	    while (n >= 50) {
	        resul += "L";
	        n -= 50;
	    }
	    while (n >= 40) {
	        resul += "XL";
	        n -= 40;
	    }
	    while (n >= 10) {
	        resul += "X";
	        n -= 10;
	    }
	    while (n >= 9) {
	        resul += "IX";
	        n -= 9;
	    }
	    while (n >= 5) {
	        resul += "V";
	        n -= 5;
	    }
	    while (n >= 4) {
	        resul += "IV";
	        n -= 4;
	    }
	    while (n >= 1) {
	        resul += "I";
	        n -= 1;
	  }
	    return resul;
	    }
	  
	  public static int fromRoman(String romanNumeral) {
	    int result = 0;
	    int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    for (int i = 0; i < decimal.length; i++ ) {
	    while (romanNumeral.indexOf(roman[i]) == 0) {
	        result += decimal[i];
	        romanNumeral = romanNumeral.substring(roman[i].length());
	  }
	      }
	    return result;
	    }
	
}
