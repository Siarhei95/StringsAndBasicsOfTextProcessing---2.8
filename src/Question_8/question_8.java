package Question_8; //Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
import java.util.*;

public class question_8 {

    public static void main(String[] args) {
        question_8 count = new question_8();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter words with a space: "); // ввести слова через пробел
        String str = scanner.nextLine();
        int max = 0;
        String word = null;
        count.findLongWord(str, max, word);
    }

    private void findLongWord(String str, int max, String word){

        for (String retval : str.split(" ")) { //разделим все слова

            if(retval.length()> max) { //найдем максимальную длину слова
                max = retval.length();
                word = retval;
            }
        }
        System.out.println("Longest word: " + word);
        System.out.println("Word length: " + max);
    }
}