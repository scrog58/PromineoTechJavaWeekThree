
public class PromineoTechJavaWeekThree {

public static void main(String[] args) {
		//Part 1 Integers
//		int[] ages = new int[9];
//		ages[0] = 3;
//		ages[1] = 9;
//		ages[2] = 23;
//		ages[3] = 64;
//		ages[4] = 2;
//		ages[5] = 8;
//		ages[6] = 28;
//		ages[7] = 93;
					
//		//question says can't use age[0]
//		int first = ages[ages.length-ages.length];
//		int last = ages[ages.length-1];
//		 
//		//subtract the last number from the first number(Part 1)
//		int problemA = last - first;
//		//System.out.println(problemA);
//		 
//		//add new age to value
//		ages[8] = 100;
//		last = ages[ages.length-1];
//
//		//subtract the last number from the first number(Part 2)
//		int problemB = last - first;
//		System.out.println(last);
//		System.out.println(problemB);
//		double getSum = 0;
//		//get the average of the ages
//		for(int i = 0; i < ages.length; i++) {
//		     getSum += ages[i];  
//		}
//		Double ageAverage = getSum / ages.length;
//		System.out.println(ageAverage); 

		//Part 2 Strings

//		String[] names = new String[6];
//		names[0] =  "Sam"; 
//		names[1] =  "Tommy"; 
//		names[2] =  "Tim";
//		names[3] = "Sally";
//		names[4] = "Buck";
//		names[5] = "Bob";
	
		
//		double  nameletterSum = 0;
		//average per character per name
//		for(int i = 0; i < names.length; i++) {
//			nameletterSum += names[i].length();
//		}
//		Double letterAvg = nameletterSum / names.length;
//		System.out.println(letterAvg);

		//list names space
//		for(int i = 0; i < names.length; i++) {
//		     String showNames = names[i] + " ";
//		     System.out.print(showNames);
//		 
//		} 
		System.out.print("\n");
		//first and last
//		String firstNameInArray = names[names.length - names.length];
//		String lastnameInArray = names[names.length - 1];
		
		//move array lenght into the nameLenghts array
//		int[] nameLenghts = new int[6];
//		for(int i = 0; i < names.length; i++) {
//			nameLenghts[i] = names[i].length();
//		}
//		
//		int getSumOfLenghts = 0;
//		//sum the nameLenghts array
//		for(int i = 0; i < nameLenghts.length; i++) {
//			getSumOfLenghts += nameLenghts[i];
//		}
//		System.out.println(getSumOfLenghts);
//		
//		//show name plus the amount of characters in the name
//		for(int i = 0; i < names.length; i++) {
//		    System.out.println(names[i]+": "+ names[i].length());
//		}
	
//test the over 100 array method		
//int[] numbers = {1, 5, 3,100};
//double[] array1 = {1,3,4,6,7,9};
//double[] array2 = {1,4,5};
////System.out.println(WeekThreeQNine(numbers));
//
//System.out.println(wordPrint("Hello", 3));		
//System.out.println(fullName("Tom", "Sawyer"));
//System.out.println(WeekThreeQNine(numbers));
//System.out.println(wordPrint("Hello", 3));		
//System.out.println(fullName("Tom", "Sawyer"));
//System.out.println(WeekThreeQNine(numbers));
//System.out.println(doubleGetAverage(array1));
//System.out.println(doubleAverageWhichIsGreat(array1, array2));
//System.out.println(willBuyDrink(true, 20));
//payOffBillNever(25000, 560);
}



	
//method Q7
//with a return	
public static String wordPrint(String word, int n) {
	String getWord = "";
	       for(int i = 0; i < n; i++) {
	          //System.out.println(word);
	         getWord += word;
	     }
	       return getWord;
	}
//void
public static void wordPrintVoid(String word, int n) {
	      for(int i = 0; i < n; i++) {
	          System.out.print(word);
	     }
	}

	
public static int power(int base, int exponent) {
	int product = 1;
	for(int i = 0; i < exponent; i++) {
		product = product * base;
	}
	return product;
	}

//method Q8
public static String fullName(String firstName, String lastName) {
	       return firstName + " " + lastName;


	}

//method Q9
public static boolean WeekThreeQNine(int[] num) {
		int total = 0;
	    for(int i = 0; i < num.length; i++) {
	         total += num[i];

	     }
	    return (total > 100);
	    		

}
	
//method Q10
public static double doubleGetAverage(double[] n) {
		double total = 0;
	      for(int i = 0; i < n.length; i++) {
	           total += n[i];
	           
	        }
	      total = total / n.length;
	      return total;

	}


// method Q11
public static boolean doubleAverageWhichIsGreat(double[] n1, double[]n2) {
		double totalAOne = 0;
		double totalATwo = 0;
		
	    for(int i = 0; i < n1.length; i++) {
               totalAOne += n1[i];
	           
	     }
	     totalAOne = totalAOne / n1.length;

	     for(int i = 0; i < n2.length; i++) {
	              totalATwo += n2[i];
	              }
	     
	    totalATwo = totalATwo / n2.length;

	    return totalAOne > totalATwo;
	 

	}

	 

//method Q12
public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	  return isHotOutside && (moneyInPocket > 10.50);

	   
	}

	 

	 

/*method Q13
What this method is for: telling the user how much they still owe after the month payment.
amountOwed: what the user currently owes
Interest: rate is 16%
loanAmount: the load ask was 30000
Number of payments is once a month there are 12 months in a year
repayment: the monthly amount the user is paying into the load

*/

public static void payOffBillNever(double amountOwed, double repayment) {
	double loanAmount = 30000; 
	double interest = (0.16/12) * loanAmount;
	double newAmountOwed = amountOwed - (repayment - interest);
	System.out.println("You now owe: " + newAmountOwed);
	         
	}
	


}
