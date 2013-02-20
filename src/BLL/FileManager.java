/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.FileAccess;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Reese
 */
public class FileManager
{
    //Local Variables\\
    private FileAccess fA = null;
    private ArrayList<String> words = null;

    /**
     * When the filemanager is initiated it connects to the dal layer 
     * and recieves all the words in an ArrayList
     * @throws FileNotFoundException if the text file cannot be found
     * @throws IOException if the text file cannot be read
     */
    public FileManager() throws FileNotFoundException, IOException
    {
        fA = new FileAccess();
        words = fA.getAll();
    }
    
    /**
     * Returns the array of words that starts with the string
     * @param str the string to search from
     * @return ArrayList with resultset
     */
    public ArrayList getBeginsWith(String str)
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
    
    /**
     * Returns the words that contains the string inputted
     * @param str the string you want to search from
     * @return ArrayList with result
     */
    public ArrayList getContains(String str)
    {
        ArrayList<String> sortedWords = new ArrayList<>();
        for(String s : words)
        {
            if(s.contains(str))
            {
                sortedWords.add(s);
            }
        }
        return sortedWords;
    }
    
    /**
     * Returns a list of words that ends with the given string
     * @param str the string to search from
     * @return ArrayList of the words
     */
    public ArrayList getEndsWith(String str)
    {
        ArrayList<String> sortedWords = new ArrayList<>();
        for(String s : words)
        {
            if(s.endsWith(str))
            {
                sortedWords.add(s);
            }
        }
        return sortedWords;
    }
    
    /**
     * Returns all the words
     * @return ArrayList of all the words
     */
    public ArrayList getAll()
    {
        return words;
    }
}
