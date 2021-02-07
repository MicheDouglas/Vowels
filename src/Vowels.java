import java.util.Scanner;

//Program that returns the number of vowels in a string
public class Vowels {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence.... ");
        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase();
        System.out.println("Number of vowels in this sentence are.. "+vowelCount(sentence, sentence.length()));
    }


    static int vowelSearch(char v) {
        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
            return 1;
        } else return 0;
    }
    static int vowelCount(String sentence, int count){
        if (count == 1) {
            return vowelSearch(sentence.charAt(count-1));
        }
        return vowelCount(sentence, count-1) + vowelSearch(sentence.charAt(count-1));
    }
}