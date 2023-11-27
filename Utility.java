import java.util.List;

/**
 * A Class for JUnit5 Exercise (CSE2024 SW Development Practices)
 *
 * @author juhansae
 * @version 2022.2
 * @// Create a JUnit test class with some test methods
 * @// Then, refactor it to pass all the tests !
 */
public class Utility {
    public static void main(String[] args) {
        System.out.println("This will be printed");
    }

    public static int dayOfYear(int month, int dayOfMonth, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (leap(year)) {
            daysInMonth[2] = 29; // February has 29 days in a leap year
        }

        for (int i = 1; i < month; i++) {
            dayOfMonth += daysInMonth[i];
        }

        return dayOfMonth;
    }

    public static boolean leap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int LONG_WORD_LENGTH = 5;
    public static String longestWord;

    public static void countLongWords(List<String> words) {
        int n = 0;
        longestWord = "";
        for (String word: words) {
            if (word.length() > LONG_WORD_LENGTH) {
                ++n;
                LONG_WORD_LENGTH = word.length();
            }
            if (word.length() > longestWord.length()) longestWord = word;
        }
        System.out.println(n);
    }
}