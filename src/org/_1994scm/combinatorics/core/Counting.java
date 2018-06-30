/**
 * 
 */
package org._1994scm.combinatorics.core;

/**
 * @author Sean
 *
 */
public class Counting {
	
	/**
	 * Calculate n factorial.
	 * @param n
	 * @return n!
	 * @throws CombinatorialException 
	 */
	public static int factorial(int n) throws CombinatorialException{
		if(n < 0)
			CombinatorialException.CombEFactory(CombEnumList.NEGATIVE_VAL);
		int factN = 1;
		for(int i = 2; i <=n; i++){
			factN *= i;
		}
		return factN;
	}
	
	/**
	 * Calculate n choose k.
	 * @param n
	 * @param k
	 * @return n choose k
	 * @throws CombinatorialException 
	 */
	public static int binomial(int n, int k) throws CombinatorialException{
		return (factorial(n)/(factorial(k)*factorial(n-k)));
	}
	
	/**
	 * Calculate multinomial of n choose a1, a2, ..., ak.
	 * @param n
	 * @param typeArray Array of k integers summing to n
	 * @return
	 * @throws CombinatorialException 
	 */
	public static int multinomial(int n, int[] typeArray) throws CombinatorialException{
		int checkSum = 0;
		
		for(int x : typeArray){
			checkSum += x;
		}
		
		if(checkSum != n)
			CombinatorialException.CombEFactory(CombEnumList.INVALID_SUM);
		
		int denominator = 1;
		for(int x : typeArray){
			denominator *= factorial(x);
		}
		
		return (factorial(n)/denominator);
	}
	
	/**
	 * Calculate the number of permutations of Zn
	 * @param n
	 * @return Number of permutations of Zn
	 * @throws CombinatorialException 
	 */
	public static int permutations(int n) throws CombinatorialException{
		return factorial(n);
	}
	
	/**
	 * Calculate the number of permutations of the multiset corresponding to typeArray
	 * @param n
	 * @param typeArray array specifying number of each distinct type of object
	 * @return Number of permutations of multiset
	 * @throws CombinatorialException 
	 */
	public static int permutations(int n, int[] typeArray) throws CombinatorialException{
		return multinomial(n, typeArray);
	}
	
	/**
	 * Calculates the number of lists possible. If letters is true the number of lists length
	 * k made from n letters is given. Otherwise the number of lists of length k made from
	 * n distinct objects.
	 * @param n
	 * @param k
	 * @param letters
	 * @return If letters is true the number of lists length
	 * k made from n letters is given. Otherwise the number of lists of length k made from
	 * n distinct objects.
	 * @throws CombinatorialException 
	 */
	public static int lists(int n, int k, boolean letters) throws CombinatorialException{
		if(letters){
			return (int) Math.pow(n, k);
		} else {
			return (factorial(n)/(factorial(n-k)));
		}
	}
	
	/**
	 * The number of subsets of order k from Zn.
	 * @param n
	 * @param k
	 * @return
	 * @throws CombinatorialException 
	 */
	public static int subsets(int n, int k) throws CombinatorialException{
		return binomial(n, k);
	}
	
	/**
	 * Number of multisets of size k made from Zn.
	 * @param n
	 * @param k
	 * @return
	 * @throws CombinatorialException 
	 */
	public static int multisets(int n, int k) throws CombinatorialException{
		return binomial(n + k - 1, k);
	}
	
	
}
