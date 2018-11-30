package org.test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FinalGradeCaluculator {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("C:/Trainings/Bootcamp/WorkSpace/StudentGradeCalculatorProject/src/org/test/student_grades_input.txt"));
		FinalGradeCaluculator calculation = new FinalGradeCaluculator();
		int gradeACount = 0 , gradeBCount = 0, gradeCCount = 0, gradeDCount = 0, gradeFCount = 0;
		scanner.nextLine();
		while (scanner.hasNextLine()) {
			String studentData = scanner.nextLine();
			String[] studentDataArray = studentData.split(",");
			if(studentDataArray.length == 7){
				String name= studentDataArray[0];
				double final_numerical_grade = calculation.finalNumericalGradeCalculator(studentDataArray);
				char finalLettergrade = calculation.finalLetterGradeCalculator(final_numerical_grade); 
				System.out.println(name+','+final_numerical_grade+','+finalLettergrade);
				switch(finalLettergrade){
				case 'A' :
					gradeACount++;
					break;
				case 'B' :
					gradeBCount++;
					break;
				case 'C' :
					gradeCCount++;
					break;
				case 'D' :
					gradeDCount++;
					break;
				default :
					gradeFCount++;
					break;
				}
			}else{
				System.out.println("invalid data");
			}
		}	
		scanner.close();
		System.out.println("Total number of Students grade wise: ");
		System.out.println("A-Grade: "+gradeACount);
		System.out.println("B-Grade: "+gradeBCount);
		System.out.println("C-Grade: "+gradeCCount);
		System.out.println("D-Grade: "+gradeDCount);
		System.out.println("F-Grade: "+gradeFCount);
	}	
	
	public double finalNumericalGradeCalculator(String[] studentDataArray){
		int hw1Marks = Integer.parseInt(studentDataArray[1]);
		int hw2Marks = Integer.parseInt(studentDataArray[2]);
		int hw3Marks = Integer.parseInt(studentDataArray[3]);
		int midTermMarks = Integer.parseInt(studentDataArray[4]);
		int projectMarks = Integer.parseInt(studentDataArray[5]);
		int finalMarks = Integer.parseInt(studentDataArray[6]);
		int hwAvg = (hw1Marks+hw2Marks+hw3Marks)/3;
		double final_numerical_grade = 0.45*hwAvg + 0.25*projectMarks + 0.30*((midTermMarks+finalMarks)/2);
		return final_numerical_grade;
	}
	
	public char finalLetterGradeCalculator(double finalNumericalGradeTest){
		char finalLetterGrade;
		int finalNumericalGrade = (int) finalNumericalGradeTest;
			if (finalNumericalGrade >= 90 && finalNumericalGrade <= 100)
				finalLetterGrade = 'A';
			else if (finalNumericalGrade >= 80 && finalNumericalGrade < 90)
				finalLetterGrade = 'B';
			else if (finalNumericalGrade >= 70 && finalNumericalGrade < 80)
				finalLetterGrade = 'C';
			else if (finalNumericalGrade >= 60 && finalNumericalGrade < 70)
				finalLetterGrade = 'D';
			else
				finalLetterGrade = 'F';
			
		return finalLetterGrade;
	}
	
}
