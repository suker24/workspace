package com.suker24.idea.test;

/**
 *
 */
public class TT {
	private static final String CONSTANT = "String";   
	private Object o;

	public TT() {
	}

	/**


	 * Creates a new demo.    
	 * @param o The object to demonstrate.   
	 */ 
	public TT(Object o) {
		this.o = o;    
		String s = CONSTANT + "Other"; 
		int i = 123;   
	}   
	public static void main(String[] args) {
		TT demo = new TT();
	}
}
