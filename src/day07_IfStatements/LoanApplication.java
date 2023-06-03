package day07_IfStatements;

public class LoanApplication {

    public static void main(String[] args) {// salary at least 450000 and credit score 700 to be eligible

        int salary = 55000,
                creditScore= 730;

        String result="";  // temporary value will be replaced by one of the below results

        if (salary>=45000 && creditScore>=700){
            result = "You are eligible for the loan.";

        }else {
            result = "You are not eligible for the loan.";
        }
        System.out.println(result);
    }


    }