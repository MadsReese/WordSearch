/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.FileAccess;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Reese
 */
public class FileManager
{
    FileAccess fA = null;
    List<String> words = null;
    
    public FileManager() throws FileNotFoundException, IOException
    {
        fA = new FileAccess();
        words = fA.getAll();
    }
    
    
}
