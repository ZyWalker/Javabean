 import java.util.Scanner;
public class Gradebook {
    public static void main(String[] args){
    System.out.println("\n*******Step 1: Square Root*******\n");
     for(int i = 10; i > 0; i--) {
        double sqrtInt = Math.sqrt(i);
        System.out.println(sqrtInt);
     } 
     System.out.println("\n*******Step 2: Grading for Multiple Students*******\n");
     Scanner studentName = new Scanner(System.in);
     Scanner courseName = new Scanner(System.in);
     Scanner grades = new Scanner(System.in);
     System.out.println("Student Name:");
     String studentString = studentName.nextLine();
     System.out.println("Course Name:");
     String courseString = courseName.nextLine();
     double midGrade;
     double midFinal;
     double midProject;
     do{
     System.out.println("Midterm Grade (between 0-100):");
    midGrade = grades.nextDouble();}
     while(0>midGrade || midGrade >100);
      
     do{
     System.out.println("Final Grade (between 0-100):");
    midFinal = grades.nextDouble(); }
     while(0>midFinal || midFinal >100);
       
     do{
     System.out.println("Project Grade (between 0-100):");
    midProject = grades.nextDouble(); }
     while(0>midProject || midProject >100);

     double avgGrade = ((midFinal + midGrade + midProject)/3);
      System.out.println("\n*************Grade Results*************");
      System.out.println("\n\nStudent Name :" + studentString);
      System.out.println("\n\nCourse Name :" + courseString);
      System.out.println("Midterm Grade: " + midGrade );
      System.out.println("Final Grade: " + midFinal);
      System.out.println("Project Grade: " + midProject);
      System.out.println("Average Grade: " +  avgGrade);
      if (0.0 <=avgGrade &&avgGrade <= 59.9){
        System.out.println(avgGrade + " equates to an F :( do better");}
    else if (60.0 <=avgGrade &&avgGrade <= 69.9){
        System.out.println(avgGrade + " equates to a D");}
    else if (70.0 <=avgGrade &&avgGrade <= 79.9){
        System.out.println(avgGrade + " equates to a C");}
    else if (80.0 <=avgGrade &&avgGrade <= 89.9){
        System.out.println(avgGrade + " equates to a B");}
    else if (90.0 <=avgGrade &&avgGrade <= 100.0){
        System.out.println(avgGrade + " equates to a A!!!");}

    } 

   

}
