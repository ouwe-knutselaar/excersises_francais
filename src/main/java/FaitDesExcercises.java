import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FaitDesExcercises {

    List<Excersise> excersises = new ArrayList<>();

    public void LoadExcersises(List<Excersise> nouvellesExcersises)
    {
        nouvellesExcersises.forEach(excersise -> excersises.add(excersise));
    }

    public void DoExcersies(int amount)
    {
        if(amount > excersises.size())amount=excersises.size();

        for(int tel=  0;tel<amount;tel++)
        {
            DoTest(tel);
            System.out.println("----\n");
        }
    }

    private void DoTest(int testnumber)
    {
        Excersise test = excersises.get(testnumber);
        Scanner in = new Scanner(System.in);
        System.out.println(test.showQuestion());
        int tel = 1;
        for(String repond : test.getReponds())
        {
            System.out.print("pronom pour << "+tel+" >> \n:");
            String answer = in.nextLine();
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
