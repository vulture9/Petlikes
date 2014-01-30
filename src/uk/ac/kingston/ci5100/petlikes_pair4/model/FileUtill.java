/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.petlikes_pair4.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Scorchgid
 */
public class FileUtill {
    
    //FileReader doge = null;
    public BufferedReader doge = null;
    
    FileUtill()
    {
        try
        {
            doge = new BufferedReader(new FileReader("petStoreRawDinosaur.csv"));     
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
