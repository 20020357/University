package tuananh.dictionary.app.controller.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dictionary {
    private final List<Word> words;

    public Dictionary() {
        words = new ArrayList<>();
    }

    public void addWord(Word word) {
        words.add(word);
    }

    public void removeWord(Word word) {
        words.remove(word);
    }

    public Optional<Word> searchWord(String word_target) {
        return  words.stream()
                .filter(word -> word.getWord_target().equals(word_target))
                .findFirst();
    }

    public List<Word> getAllWords() {
        return words;
    }
}
