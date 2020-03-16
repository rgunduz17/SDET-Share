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

        // 6. trim()
        // remove unused spaces

            String a5= "       Hello";
            a5 = a5.trim();

        System.out.println("Spaces are trimmed "+a5);


        System.out.println("*****************************************");

        // 7. substring(beginning index)

        String a6= "CyberTek School";

        String a7= a6.substring(9);
        System.out.println("Substring of "+ a6+ " is :  "+a7);

//          substring (beginning index, last index)

        String a8 = "Hello Cybertek School";
        a8 = a8.substring(6,14);
        System.out.println(a8);

        System.out.println("*****************************************");

        // 8. replace(old char, new char)



        String a9 = "Java is Fun Programming Language";
        // a9. replace('a', 'e');

        a9= a9. replace('a', 'e');

        System.out.println("Replaced all \"A\"s with \"E\"s : "  + a9);



        //  replace (old str, new str)

        String str3 = "Today is gonna be great day to learn JAVA";
       str3 = str3.replace("Today", "Tomorrow");
        System.out.println("Replaced \"Today\" with \"Tomorrow\": " + str3);

        //  replaceFirst(old str, new str)

        String str4 = "Java is fun, Java is good.";

        str4 = str4.replaceFirst("Java", "Phyton");
        System.out.println("Replaced first \"Java\" word with \"Phyton\" : "+str4);

        //  replaceAll(old str, new str)


        String str5 = "how to do in java provides java tutorials";

          String newStr = str5.replaceAll("java", "Pyhton");

          System.out.println("Replaced All \"java\" words with \"Phyton\": " + newStr);

         System.out.println("*****************************************");





    }
}
