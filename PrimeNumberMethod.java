/*
 * Class: CMSC201 
 * Instructor:Dr. Grinberg 
 * Description: Write test trails for PrimeNumberMethod.java
 * Due: 05/06/24
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Matthew Caple
*/

/**
 * @author Matthew Caple
 * 
 */
public class PrimeNumberMethod{
	/**
	 * @param args
	 * Calls the methods below
	 */
	 public static void main(String[] args) {
		    System.out.println("The first 50 prime numbers are \n");
		    printPrimeNumbers(50);
		  }

		/**
		 * @param a number to determine amount of numbers to find
		 * This method gose though each number and determines if it is prime or not
		 * If number is prime it gets dsiplayed, if not nothing gets displayed
		 * Program dose this until it reaches desired prime numbers displayed
		 */
		  public static void printPrimeNumbers(int numberOfPrimes) {
		    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		    int count = 0; // Count the number of prime numbers
		    int number = 2; // A number to be tested for primeness

		    // Repeatedly find prime numbers
		    while (count < numberOfPrimes) {
		      // Print the prime number and increase the count
		      if (isPrime(number)) {  //runs the following code is true
		        count++; // Increase the count

		        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
		          // Print the number and advance to the new line
		          System.out.printf("%-5s\n", number);
		        }
		        //else
		          System.out.printf("%-5s", number);
		      }

		      // Check if the next number is prime
		      number++;
		    }
		  }
		  /** Check whether number is prime */
		  
			/**
			 * @param A number, every number that gets run though the loop above gets passed to this method
			 * This method determines if the number (when divided by a anther number that is not itself or 1)
			 * has a remainder. If it has a remainder it is not a prime (false) if it dose, the number is prime (true)
			 * @return a bool that shows weather or not the number given is a prime or not			
			 *  */
		  public static boolean isPrime(int number) {
		    for (int divisor = 2; divisor <= number / 2; divisor++) {
		    	//System.out.println("Number are" + divisor);
		      if (number % divisor == 0) { // If true, number is not prime
		        return false; // number is not a prime
		      }
		    }

		    return true; // number is prime
		  }
		}


//Prime numbers can only be divded by itself and 1 and not have a remainder
 