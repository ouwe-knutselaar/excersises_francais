import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LireLesFichesDeTexte {

    public static List<String> ReadTextfileToList(String textfile) throws IOException {
        File testfile = new File(textfile);
        FileReader fr = new FileReader(testfile);
        BufferedReader br = new BufferedReader(fr);

        int readedChar;
        ArrayList<String> ListOfPhrases = new ArrayList<>();
        StringBuilder newPhrase = new StringBuilder();
        while((readedChar = br.read())!=-1)
        {
            newPhrase.append((char)readedChar);
            if(readedChar == '.' || readedChar == '?' || readedChar == '!')
            {
                ListOfPhrases.add(newPhrase.toString());
                newPhrase.setLength(0);
            }
        }
        return ListOfPhrases;
    }
}
