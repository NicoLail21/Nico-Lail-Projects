import java.util.Scanner;
public class SafeInputDriver {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testNum1 = 0;
        double testNum2 = 0;
        String stringAnswer;
        boolean boolAnswer;
/**
 * testing the getRangedInt
 */
        testNum1 = SafeInput.getRangedInt(sc, "Enter a number from 1 to 10", 1,
                10);
        System.out.println("Driver Program received " + testNum1 + "back from SafeInput class");
        System.out.println();
/**
 * testing the getRangedDouble
 */
        testNum2 = SafeInput.getRangedDouble(sc, "Enter a number from 1 to 10", 1,
                10);
        System.out.println("Driver Program received " + testNum2 + " back from SafeInput class");
        System.out.println();
/**
 * testing the getYNConfirm
 * this will ask for a y or n in the SafeInput and return
 * either a y or an n once the user enters one of them correctly
 * this will then print out the returned String (y or n) and whether *  you are playing again
 */
        System.out.println("Testing getYNConfirm");
        stringAnswer = SafeInput.getYNConfirm(sc, "Want to play again?");
        if (stringAnswer.equalsIgnoreCase("y"))
        {
            System.out.println(stringAnswer + " We are playing again");
        }
        else
        {
            System.out.println(stringAnswer + " We are not playing again");
        }
/**
 * testing the getYNBoolConfirm
 * this will ask for a y or n in the SafeInput and return
 * either a true or a false once the user enters a y or n correctly.
 * This will then print out the returned boolean value (true or false)
 * and whether you are playing again
 */
        System.out.println("Testing getYNBoolConfirm");
        boolAnswer = SafeInput.getYNBoolConfirm(sc, "Want to play again?");
        if (boolAnswer)
        {
            System.out.println(boolAnswer + " We are playing again");
        }
        else
        {
            System.out.println(boolAnswer +" We are not playing again");
        }
    }
}