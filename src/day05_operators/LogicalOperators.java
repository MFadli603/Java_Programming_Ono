package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {


        double salary = 90000;
        int creditScore = 700;
        int age=18;
        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age>=18;

        System.out.println(eligibleForLoan);

        System.out.println("_____________________________");

        age =18;
        String country ="USA";

        boolean eligibleToVote = age >= 18 && country == "USA";
        System.out.println(eligibleToVote);

        System.out.println("________________________");

        String answer="yes";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);
        System.out.println("_______________________________");
        char grade = 'B';

        boolean passedTheExam = grade =='A' || grade=='B' || grade == 'C' || grade=='D';

        System.out.println(passedTheExam);

        System.out.println("____________________________________");

        System.out.println( !true);

        String a ="yes";

        boolean yes = a== "yes";// true
        boolean no=!yes;
        System.out.println("yes ="+ yes);
        System.out.println("no="+ no);

        System.out.println("___________________________________");

        int score = 65;

        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = "+ passed);
        System.out.println("falied = "+ failed);


        System.out.println("____________________");

        System.out.println( true==!false && false ==!true && true !=!true);
        //                   true        && true           && true

    }
}
