package com.veer;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2=" + result);

        int previousresult = result;
        result = result-1 ;
        System.out.println(previousresult + "-1 =" + result);

        previousresult = result ;
        result = result *10;

        System.out.println(previousresult + "*10 =" +result );

        previousresult = result ;
        result = result/4;

        System.out.println(previousresult + "/4 =" +result );
        result++;
        System.out.println("new result ="  +result );
        --result ;
        System.out.println("new result ="  +result );

        result += 3;
        System.out.println("new result ="  +result );
        result -= 3;
        System.out.println("new result ="  +result );
        result *= 3;
        System.out.println("new result ="  +result );
        result /= 3;
        System.out.println("new result ="  +result );

        boolean isAlian  = false;

        if(isAlian != true)
            System.out.println("I am alian");

        int topscore = 77;
        if (topscore > 65 && topscore < 105)
            System.out.println("You are Pass");
       else
            System.out.println("fail" );


       if(topscore > 75 && topscore < 78)

           System.out.println("group vado aapda");


       double myFirst = 20d;
       double mySec = 80d;
       double total = 25 *(myFirst + mySec);

       double reminder = total % 40;
        System.out.println("reminder is =" + reminder);
        if(reminder <= 20)
            System.out.println("total number is over the limit");


    }
}
