package com.kodewala.pratice;

public class Professor extends Teacher {
	@Override
	void showRole() {
		System.out.println("Role:Professar");
	}
	@Override 
	void teach() {
		System.out.println("Professor teaches Java");
	}
  public static void main(String[] args) {
	Professor professor = new Professor();
	
	professor.showRole();
	professor.teach();
}
}
