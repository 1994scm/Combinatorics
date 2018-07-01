package org._1994scm.combinatorics.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Permutation {
	private final int[][] wrapper;
	private final int baseSize;
	private final int size;
	
	/**public Permutation(){
		this.wrapper = new int[1][1];
		this.baseSize = 0;
		this.size = 0;
	}**/
	
	public Permutation(int n) throws CombinatorialException{
		int[] input = expand(n);
		this.wrapper = permute(input);
		this.baseSize = input.length;
		this.size = Counting.permutations(baseSize);
	}

	public int[][] getWrapper(){
		return wrapper;
	}
	
	public int getBaseSize(){
		return baseSize;
	}
	
	public int getSize(){
		return size;
	}
	
	private int[][] permute(int[] input) throws CombinatorialException {
		int pos = 0;
		int[][] table = new int[Counting.factorial(input.length)][input.length];
		if(input.length == 1){
			table = new int[1][1];
			table[0][0] = input[0];
			return table;
		}
		
		for(int i = 0; i < input.length; i++){
			
			int[] reduced = new int[input.length-1];
			
			for(int j = 0; j < input.length - 1; j++){
				if(j >= i){
					reduced[j] = input[j+1];
				} else {
					reduced[j] = input[j]; 
				}
			}
			
			int[][] temp = permute(reduced);
			for(int j = 0; j < temp.length; j++){
				table[pos][0] = input[i];
				for(int k = 0; k < reduced.length; k++){
					table[pos][k+1] = temp[j][k];
				}
				pos++;
			}
			
		}
		
		return table;
		
	}
	
	private int[] expand(int n){
		int[] out = new int[n];
		for(int i = 0; i < n; i++){
			out[i] = i+1;
		}
		return out;
	}
	
	public void print(){
		System.out.println("Base Size: " + this.baseSize);
		System.out.println("Permutation Size: " + this.size);
		for(int i = 0; i < this.wrapper.length; i++){
			for(int j = 0; j < this.baseSize; j++){
				System.out.print(wrapper[i][j]);
			}
			System.out.print(" ");
			if(i%this.baseSize == baseSize-1){
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) throws CombinatorialException{
		int[] temp = {1,2,3,4, 5};
		Permutation p = new Permutation(5);
		p.print();
		String[] s = {"S", "e", "a", "n"};

		PermMapper<String> sm = new PermMapper<String>(s);
		String[][] out = new String[sm.getSize()][sm.getBaseSize()];
		sm.map(s, out);
	}
	
}
