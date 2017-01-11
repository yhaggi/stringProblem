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
	public void positiveTest1() {
    String output = stringClass.remove("MART", 'M');
    assertEquals(output,"ART");
    
	}
	@Test
	public void positiveTest2() {
	    String output = stringClass.replaceAllChar("MART", 'M');
	    assertEquals(output,"ART");
	  
		}
	
	@Test
	public void blankStringTest1() {
	    String output = stringClass.remove("", 'M');
	    assertEquals(output,"");
	}
	@Test
	public void blankStringTest2() {
	    
	    String replace = stringClass.replaceAllChar("", 'M');
	    assertEquals(replace,"");
		}
	@Test
	public void noMatchingCharTest1() {
	    String output = stringClass.remove("ABCD", 'M');
	    assertEquals(output,"ABCD");
	    
		}
	@Test
	public void noMatchingCharTest2() {
	    String output = stringClass.replaceAllChar("ABCD", 'M');
	    assertEquals(output,"ABCD");
	  
		}
	
	@Test
	public void stringWithSpacesTest1() {
	    String output = stringClass.remove("ABCD      EFGH    ! $ # * 3 %", ' ');
	    assertEquals(output,"ABCDEFGH!$#*3%");
	    
		}
	@Test
	public void stringWithSpacesTest2() {
	    String replace = stringClass.replaceAllChar("ABCD      EFGH    ! $ # * 3 %", ' ');
	    assertEquals(replace,"ABCDEFGH!$#*3%");
		}
	@Test
	public void spacesTest1() {
	    String output = stringClass.remove(" ", ' ');
	    assertEquals(output," ");
	    
		}
	@Test
	public void spacesTest2() {
	    String replace = stringClass.replaceAllChar(" ", ' ');
	    assertEquals(replace,"");
		}
	
}
