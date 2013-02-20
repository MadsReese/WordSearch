/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
        
        try(FileReader fr = new FileReader("brit-a-z.txt"))
        {
            ArrayList<String> words = new ArrayList<>();
            Scanner sc = new Scanner(fr);
            
            
            while (sc.hasNext())
            {
                words.add(sc.next());
            }
            
            return words;
        }
    }
}
