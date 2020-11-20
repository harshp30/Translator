
import java.util.Scanner;

public class Translator {

    public static void main(String[] args) {
        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);
        boolean run = true;
        int stored = -1;
        String word;
        String ask;
        String language;
        String[] english = {"Yes", "Hello", "Shoes", "No", "Candy", "Food", "Drink", "Glass", "Grass", "Fox", "Man", "Woman", "Eyes", "Computer", "Winter"};
        String[] french = {"Oui", "Bonjour", "Chaussures", "Non", "Bonbons", "Nourriture", "Boisson", "Verre", "Herbe", "Renard", "Homme", "Femme", "Yeux", "Ordinateur", "Hiver"};

        System.out.println("WELCOME TO THE ENGLISH-FRENCH TRANSLATOR!");
        System.out.println();
        while (run == true) {
            System.out.println("Which language would you like to translate too?");
            language = numscan.nextLine();
            if (language.equalsIgnoreCase("english")) {
                                System.out.println();
                System.out.println("This translator works for the following French words...");
                System.out.println();
                for (int i = 0; i < french.length; i++) {
                    System.out.println(french[i]);
                }
                System.out.println();
                System.out.println("Say word you would like translated to English:");
                word = wordscan.nextLine();
                System.out.println();
                while (stored == -1) { // We can set up a while loop to keep searching until a result is returned.
                    System.out.println("This word is not supported by the translator. Please try a word from the list above.");
                    word = wordscan.nextLine();
                    for (int i = 0; i < french.length; i++) {
                        if (french[i].equalsIgnoreCase(word)) {
                            stored = i;
                            break;
                        }
                    }

                }
                for (int i = 0; i < french.length; i++) {
                    if (word.equalsIgnoreCase(french[i])) {
                        stored = i;
                    }
                }
                System.out.println("The English version of this word is:  " + english[stored]);
                System.out.println();
            } else if (language.equalsIgnoreCase("french")) {
                                System.out.println();
                System.out.println("This translator works for the following English words...");
                System.out.println();
                for (int i = 0; i < english.length; i++) {
                    System.out.println(english[i]);
                }
                System.out.println();
                System.out.println("Say word you would like translated to French:");
                word = wordscan.nextLine();
                System.out.println();
                while (stored == -1) { // We can set up a while loop to keep searching until a result is returned.
                    System.out.println("This word is not supported by the translator. Please try a word from the list above.");
                    word = wordscan.nextLine();
                    for (int i = 0; i < english.length; i++) {
                        if (english[i].equalsIgnoreCase(word)) {
                            stored = i;
                            break;
                        }
                    }

                }
                for (int i = 0; i < english.length; i++) {
                    if (word.equalsIgnoreCase(english[i])) {
                        stored = i;
                    }
                }
                System.out.println("The French version of this word is:  " + french[stored]);
                System.out.println();
            }

            System.out.println("Do you want to translate another word? Type exit to leave.");
            ask = wordscan.nextLine();
            if (ask.contains("exit")) {
                run = false;
            } else {
                run = true;
            }
            System.out.println();
        }//end while
    }//end main
}//end class
