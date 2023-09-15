package set;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordSet {

    private Set<String> uniquewords;

    public UniqueWordSet(){
        this.uniquewords = new HashSet<>();
    }

    public void addWord(String word){
        uniquewords.add(word);
    }

    public void removeWord(String word){
        uniquewords.removeIf(x -> x.equalsIgnoreCase(word));
    }

    public boolean isPresent(String word){
        if(uniquewords.contains(word)){
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }

    public void showWords(){
        System.out.println(uniquewords);
    }

    public static void main(String[] args) {

        UniqueWordSet uws = new UniqueWordSet();

        uws.addWord("Bola");
        uws.addWord("Águia");
        uws.addWord("Berço");
        uws.addWord("Capivara");

        uws.removeWord("capivara");
        uws.isPresent("Bola");
        uws.isPresent("Capivara");
        uws.showWords();
    }
}
