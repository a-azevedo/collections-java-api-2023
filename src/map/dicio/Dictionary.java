package map.dicio;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    Map<String,String> dictionary;

    public Dictionary(){
        dictionary = new HashMap<>();
    }

    public void addWord(String word, String definition){
        dictionary.put(word,definition);
    }

    public void removeWord(String word){
        if(!dictionary.isEmpty()){
            dictionary.remove(word);
        }
    }

    public void showAllWords(){
        System.out.println(dictionary);
    }

    public String findWord(String word){
        String definition = null;
        if(!dictionary.isEmpty()){
            definition = dictionary.get(word);
        }
        return definition;
    }

    public static void main(String[] args) {
        Dictionary d = new Dictionary();

        d.addWord("Relógio", "Ferramenta utilizada para verificar a hora exata em um determinado fuso horário");
        d.addWord("Fuzil", "Arma de fogo com alto poder bélico");
        d.addWord("Escova", "Utensílio utilizado para pentear os cabelos");

        d.showAllWords();
        d.removeWord("Fuzil");
        d.showAllWords();
        System.out.println(d.findWord("Escova"));
    }
}
