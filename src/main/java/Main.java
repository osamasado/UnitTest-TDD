public class Main {
    static void main() {
        isPalindrome("Otto");
    }

    public static String fizzBuzz(int number) {

        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        else if(number % 3 == 0) {
            return "Fizz";
        }
        else if(number % 5 == 0) {
            return "Buzz";
        }
        return "" + number;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static Character getFirstCharacter(String text) {
        if(text.isEmpty()) {
            return null;
        }

        return text.charAt(0);
    }

    public static String reverseString(String input){
        if (input == null || input.isEmpty()) {
            return input;
        }
        String tempStr = "";
        for(int i = input.length() -1 ; i >= 0; i--) {
            tempStr += input.charAt(i);
        }
        return tempStr;
    }

//    public static String reverseString(String input) {
//        if (input == null || input.isEmpty()) {
//            return input;
//        }
//
//        return new StringBuilder(input).reverse().toString();
//    }

    public static boolean isPalindrome(String text){
        if(text == null || text.isEmpty()) {
            return true;
        }
        int length = text.length();
        int mid = length / 2 ;
        int part2Start = isEven(length) ? mid : mid + 1;
        String part1 = text.substring(0, mid).toLowerCase();
        String part2 = text.substring(part2Start, length);
        String reversedPart2 = reverseString(part2).toLowerCase();
        return part1.compareTo(reversedPart2) == 0;
    }

    public static int countVowels(String text){
        if(text == null || text.isEmpty()) {
            return 0;
        }

        text = text.toLowerCase();

        int counter = 0;
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                counter++;
            }
        }
        return counter;
    }

    public static int factorial(int n) {
        int factorial = 1;

        if (n <= 1) {
            return factorial;
        }

        int index = 2;

        while (index <= n) {
            factorial *= index;
            index ++;
        }

        return factorial;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n -1) + fibonacci(n -2);
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }

}
