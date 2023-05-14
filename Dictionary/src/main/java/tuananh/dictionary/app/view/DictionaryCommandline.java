package tuananh.dictionary.app.view;

import tuananh.dictionary.app.entities.Word;
import tuananh.dictionary.app.controller.DictionaryManagement;

import java.util.Scanner;

public class DictionaryCommandline {
    private final DictionaryManagement dictionaryManagement;
    private final Scanner scanner;

    public DictionaryCommandline() {
        dictionaryManagement = new DictionaryManagement();
        scanner = new Scanner(System.in);
    }

    private void showAllWords() {
        System.out.println("No | English | Vietnamese");

        int index = 1;
        for (Word word: dictionaryManagement.getAllWords()) {
            System.out.printf("%d | %s | %s%n", index++, word.getWordTarget(), word.getWordExplain());
        }

        System.out.println();
    }

    private void showWord(String wordTarget, String wordExplain) {
        System.out.println("English | Vietnamese");
        System.out.printf("%s | %s%n", wordTarget, wordExplain);
        System.out.println();
    }

    private void dictionaryLookup() {
        System.out.println("Enter the word need to find:");
        String wordTarget = scanner.nextLine();

        Word checkWord = dictionaryManagement.searchWordByWordTarget(wordTarget);
        if (checkWord != null) {
            showWord(wordTarget, checkWord.getWordExplain());
        } else {
            System.out.println("This word is not exist in dictionary. Sorry for the inconvenience, you can add it soon." + "\n");
        }
    }

    private void insertWord() {
        System.out.println("Enter the new word:");
        String wordTarget = scanner.nextLine();
        System.out.println("Enter the explain of word:");
        String wordExplain = scanner.nextLine();

        Word checkWord = dictionaryManagement.searchWordByWordTarget(wordTarget);
        if (checkWord != null) {
            System.out.println("This word existed in the dictionary, so you didn't need to add it to the dictionary." + "\n");
        } else {
            Word newWord = new Word(wordTarget, wordExplain);
            dictionaryManagement.addWord(newWord);
            System.out.println("The word added." + "\n");
        }
    }

    private void deleteWordByWordTarget() {
        System.out.println("Enter the word need to delete:");
        String wordTarget = scanner.nextLine();

        Word wordMaybe = dictionaryManagement.searchWordByWordTarget(wordTarget);

        if (wordMaybe == null) {
            System.out.println("This word is not exist in dictionary, so you can't delete it." + "\n");
        } else {
            dictionaryManagement.removeWord(wordMaybe);
            System.out.println("This word deleted." + "\n");
        }
    }

    private boolean updateWordByWordTarget() {
        System.out.println("""
            Enter the optional which you choice:
            1. Editing word target.
            2. Editing word explain.
            Default: Editing both word target and word explain.""");
        String optional = scanner.nextLine();

        System.out.println("Enter the word target:");
        String wordTarget = scanner.nextLine();

        Word checkWord = dictionaryManagement.searchWordByWordTarget(wordTarget);
        if (checkWord == null) {
            System.out.println("This word is not exist in dictionary, so you can't update it." + "\n");
        } else {
            boolean success = dictionaryManagement.editWord(optional, checkWord);
            if (success) {
                System.out.println("The word updated." + "\n");
                showWord(checkWord.getWordTarget(), checkWord.getWordExplain());
            } else {
                boolean loop = true;
                while (loop) {
                    System.out.println("""
                         The word target you just entered is the same as another word in the dictionary, so you can't update it.
                         Do you want to update this word again?
                         (Yes/No ???)
                         Default: exit!!!""");
                    String answer = scanner.nextLine();
                    System.out.println("");
                    if (answer.equals("Yes")) {
                        System.out.println("Note: PLEASE TO ENTER WITH THE OTHER WORD TARGET!!!");
                        loop = updateWordByWordTarget();
                    } else {
                        loop = false;
                    }
                }
            }
        }
        return false;
    }

    public void dictionaryBasic() {
        dictionaryManagement.insertFromCommandLine();

        showAllWords();
    }

    public void dictionaryAdvance() {
        dictionaryManagement.insertFromFile();

        boolean exit = false;
        while (!exit) {
            System.out.println("""
            What function do you want to use?
                1. Search word.
                2. Insert word.
                3. Delete word by word target.
                4. Update word.
                5. Show all word in dictionary
                default: Exit!!!""");

            String function = scanner.nextLine();
            switch (function) {
                case "1" -> {
                    dictionaryLookup();
                }
                case "2" -> {
                    insertWord();
                }
                case "3" -> {
                    deleteWordByWordTarget();
                }
                case "4" -> {
                    updateWordByWordTarget();
                }
                case "5" -> {
                    showAllWords();
                }
                default -> {
                    exit = true;
                }
            }
        }
    }
}
