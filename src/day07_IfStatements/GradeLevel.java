package day07_IfStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel= 6;

        String result = "";

        if(gradeLevel <= 5){
            result = "Elementary school";
        } else if (gradeLevel <=8) {
            result = "Middle school";
        } else if (gradeLevel <=12) {
            result = "High school";
        } else if (gradeLevel <= 16) {
            result = "College";
        } else {
            result = "Grad school";
        }
        System.out.println(result);
    }
}
/*
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Note: Assume that the given number is between 1 ~ 18
 */