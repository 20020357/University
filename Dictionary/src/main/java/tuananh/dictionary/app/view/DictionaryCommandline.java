package tuananh.dictionary.backend;

import tuananh.dictionary.backend.entities.Word;
import tuananh.dictionary.backend.utilities.DictionaryManagement;

public class DictionaryCommandline {
    private DictionaryManagement dictionaryManagement;

    public DictionaryCommandline() {
        dictionaryManagement = AppData.INSTANCE.dictionaryManagement;
    }

    public void showAllWords() {
        System.out.println("No | English | Vietnamese");

        int index = 1;
        for (Word word: dictionaryManagement.dictionary.getAllWords()) {
            System.out.println(String.format("%d | %s | %s", index++, word.getWord_target(), word.getWord_explain()));
        }
    }

    public void dictionaryBasic() {
        dictionaryManagement.insertFromCommandLine();

        showAllWords();
    }

    public void dictionaryAdvance() {

    }
}
