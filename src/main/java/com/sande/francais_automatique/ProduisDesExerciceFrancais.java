package com.sande.francais_automatique;

import com.sande.francais_automatique.Exercice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProduisDesExerciceFrancais {

    /*
    qui, que, quoi, dont, où
    - ou composés :
    masculin singulier : lequel, duquel, auquel.
    féminin singulier : laquelle, de laquelle, à laquelle.
    masculin pluriel : lesquels, desquels, auxquels.
    féminin pluriel : lesquelles, desquelles, auxquelles

     */

    private String listOfRelatifPronoms[]={" qui "," que "," quoi "," dont "," où ",
                      " lequel "," duquel "," auquel ",
                      " laquelle "," de laquelle "," à laquelle ",
                      " lesquels "," desquels "," auxquels ",
                      " lesquelles "," desquelles "," auxquelles "};

    List<Exercice> PronomRelative(List<String> phrases)
    {
        Set<String> ListOfUsablePhrases=new HashSet<>();
        for(String pronomRelatif : listOfRelatifPronoms)
        {
            phrases.forEach(phrase -> ListOfUsablePhrases.add(phrase.contains(pronomRelatif) ? phrase: "-"));
        }

        List<Exercice> newListeDesExcersises=new ArrayList<>();
        for(String phrase : ListOfUsablePhrases)
        {
            Exercice newExcersise = new Exercice(phrase, listOfRelatifPronoms);
            newListeDesExcersises.add(newExcersise);
        }

        return newListeDesExcersises;
    }


    private String listDesArticles[] = {" le "," la "," les "," un "," une "};

    List<Exercice> Articles(List<String> phrases)
    {
        Set<String> ListOfUsablePhrases=new HashSet<>();
        for(String article : listDesArticles)
        {
            phrases.forEach(phrase -> ListOfUsablePhrases.add(phrase.contains(article) ? phrase: "-"));
        }

        List<Exercice> newListeDesExcersises=new ArrayList<>();
        for(String phrase : ListOfUsablePhrases)
        {
            Exercice newExcersise = new Exercice(phrase, listDesArticles);
            newListeDesExcersises.add(newExcersise);
        }

        return newListeDesExcersises;
    }
}
