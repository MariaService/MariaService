package com.sngular.devTraining2021.exercises;

class Atom {
	 Atom() {
		// TODO Auto-generated constructor stub

		System.out.println("atom");
	}
}

class Rock extends Atom {
	 Rock(String type) {
		// TODO Auto-generated constructor stub
		System.out.println(type);
	}
}

 public class Mountain extends Rock {
	Mountain(){
		super("granite");
		new Rock("granite");
	}
	public static void main(String[] args) {
		new Mountain();
	}
}
