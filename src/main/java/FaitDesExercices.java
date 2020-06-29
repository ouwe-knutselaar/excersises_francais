import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FaitDesExercices {

    List<Exercice> exercices = new ArrayList<>();
    List<Integer> phrasesUtilisait = new ArrayList<>();
    int nombreDesExcersises=0;

    public void LoadExercices(List<Exercice> nouvellesExercices)
    {
        nouvellesExercices.forEach(excersise -> exercices.add(excersise));
        System.out.println("Nous avons "+ exercices.size()+" phrases");
        nombreDesExcersises = exercices.size();
    }

    public void DoExcersies(int amount,String objectif)
    {
        Random rand=new Random();
        phrasesUtilisait.clear();
        if(amount > exercices.size())amount= exercices.size();

        for(int tel=  0;tel<amount;tel++)
        {
            DoTest(rand.nextInt(nombreDesExcersises),objectif);
            System.out.println("----\n");
        }
    }

    private void DoTest(int testnumber,String objectif)
    {
        Exercice test = exercices.get(testnumber);
        Scanner in = new Scanner(System.in);
        System.out.println(test.showQuestion());
        int tel = 1;
        for(String repond : test.getReponds())
        {
            System.out.print(objectif + " << "+tel+" >> \n:");
            String answer = in.nextLine();
            if(answer.equals("quit"))break;

            if(answer.equals(repond)){
                System.out.println("correct");
            }else
            System.out.println("error must be '"+repond+"'");
            tel++;
        }
        System.out.println("Correct phrase:");
        System.out.println(test.getCorrectPhrase());
    }



}
