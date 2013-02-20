/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.FileAccess;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Reese
 */
public class FileManager
{
    FileAccess fA = null;
    List<String> words = null;
    String[] wordArray = null;

    public FileManager() throws FileNotFoundException, IOException
    {
        fA = new FileAccess();
        words = fA.getAll();
    }
    
    public String[] beginsWith(String str)
    {
        wordArray = (String[]) words.toArray();
        
        //List<String> sortedWords = new ArrayList<>();
        String[] sortedWords = null;
        for(int i = 0; i < wordArray.length; i++)
        {
            if(wordArray[i].startsWith(str))
            {
                //sortedWords.add(str);
                sortedWords[i] = str;
            }
        }
        return sortedWords;
    }
}
