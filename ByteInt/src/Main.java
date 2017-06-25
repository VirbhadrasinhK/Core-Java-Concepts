/**
 * Created by I  N T E L on 02-Feb-17.
 */
public class Main {
    public static void main(String[] args) {
         byte myValue = 10;

         short myShort = 30;

         int myInt = 25;

         long myLong = 50000 + 10*(myValue + myShort + myInt);

         short shortTotal = (short)(100 + 10*(myValue + myShort + myInt));

        System.out.println("Total ="+ shortTotal);



    }
}
