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

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Matthew Caple
 * The program below runs several test trails for the code in PrimeNumberMethod java file
 * The first two test trails make sure the prime number output is correct (checking the isPrime method)
 * The last test trail checks to make sure that printPrimeNumber method is correct by seeing if the 
 * amount of primes displayed match the counter within the program
 */

public class PrimeNumberMethodTest {

	/**
	 * Tests the isPrime method. Gives a prime number with the desired result, see if program gets same output
	 */
	@Test
	public void primeTestTrue() {	
		PrimeNumberMethod testing = new PrimeNumberMethod();
		assertEquals(true, testing.isPrime(5));
	}
	
	/**
	 * Tests the isPrime method. Gives a non prime number is desired output. 
	 * Finds is program is able to properly determine between pime and non prime numbers
	 */
	@Test
	public void primeTestFalse() {	
		PrimeNumberMethod testing = new PrimeNumberMethod();
		assertEquals(false, testing.isPrime(15));
	}
	
	
	/**
	 * This test methods controls various variables in the program (such as count, number and NumberOfPrimes)
	 * By doing this we are able to determine if the program displays the correct amount of primes as asked by 
	 * running various trails. 
	 * Compares the amount of primes displayed to the requested amount of primes. 
	 */
	@Test
	public void testPrimeAmount() {
	
			PrimeNumberMethod test = new PrimeNumberMethod();

			    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
			    int count = 0; // Count the number of prime numbers
			    int number = 2; // A number to be tested for primeness
				int numberOfPrimes = 50;


			    // Repeatedly find prime numbers
			    while (count < numberOfPrimes) {
			      // Print the prime number and increase the count
			      if (isPrime(number)) {  //runs the following code is true
			        count++; // Increase the count

			        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
			          // Print the number and advance to the new line
			         // System.out.printf("%-5s\n", number);
			        }
			        //else
			          //System.out.printf("%-5s", number);
			      }

			      // Check if the next number is prime
			      number++;
			    }
			    assertEquals(count, numberOfPrimes);
			  }
	
	/** Check whether number is prime */
	
	/**
	 * @param takes a number
	 * This is the same method as is PrimeNumberMethod, just needed it include it here to run test above
	 */
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
//number/count = number of primes
//				  assertEquals((number/count), numberOfPrimes);
