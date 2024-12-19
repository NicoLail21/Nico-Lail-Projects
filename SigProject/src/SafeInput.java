import java.util.Scanner;

/**
 *
 * @author
 */
public class SafeInput {

    /**
     * public static int getRangedInt(Scanner sc, String prompt, int low, int high)
     * -sc is a Scanner object that you created in main in the usual way i.e.in
     * -Prompt is the message to display to the user as the prompt for the input
     * Note that the prompt should include the low and high range [low – high]
     * -Low is the low value for the input range
     * -High is the high value for the input range
     */
    public static int getRangedInt(Scanner sc, String prompt, int low, int high) {
        int num = 0;
        boolean done = false;
        String trash = "";
        while (!done)  // wrong answer entered
        {
            System.out.println(prompt);

            if (sc.hasNextInt()) {

                num = sc.nextInt();

                if (num < low || num > high) {
                    System.out.println("Your number is not between " + low + " and " + high);
                    done = false;
                } else {
                    done = true;
                }
            }// end of if checking for it
            else {
                trash = sc.next();
                System.out.println("you entered incorrect data.");
                done = false;
            }
        } // end of my while loop

        return num;
    }


    /**
     * public static double getRangedDouble(Scanner sc, String prompt, double low, double high)
     * -sc is a Scanner object that you created in main i.e. in
     * -Prompt is the message to display as the prompt for the input
     * -Low is the low value for the input range
     * -High is the high value for the input range
     */
    public static double getRangedDouble(Scanner sc, String prompt, double low, double high) {
        boolean done = false;
        double num = 0;
        String trash = "";

        while (!done) //while wrong answer is entered
        {
            System.out.println(prompt);

            if (sc.hasNextDouble()) {
                num = sc.nextDouble();

                if (num < low || num > high) {
                    System.out.println("number is not between " + low + " and " + high);
                    done = false;
                } else {
                    done = true;
                }
            }// end of if checking for it
            else {
                trash = sc.next();
                System.out.println("you entered incorrect data.");
                done = false;
            }
        } // end of my while loop

        return num; }




        /**
         * public static String getYNConfirm(Scanner sc, String prompt)
         -sc is a Scanner object that you created in main i.e. in
         -Prompt is the message to display as the prompt for the input
         returns String
         */
        public static String getYNConfirm (Scanner sc, String prompt)
        {
            boolean done = false;
            String ans = "";

            while (!done) {
                System.out.println(prompt);
                ans = sc.next();
                if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("n")) {
                    done = true;
                } else {
                    done = false;
                    System.out.println("you did not enter a Y or a N");
                }
            }// end of while loop
            return ans;
        }// end of method

        /**
         * public static boolean getYNConfirm(Scanner sc, String prompt)
         -sc is a Scanner object that you created in main i.e. in
         -Prompt is the message to display as the prompt for the input
         returns String
         */
        public static boolean getYNBoolConfirm (Scanner sc, String prompt)
        {
            {
                boolean done = false;
                String ans = "";

                while (!done) {
                    System.out.println(prompt);
                    ans = sc.next();
                    if (ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N")) {
                        done = true;
                    } else {
                        done = false;
                        System.out.println("you did not enter a Y or a N");
                    }
                }// end of while loop

                if (ans.equalsIgnoreCase("y")) {
                    return true;
                } else {
                    return false;
                }

            }// end of method
        }
    } //end of program




