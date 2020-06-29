import java.io.*;
import java.util.List;

public class Frauto {

   public static void main(String argv[]) throws IOException {
      ProduisDesExcersiseFrancais produisDesExcersiseFrancais = new ProduisDesExcersiseFrancais();
      ClassLoader classLoader = new Frauto().getClass().getClassLoader();
      List<String> phrasesFrancais = LireLesFichesDeTexte.ReadTextfileToList(classLoader.getResource("text.txt").getFile());
      List<Excersise> sublist =  produisDesExcersiseFrancais.PronomRelative(phrasesFrancais);

      FaitDesExcercises faitDesExcercises=new FaitDesExcercises();
      faitDesExcercises.LoadExcersises(sublist);
      faitDesExcercises.DoExcersies(10);
   }


}
