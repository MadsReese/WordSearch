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
    private FileAccess fA = null;
    private ArrayList<String> words = null;
    private String[] wordsArray = null;

    public FileManager() throws FileNotFoundException, IOException
    {
        fA = new FileAccess();
        words = fA.getAll();
    }
    
    public ArrayList beginsWith(String str)
    {
        ArrayList<String> sortedWords = new ArrayList<>();
        for(String s : words)
        {
            if(s.startsWith(str))
            {
                sortedWords.add(s);
            }
        }
        return sortedWords;
    }
    
    public ArrayList getAll()
    {
        return words;
    }
}
