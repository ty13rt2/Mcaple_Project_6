/*
 * Class: CMSC201 
 * Instructor:Dr. Grinberg 
 * Description: Write test trails for four different string methods (length, charAt, subString, indexOf()
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
 * The program below cotains two test methods for each method in the String test java file
 * One method determine if the method works properly, second make double checks by giving wrong data
 */

public class StringTestTest {
		
	/**
	 * Tests to make sure length method works by giving it five a param and checking to output to be 4
	 */
		@Test
		public void testLength() {
			StringTest testing = new StringTest();
			assertEquals(4, testing.len("five"));
		}
	
		/**
		 * Tests to make sure length method works by giving it a string with wrong legnth of string 
		 */
		@Test
		public void testNotLength() {
			StringTest testing = new StringTest();
			assertNotEquals(12, testing.len("fox and hound"));
		}
		
		/**
		 * Tests to make sure At method works by giving a string, element postion, and the correct letter at that postion
		 */
		@Test
		public void testAt() {
			StringTest testing = new StringTest();
			assertEquals('n', testing.at("batman and joker king", 8));
		}
		
		/**
		 * Tests to make sure At method works by giving wrong data
		 * Gives string, element and wrong letter at that element
		 */
		@Test
		public void testNotAt() {
			StringTest testing = new StringTest();
			assertNotEquals('k', testing.at("batman and joker king", 8));
		}
		
		/**
		 * Tests to make sure substring method works by giving it string, start and end point for substring and desired output
		 */
		@Test
		public void testSub() {
			StringTest testing = new StringTest();
			assertEquals("nd th", testing.sub("dog and the cat", 5, 10 ));
		}
		/**
		 * Tests to make sure substring method works by giving it string, start and end
		 * point with wrong output, checks to make sure not everything works
		 */
		@Test
		public void testNotSub() {
			StringTest testing = new StringTest();
			assertNotEquals("dog w", testing.sub("My dog wears a hat", 10, 15 ));
		}
		
		/**
		 * Checks to make sure IndexOF() method works by giving it string, a letter and desire location of that letter
		 */
		@Test
		public void testDex() {
			StringTest testing = new StringTest();
			assertEquals(1, testing.dex("ice cream", 'c'));
		}
		
		/**
		 * Checks to make sure IndexOF() method works by giving it string, a letter and a wrong location of that letter
		 */
		@Test
		public void testNotDex() {
			StringTest testing = new StringTest();
			assertNotEquals(3, testing.dex("hot diggity dog", '0'));
		}
		
	}
