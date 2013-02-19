/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Reese
 */
public class FileAccess
{
    
    
    public Array
    BufferedReader br = new BufferedReader(new FileReader("brit-a-z.txt"));
       
            String line = br.readLine();

            while (line != null)
            {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String everything = sb.toString();
    

    
    
        finally {
        br.close();
    }
}
