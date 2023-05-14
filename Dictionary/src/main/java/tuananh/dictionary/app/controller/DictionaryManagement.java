package tuananh.dictionary.app.controller.utilities;

import tuananh.dictionary.app.controller.entities.Dictionary;
import tuananh.dictionary.app.controller.entities.Word;

import java.util.Scanner;

public class DictionaryManagement {
    public final Dictionary dictionary;

    private static Scanner scanner = new Scanner(System.in);

    public DictionaryManagement() {
        dictionary = new Dictionary();
    }

    public void insertFromCommandLine() {
        System.out.println("Enter the number of words which you want to add: ");
        int numberOfWords = scanner.nextInt();
        scanner.nextLine();

        for (int index = 0; index < numberOfWords; index++) {
            System.out.println("Entering word " +  (index + 1));

            System.out.println("Entering the new word: ");
            String word_target = scanner.nextLine();

            System.out.println("Entering the explaining of word: ");
            String word_explain = scanner.nextLine();

            dictionary.addWord(new Word(word_target, word_explain));
        }
    }
}
