/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import BLL.FileManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Reese
 */
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            FileManager fM = new FileManager();
            ArrayList<String> word = fM.getBeginsWith("");          
            for(String s : word)
            {
                System.out.println(s);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Derp");
        }
        catch (IOException ex)
        {
            System.out.println("Derp");
        }
    }
}
