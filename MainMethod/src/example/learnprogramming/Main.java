package example.learnprogramming;

import java.util.Random; //Import random class
//import java.util.*; //Import all class in util package

//CTRL + ALT + L for improve coding structure
public class Main {
    //psvm then tab
    public static void main(String[] args) {
        //sout then tab
        System.out.println("args size = " + args.length); //Set argument in edit menu

        for(int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "] = " + args[i]);
        }

        Random random = new Random();
        System.out.println(random.nextInt(5));
    }

    /**
     * Summing two value
     * @param a number
     * @param b number
     * @return sum of a and b
     */
    public int sum(int a, int b) {
        return a + b;
    }

    //Avoid conflict import class
    java.util.Date date;
    java.sql.Date sqlDate;
}
