/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Reese
 */
public class FileAccess
{

    /**
     * Gets the words from the dictionary file
     * @return the words in a list
     * @throws FileNotFoundException If the file cannot be found
     * @throws IOException If the file cannot be read
     */
    public List<String> getWords() throws FileNotFoundException, IOException
    {
        
        try(BufferedReader br = new BufferedReader(new FileReader("brit-a-z.txt"));
)
        {
            List<String> words = new ArrayList<>();
            String line = br.readLine();

            while (line != null)
            {
                words.add(line);
            }
            return words;
        }
    }
}
