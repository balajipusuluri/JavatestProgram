package programmingjava;

public class Comaparesubstring {
		   public static void main(String[] args) {
		      String str1 = "Balaji Pusuluri";
		      String str2 = "Pusuluri";
		      String substr = str1.substring(7);
		      boolean result = substr.equals(str2);
		      if (result) {
		         System.out.println("str1 is equal to str2");
		      } else {
		         System.out.println("str1 is not equal to str2");
		      }
		   }
		}


