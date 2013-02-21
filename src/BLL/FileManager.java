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
    //Local Variables\\
    private FileAccess fA = null;
    private List<String> words = null;

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
    public List getBeginsWith(String str)
    {
        List<String> sortedWords = new ArrayList<>();
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
    public List getContains(String str)
    {
        List<String> sortedWords = new ArrayList<>();
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
    public List getEndsWith(String str)
    {
        List<String> sortedWords = new ArrayList<>();
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
     * Returns a list of strings with the exact same as the query
     * @param str the query
     * @return the result in a list
     */
    public List getExact(String str)
    {
        List<String> sortedWords = new ArrayList<>();
        for(String s : words)
        {
            if(s.equals(str))
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
    public List getAll()
    {
        return words;
    }
}
