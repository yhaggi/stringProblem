package com.java.practice;

/*Write methods for each solution.

Afterwards, write a TestNG or JUnit class for each solution which tests these methods.<br>
Include both positive and negative cases for validations.
*/
import static org.junit.Assert.*;
import org.junit.Test;

public class stringClassTest {

	//String = "MART", char = "M" 
	//String = "", char = 'a'
	//String = "ABCD" char = 'M'
	//String = "ABCD      EFGH    ! $ # * 3 %" char = " "
	@Test
	public void positiveTest() {
    String output = stringClass.remove("MART", 'M');
    assertEquals(output,"ART");
    
    String replace = stringClass.replaceAllChar("MART", 'M');
    assertEquals(replace,"ART");
	}
	@Test
	public void blankStringTest() {
	    String output = stringClass.remove("", 'M');
	    assertEquals(output,"");
	    
	    String replace = stringClass.replaceAllChar("", 'M');
	    assertEquals(replace,"");
		}
	@Test
	public void noMatchingCharTest() {
	    String output = stringClass.remove("ABCD", 'M');
	    assertEquals(output,"ABCD");
	    
	    String replace = stringClass.replaceAllChar("ABCD", 'M');
	    assertEquals(replace,"ABCD");
		}
	
	@Test
	public void stringWithSpacesTest() {
	    String output = stringClass.remove("ABCD      EFGH    ! $ # * 3 %", ' ');
	    assertEquals(output,"ABCDEFGH!$#*3%");
	    
	    String replace = stringClass.replaceAllChar("ABCD      EFGH    ! $ # * 3 %", ' ');
	    assertEquals(replace,"ABCDEFGH!$#*3%");
		}

}
