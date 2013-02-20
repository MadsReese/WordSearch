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
 *As we only need to access the database once, there is only need for a getAll()
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
    public ArrayList<String> getAll() throws FileNotFoundException, IOException
    {
        
        try(BufferedReader br = new BufferedReader(new FileReader("brit-a-z.txt")))
        {
            ArrayList<String> words = new ArrayList<>();
            String line = br.readLine();
            
            while (line != null)
            {
                words.add(line);
            }
            
            return words;
        }
    }
}
