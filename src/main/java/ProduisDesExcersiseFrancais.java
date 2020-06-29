import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProduisDesExcersiseFrancais {

    /*
    qui, que, quoi, dont, où
    - ou composés :
    masculin singulier : lequel, duquel, auquel.
    féminin singulier : laquelle, de laquelle, à laquelle.
    masculin pluriel : lesquels, desquels, auxquels.
    féminin pluriel : lesquelles, desquelles, auxquelles

     */

    String listOfRelatifPronoms[]={" qui "," que "," quoi "," dont "," où ",
                      " lequel "," duquel "," auquel ",
                      " laquelle "," de laquelle "," à laquelle ",
                      " lesquels "," desquels "," auxquels ",
                      " lesquelles "," desquelles "," auxquelles "};

    List<Excersise> PronomRelative(List<String> phrases)
    {
        Set<String> ListOfUsablePhrases=new HashSet<>();
        for(String pronomRelatif : listOfRelatifPronoms)
        {
            phrases.forEach(phrase -> ListOfUsablePhrases.add(phrase.contains(pronomRelatif) ? phrase: "-"));
        }

        List<Excersise> newListeDesExcersises=new ArrayList<>();
        for(String phrase : ListOfUsablePhrases)
        {
            Excersise newExcersise = new Excersise(phrase, listOfRelatifPronoms);
            newListeDesExcersises.add(newExcersise);
        }

        return newListeDesExcersises;
    }
}
