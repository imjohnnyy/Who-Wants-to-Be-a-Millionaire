package pdc_assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Johnny Dong
 */

public class AudienceSuggestionLifeline {
    String audienceSuggestionLine;
    private int numAudienceLifeline;
    
    
    //Constructor
    public AudienceSuggestionLifeline(int numAudienceLifeline) 
    {
        this.numAudienceLifeline = numAudienceLifeline;
    }
    
    
    //Getter and setter methods
    public int getNumAudienceLifeline() {
        return numAudienceLifeline;
    }
    
    public void setNumAudienceLifeline(int newNumAudienceLifeline){
        this.numAudienceLifeline = newNumAudienceLifeline;
    }
        
    
    /* This hasRemainingAudienceLifeline() method checks to see if the player has an Audience life line left.
       If so, it returns true, otherwise it returns false. */
    
    public boolean hasRemainingAudienceLifeline()  {
        
        if(numAudienceLifeline > 0)
        {
            return true;
        }
        
        else
        {
            return false;
        }
      
    }
    
    
    /* This expendAudienceLifeline method reads through the specific audience suggestion lines in the audience_lifeline.txt file, if the player has not used the one given Audience lifeline per game
       , this method will output the specific audience suggestion message at a certain question number that the player chooses to use the Audience lifeline on. 
       Otherwise, if when the player has used up the one given Audience lifeline per game, the "You have no Audience life lines left!" message will be outputted instead. */ 
    
    public String expendAudienceLifeline(int questionNumber) throws FileNotFoundException, IOException {
        if(hasRemainingAudienceLifeline() == true)
        {
            try 
            {
                FileReader fr = new FileReader("./files/audience_lifeline.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNumberInFile = questionNumber;
                
                for(int i = 0; i < lineNumberInFile; i++)
                {
                    if(br.readLine().equals(lineNumberInFile))
                    {
                         br.readLine();
                    }
                }
                 
                System.out.println(br.readLine());
               
            } 
            catch(IOException e)
            {
                e.printStackTrace();
            }
            
        }   
        
        else if(hasRemainingAudienceLifeline() == false)
        {
            audienceSuggestionLine = "You have no Audience life lines left!";
            System.out.println(audienceSuggestionLine);     
        }
        
        return audienceSuggestionLine;
    }
    
  
            
}