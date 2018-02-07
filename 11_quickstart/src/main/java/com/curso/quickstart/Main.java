
package com.curso.quickstart;

import com.google.gson.Gson;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		
		Gson g= new Gson();
		System.out.println(g.toJson("Adios"));
	}

}
