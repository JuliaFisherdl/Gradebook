package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   /*
   Grading Book
Write a program that evaluates a student's numeric grade (0-100) to determine the student's letter grade (A, B, C, D, or F)
If the student's grade is less than 60, the program should not evaluate the grade and should print, "You failed."
If the student's grade is greater than 60, the program should evaluate on the following scale and print, "You got a(n) [letter grade]!"
A: 90-100, B: 80-89, C: 70-79, D: 60-69
    */

        Scanner scan = new Scanner(System.in);
        int grade;
        int gradeNote;
        String letterGrade;

        System.out.println("What numerical grade did you receive?");
        grade = scan.nextInt();
        gradeNote = grade - ((grade / 10)*10);

        if (grade < 60)
            letterGrade = "You failed";
        else if (grade < 69)
            letterGrade = "D";
        else if (grade < 79)
            letterGrade = "C";
        else if (grade < 89)
            letterGrade = "B";
        else
            letterGrade = "A";


        if(letterGrade != "You failed") {
            if(gradeNote>=7)
                letterGrade = letterGrade+"+";
            else if(gradeNote<=3)
                letterGrade = letterGrade+"-";
            else
                letterGrade = letterGrade+"";

            if(grade>90)
                System.out.println("You got an "+letterGrade+"!");
            else
                System.out.println("You got a "+letterGrade+"!");
        } else
            System.out.println(letterGrade);


    }
}
