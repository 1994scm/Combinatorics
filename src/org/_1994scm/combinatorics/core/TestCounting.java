/**
 * 
 */
package org._1994scm.combinatorics.core;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Sean
 *
 */
public class TestCounting {

	/**
	 * Test method for {@link org._1994scm.combinatorics.core.Counting#factorial(int)}.
	 * @throws CombinatorialException 
	 */
	@Test
	public void testFactorial() throws CombinatorialException {
		assertEquals(6, Counting.factorial(3));
		assertEquals(1, Counting.factorial(0));
		assertEquals(1, Counting.factorial(1));
		assertEquals(3628800, Counting.factorial(10));
		assertEquals(39916800, Counting.factorial(11));
		assertEquals(479001600, Counting.factorial(12));
	    try {
	        Counting.factorial(-1);
	        fail("Expected an CombinatorialException.");
	    } catch (CombinatorialException e) {
	        assertEquals(e.getMessage(), "Negative Value Not Allowed.");
	    }
	    
	    try {
	        Counting.factorial(-123);
	        fail("Expected an CombinatorialException.");
	    } catch (CombinatorialException e) {
	        assertEquals(e.getMessage(), "Negative Value Not Allowed.");
	    }
	}

	/**
	 * Test method for {@link org._1994scm.combinatorics.core.Counting#binomial(int, int)}.
	 * @throws CombinatorialException 
	 */
	@Test
	public void testBinomial() throws CombinatorialException {
		assertEquals(6, Counting.binomial(3, 2));
	}

	/**
	 * Test method for {@link org._1994scm.combinatorics.core.Counting#multinomial(int, int[])}.
	 */
	@Test
	public void testMultinomial() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org._1994scm.combinatorics.core.Counting#permutations(int)}.
	 */
	@Test
	public void testPermutationsInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org._1994scm.combinatorics.core.Counting#permutations(int, int[])}.
	 */
	@Test
	public void testPermutationsIntIntArray() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org._1994scm.combinatorics.core.Counting#lists(int, int, boolean)}.
	 */
	@Test
	public void testLists() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org._1994scm.combinatorics.core.Counting#subsets(int, int)}.
	 */
	@Test
	public void testSubsets() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org._1994scm.combinatorics.core.Counting#multisets(int, int)}.
	 */
	@Test
	public void testMultisets() {
		fail("Not yet implemented");
	}

}
