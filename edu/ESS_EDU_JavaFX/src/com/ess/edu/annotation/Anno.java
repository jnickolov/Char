package com.ess.edu.annotation;

@MyCustomAnnotation(
	    studentName="Chaitanya",
	    stuAddress="Agra, India"
	)
	public class Anno {
		String getnae() {
			return this.studentName;
		}
	}