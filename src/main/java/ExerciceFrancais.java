import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ExerciceFrancais {

   private List<Exercice> sublist;
   private List<String> phrasesFrancais;



   public static void main(String argv[]) throws IOException {

      ExerciceFrancais excerciseFrancais = new ExerciceFrancais();
   }

   public ExerciceFrancais() throws IOException {

      ClassLoader classLoader = this.getClass().getClassLoader();
      phrasesFrancais = LireLesFichesDeTexte.ReadTextfileToList(classLoader.getResource("text.txt").getFile());

      Scanner in = new Scanner(System.in);
      boolean loop = true;
      while(loop)
      {
         System.out.println(" Les excercise français 1.0");
         System.out.println("   1 ... Les pronoms relatifs");
         System.out.println("   2 ... Les articles");

         System.out.println("   Q ... Les pronoms relatifs");
         System.out.println("-------------------------------------------");
         System.out.print  ("votre choisi ");

         switch(in.nextLine())
         {
            case "1": FaitLesPronomsRelatifs();
                      break;
            case "2": FaitLesArticles();
                      break;

            case "q":
            case "Q": loop = false;
         }
      }
   }


   private void FaitLesPronomsRelatifs()
   {
      ProduisDesExerciceFrancais produisDesExcersiseFrancais = new ProduisDesExerciceFrancais();
      sublist =  produisDesExcersiseFrancais.PronomRelative(phrasesFrancais);
      FaitDesExercices faitDesExcercises=new FaitDesExercices();
      faitDesExcercises.LoadExercices(sublist);
      faitDesExcercises.DoExcersies(10,"Pronom relatif");
   }

   private void FaitLesArticles()
   {
      ProduisDesExerciceFrancais produisDesExcersiseFrancais = new ProduisDesExerciceFrancais();
      sublist =  produisDesExcersiseFrancais.Articles(phrasesFrancais);
      FaitDesExercices faitDesExcercises=new FaitDesExercices();
      faitDesExcercises.LoadExercices(sublist);
      faitDesExcercises.DoExcersies(10,"L'article");
   }

}
