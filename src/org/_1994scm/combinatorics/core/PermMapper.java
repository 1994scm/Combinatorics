/**
 * 
 */
package org._1994scm.combinatorics.core;

/**
 * @author Sean
 *
 */
public class PermMapper<T> {
	private int baseSize;
	private int size;
	
	public PermMapper(T[] input) throws CombinatorialException{
		this.baseSize = input.length;
		this.size = Counting.factorial(baseSize);
	}
	
	public void map(T[] input, T[][] dest) throws CombinatorialException{
		Permutation p = new Permutation(input.length);
		int[][] wrapper = p.getWrapper();
		for(int i = 0; i<wrapper.length; i++){
			for(int j = 0; j < input.length; j++){
				dest[i][j] = input[wrapper[i][j] - 1];
			}
		}
	}
	
	public int getBaseSize(){
		return baseSize;
	}
	
	public int getSize(){
		return size;
	}
}
