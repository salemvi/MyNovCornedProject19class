package JavaRush_17and18Level;

import java.util.Arrays;
import java.util.List;

public class practice_lyambda_19lvl {
    public static void main(String[] args) {
     //sposobOne();
     //sposobTwo();
     //sposobThree();
        //sposobFour();

    }
    public static void sposobOne(){
        List<String> wordList = Arrays.asList("I ", "love ",
                "learning ", "on ", "JavaRush!");
        String[] wordArray = new String[wordList.size()];
        for (int i = 0; i < wordList.size(); i++) {
            wordArray[i] = wordList.get(i);
            System.out.print(wordArray[i]);
        }
        System.out.println();
    }
    public static void sposobTwo(){
      List<String> wordlist1 = Arrays.asList("I ", "love ",
              "learning ", "on ", "JavaRush!");
      String[] wordsArray1 = wordlist1.toArray(new String[0]);
      for(String word : wordsArray1){
          System.out.println(word);
      }
    }
    public static void sposobThree(){
        List<String> wordlist2 = Arrays.asList("I ", "love ",
                "learning ", "on ", "JavaRush!");
        String[] wordsArray2 = new String[wordlist2.size()];
        wordlist2.toArray(wordsArray2);
        for(String word: wordsArray2){
            System.out.println(word);
        }
    }
    public static void sposobFour(){
        List<String> wordList3 = Arrays.asList("I ", "love ",
                "learning ", "on ", "JavaRush!");
        String[] wordArray3 = new String[wordList3.size()*2];
        for(int i = 0; i<wordArray3.length; i++){
        wordArray3[i] = String.valueOf(i);
        }
        wordList3.toArray(wordArray3);
        for(String word : wordArray3){
            System.out.println(word);
        }

    }
}
