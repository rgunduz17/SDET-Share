package com.company;

import java.util.Scanner;

public class TernaryClass {

    public static void main(String[] args) {

        // TERNARY CLASS (IF WITHOUT CURLY BRACES AND IF/ ELSE IF/ ELSE WORDS )

        //RULE;
        // 1. Define your variables;
        // 2. Start with variable name


//
//       RULE   variableName = (if) Boolean value ? return statement
//            : (else if) Boolean value ? return statement
//            : (else) return statement;
//


        char FinalGrade= 'A';
        String Grade= "";
        Grade = (FinalGrade == 'A') ? "Super"                   // grade i bos string yapip sonra if mis gibi esitle paranteze mantiksal sinama yaz ? return yerine geciyo. 
                :(FinalGrade == 'B') ? "Guzel"                  // : else if islevi goruyo ? yine return 
                :(FinalGrade == 'C') ? " Fena Degil"            //
                :(FinalGrade == 'D') ? " Idare Eder"
                : "Dersten kaldin";                             // buda else yerine geciyo
        
        if (a<2) return 5; else return 8:
        
        System.out.println(Grade);
        System.out.println("************************************************");


        // SCANNER CLASS

        //import java.util.Scanner; ==> between package and className
         Scanner variableName = new Scanner(System.in);  //==> In main method
        System.out.println("Enter a number: ");
        int num =  variableName.nextInt();

        System.out.println("Your number multiple by 5: " + num * 5);





    }
}
