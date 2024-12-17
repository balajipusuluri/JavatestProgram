package programmingjava;

	import java.util.*;
	import java.util.regex.*;

	public class DescendingIntegers {
	    public static void main(String[] args) {
	        // The input string
	        String input = "A summer trip to 123 India 47, witnessing majestic tigers like Bajrang in Bandhavgarh National 10 Park, must have felt like stepping into a dream. Seeing a dominant male tiger thriving in his territory, 6 , spanning both Khitauli and Magdhi, underscores, 7, the importance of tiger 67 conservation.";
	        
	        // Use regular expression to find all integers in the string
	        List<Integer> numbers = new ArrayList<>();
	        Pattern pattern = Pattern.compile("\\d+");
	        Matcher matcher = pattern.matcher(input);
	        
	        // Extract all integers from the string
	        while (matcher.find()) {
	            numbers.add(Integer.parseInt(matcher.group()));
	        }
	        
	        // Sort the numbers in descending order
	        Collections.sort(numbers, Collections.reverseOrder());
	        
	        // Print the numbers in descending order
	        System.out.println("Numbers in descending order:");
	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }
	    }
	}


