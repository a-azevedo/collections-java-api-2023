package map.search.wordcount;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    Map<String, Integer> wordCounter;

    public WordCounter(){
        wordCounter = new HashMap<>();
    }

    public void addWord(String word, int count){
        wordCounter.put(word, count);
    }

    public void removeWord(String word){
        wordCounter.remove(word);
    }

    public void showAllWordsAndCounters(){
        System.out.println(wordCounter);
    }

    public void getMoreFrequentWord(){
        Map<String, Integer> moreFrequentWord = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : wordCounter.entrySet()){
            if (entry.getValue() > max){
                moreFrequentWord.clear();
                max = entry.getValue();
                moreFrequentWord.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(moreFrequentWord);
    }

    public static void main(String[] args) {

        WordCounter wc = new WordCounter();

        wc.addWord("bola", 2);
        wc.addWord("casa", 6);
        wc.addWord("carro", 3);
        wc.addWord("caneca", 5);

        wc.removeWord("carro");
        wc.showAllWordsAndCounters();
        wc.getMoreFrequentWord();
    }
}
