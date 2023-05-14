package tuananh.dictionary.app.model;

import tuananh.dictionary.app.entities.Dictionary;
import tuananh.dictionary.app.entities.Word;
import tuananh.dictionary.config.Config;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Database {
    private final Config config;
    private final Dictionary dictionary;
    private final Scanner scanner;

    public Database() {
        config = new Config();
        dictionary = new Dictionary();
        scanner = new Scanner(System.in);
    }

    public void insertFromFile() {
        config.connect();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(config.fileReader);
            String line = bufferedReader.readLine();

            while (line != null) {
                for (int index = 1; index < line.length(); index++) {
                    if (line.charAt(index) == '\t') {
                        String wordTarget = line.substring(0, index);
                        String wordExplain = line.substring(index + 1);
                        dictionary.addWord(new Word(wordTarget, wordExplain));
                    }
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    public boolean addWord(Word newWord) {
        dictionary.addWord(newWord);
        return true;
    }

    public boolean removeWord(Word word) {
        dictionary.removeWord(word);
        return true;
    }

    public boolean editWord(String optional, Word word) {
        switch (optional) {
            case "1" -> {
                System.out.println("Enter the new target of this word:");
                String newTarget = scanner.nextLine();
                if (searchWordByWordTarget(newTarget).isPresent()) {
                    return false;
                } else {
                    word.setWordTarget(newTarget);
                }
            }
            case "2" -> {
                System.out.println("Enter the new explain of this word:");
                String newExplain = scanner.nextLine();

                System.out.println("Do you want to delete the old explain of this word?");
                if (scanner.nextLine().equals("Yes")) {
                    word.setWordExplain(newExplain);
                } else {
                    word.setWordExplain(word.getWordExplain() + "," + newExplain);
                }
            }
            default -> {
                System.out.println("Enter the new target of this word:");
                String newTarget = scanner.nextLine();
                if (searchWordByWordTarget(newTarget).isPresent()) {
                    return false;
                } else {
                    word.setWordTarget(newTarget);

                    System.out.println("Enter the new explain of this word:");
                    word.setWordExplain(scanner.nextLine());
                }
            }
        }
        return true;
    }

    public Optional<Word> searchWordByWordTarget(String wordTarget) {
        return dictionary.searchWordByWordTarget(wordTarget);
    }

    public List<Word> getAllWords() {
        return dictionary.getAllWords();
    }
}
