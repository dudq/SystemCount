import java.util.Scanner;

public class SystemCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();
        if (number >= 0 && number < 10) {
            String callOnes = callOnes(number, overTwenty(number));
            System.out.println(callOnes);
        } else if (number >= 10 && number < 20) {
            int ones = number -10;
            String callTens = callTens(ones,overTwenty(number));
            System.out.println(callTens);
        } else if (number >= 20 && number < 100) {
            int tens = Math.round(number / 10);
            String callTens = callTens(tens,overTwenty(number));
            int ones = number - tens * 10;
            String callOnes = callOnes(ones, overTwenty(number));
            System.out.println(callTens + " " + callOnes);
        } else if (number >= 100 && number < 1000) {
            int hundreds = Math.round(number / 100);
            int tens = Math.round((number - hundreds * 100) / 10);
            int ones = number - hundreds * 100 - tens * 10;
            String callHundreds = callHundreds(hundreds, overTwenty(number));
            String callTens = callTens(tens,overTwenty(number));
            String callOnes = callOnes(ones, overTwenty(number));
            System.out.println(callHundreds + " " + callTens + " " + callOnes);
        } else {
            System.out.println("Out of ability");
        }
    }

    public static boolean overTwenty(int number) {
        if (number >= 20) {
            return true;
        } else return false;
    }

    public static String callOnes(int number, boolean overTwenty) {
        String ones = "";
        switch (number) {
            case 0:
                if (!overTwenty) {
                    ones = "zero";
                }
                break;
            case 1:
                ones = "one";
                break;
            case 2:
                ones = "two";
                break;
            case 3:
                ones = "three";
                break;
            case 4:
                ones = "four";
                break;
            case 5:
                ones = "five";
                break;
            case 6:
                ones = "six";
                break;
            case 7:
                ones = "seven";
                break;
            case 8:
                ones = "eight";
                break;
            case 9:
                ones = "nine";
                break;
            default:
                break;
        }
        return ones;
    }

    public static String callTens(int number,boolean overTwenty) {
        String tens = "";
        switch (number) {
            case 0:
                if (!overTwenty) tens = "ten";
                break;
            case 1:
                if (!overTwenty) tens = "eleven";
                break;
            case 2:
                if (!overTwenty) tens = "twelve";
                else tens = "twenty";
                break;
            case 3:
                if (!overTwenty) tens = "thirteen";
                else tens = "thirty";
                break;
            case 4:
                if (!overTwenty) tens = "fourteen";
                else tens = "forty";
                break;
            case 5:
                if (!overTwenty) tens = "fifteen";
                else tens = "fifty";
                break;
            case 6:
                if (!overTwenty) tens = "sixteen";
                else tens = "sixty";
                break;
            case 7:
                if (!overTwenty) tens = "seventeen";
                else tens = "seventy";
                break;
            case 8:
                if (!overTwenty) tens = "eighteen";
                else tens = "eighty";
                break;
            case 9:
                if (!overTwenty) tens = "nineteen";
                else tens = "ninety";
                break;
            default:
                break;
        }
        return tens;
    }

    public static String callHundreds(int number, boolean overTwenty) {
        String callHundreds = callOnes(number, overTwenty) + " hundred";
        return callHundreds;
    }
}
