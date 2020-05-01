package com.ocr.sukan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        char lettreLocale;
        int nombreVoyelle = 0;
        int nombreLettreTotale = 0;
        System.out.println("Saisissez une phrase à analyser (elle doit finir par un point \".\"):");
        Scanner sc = new Scanner(System.in);
        String phraseAAnalyser = sc.nextLine();

        String sentenceTrimed = phraseAAnalyser.trim();
        sentenceTrimed = sentenceTrimed.toLowerCase();
        //Initialisation du pointeur de la phrase
        int pointeurChar = 0;
        final int lengthSentence = sentenceTrimed.length();
        lettreLocale = sentenceTrimed.charAt(pointeurChar);
        do {
            if (lettreLocale == 'a' || lettreLocale == 'e' || lettreLocale == 'i' || lettreLocale == 'o' || lettreLocale == 'u' || lettreLocale == 'y') {
                nombreVoyelle += 1;
            }
            nombreLettreTotale += 1;
            pointeurChar += 1;
            lettreLocale = sentenceTrimed.charAt(pointeurChar);
        } while (pointeurChar < lengthSentence-1);
        double pourcentageVoyelle = (double) nombreVoyelle / nombreLettreTotale * 100;
        System.out.println("Dans la phrase : \"" + phraseAAnalyser + "\", il y a " + nombreVoyelle + " voyelles, soit un pourcentage de " + pourcentageVoyelle + " %!");
    }
}
