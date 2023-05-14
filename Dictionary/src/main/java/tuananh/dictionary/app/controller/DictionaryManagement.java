package tuananh.dictionary.app.controller;

import tuananh.dictionary.app.entities.Word;
import tuananh.dictionary.app.model.Database;

import java.util.List;
import java.util.Scanner;

public class DictionaryManagement {
    private final Database DB;

    private final Scanner scanner = new Scanner(System.in);

    public DictionaryManagement() {
        DB = new Database();
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

            DB.addWord(new Word(word_target, word_explain));
        }
    }

    public void insertFromFile() {
        DB.insertFromFile();
    }

    public Word searchWordByWordTarget(String wordTarget) {
        return DB.searchWordByWordTarget(wordTarget)
                .orElse(null);
    }

    public List<Word> getAllWords() {
        return DB.getAllWords();
    }

    public boolean addWord(Word newWord) {
        return DB.addWord(newWord);
    }

    public boolean removeWord(Word word) {
        return DB.removeWord(word);
    }

    public boolean editWord(String optional, Word word) {
        return DB.editWord(optional, word);
    }
}
