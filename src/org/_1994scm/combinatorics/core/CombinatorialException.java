/**
 * 
 */
package org._1994scm.combinatorics.core;

/**
 * @author Sean
 *
 */
public class CombinatorialException extends Exception {
	public CombinatorialException(String message){
		super(message);
	}
	
	public static void CombEFactory(CombEnumList reason) throws CombinatorialException{
		switch(reason){
		case INVALID_SUM:
			throw new CombinatorialException("Sum Provided is Invalid.");
		case NEGATIVE_VAL:
			throw new CombinatorialException("Negative Value Not Allowed.");
		default:
			throw new CombinatorialException("Unidentified Problem.");
				
		}
	}
}

enum CombEnumList {
	INVALID_SUM, NEGATIVE_VAL
}
