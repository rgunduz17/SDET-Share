package com.company;



public class StringClass {
    public static void main(String[] args) {


        //create an object
        String s1 = "cat";
        System.out.println("String s1 "+s1);

     // Second way with new keyword;
        String s2 = new String("dog");
        System.out.println("String s2 "+s2);


        System.out.println("*****************************************");

        //String Methods;

        // 1.  charAt(index):


        String str = "Cybertek";
        int n=3;
        System.out.println("#"+n+ " char for "+ str + " is: "+str.charAt(n));


        System.out.println("*****************************************");

        // 2. length();

        String name = "Donald J Trump";
        System.out.println("There are "+name.length() + " chars at String: " + name);


        System.out.println("*****************************************");

        // 3. concat(str);

        String a1= "Cybertek";

        System.out.println(a1.concat(" Okul"));

        a1= a1.concat(" School");  // assign a variable first
        System.out.println("Concat of " + a1  );



        System.out.println("*****************************************");


        // 4. toUpperCase()

        String a2= "cybertek";
        System.out.println(a2+ " toUpperCase(): " + a2.toUpperCase());

        // 5. toLowerCase()

        String a3 = "CYBERTEK";
        System.out.println(a3+ " toLowerCase(): " +a3.toLowerCase());

        String a4= "RIDVAN";

        a4= a4.toLowerCase();
        System.out.println("toLowerCase(): "+a4);

        System.out.println("*****************************************");



    }
}
