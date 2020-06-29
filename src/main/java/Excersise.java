import java.util.ArrayList;

public class Excersise {

    private String correctPhrase;
    private String exercise_question;
    private ArrayList<String> reponde_correct = new ArrayList<>();

    public Excersise(String phrase, String[] listOfWordsToQuestion)
    {
        this.correctPhrase = phrase;
        exercise_question = phrase;

        int questionCounter = 1;
        String replace = " << 1 >> ";
        for(String questionWords : listOfWordsToQuestion)
        {
            int location_de_mot = exercise_question.indexOf(questionWords);
            if(location_de_mot >= 0 )
            {
                StringBuilder objectToBuildTheQuestion = new StringBuilder();
                objectToBuildTheQuestion.append(exercise_question.substring(0,location_de_mot));
                objectToBuildTheQuestion.append(replace);
                objectToBuildTheQuestion.append(exercise_question.substring(location_de_mot+questionWords.length(),exercise_question.length()));
                exercise_question = objectToBuildTheQuestion.toString();
                reponde_correct.add(questionWords.replace(" ",""));
                questionCounter++;
                replace = " << "+questionCounter+" >> ";
            }
        }
    }


    public String showQuestion() {
        return exercise_question;
    }

    public ArrayList<String> getReponds()
    {
        return reponde_correct;
    }

    public String getCorrectPhrase()
    {
        return correctPhrase;
    }
}
