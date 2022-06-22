package pdc_assignment2;

import java.util.Random;

/**
 *
 * @author Ethan Haggart
 */

public class FiftyFiftyLifeline {
    private int fiftyfifty;
    
    //Constructor
    public FiftyFiftyLifeline(int fiftyfifty){
        this.fiftyfifty = fiftyfifty;
    }
    
    //Getter method
    public int getFiftyFiftyLifeline(){
        return fiftyfifty;
    }
    
    //Setter method
    public void setNumAudienceLifeline(int newNumFiftyFifty){
        this.fiftyfifty = newNumFiftyFifty;
    }
    
    //hasRemainingFiftyFiftyAttempts method that checks if the user hasn't used their 1 free fifty-fifty lifeline attempt, that returns true or false depending on if the player has
    //or not.
    public boolean hasRemainingFiftyFiftyAttempts(){
        if(fiftyfifty > 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    //FiftyFiftyUserChoice takes in questionNumberCount and checks if player has any fifty-fifty lifeline attempts remaining and then
    //also prints a randomly prints out a new selection of two choices depending on the questionNumber.
    public void FiftyFiftyUserChoice(int questionNumberCount){
        int i = (new Random()).nextInt(3);
        if(hasRemainingFiftyFiftyAttempts() == true){
           if(questionNumberCount == 0){
                if(i == 0){
                System.out.println("[C: Indy 500 ,   D: Isle of Man TT]");
                }
                else if(i == 1){
                System.out.println("[A: Le Mans 24 Hours ,   D: Isle of Man TT]");
                }
                else if(i == 2){
                System.out.println("[B: Monaco Grand Prix ,   D: Isle of Man TT]");
                }
            }
            else if(questionNumberCount == 1){
                if(i == 0){
                System.out.println("[B: Health ,   D: Honour]");
                }
                else if(i == 1){
                System.out.println("[B: Health ,   C: Household]");
                }
                else if(i == 2){
                System.out.println("[A: Humanity ,   B: Health]");
                }
            }
            else if(questionNumberCount == 2){
                if(i == 0){
                System.out.println("[C: Cinderella ,   D: Elsa]");
                }
                else if(i == 1){
                System.out.println("[A: Pochahontas ,   C: Cinderella]");
                }
                else if(i == 2){
                System.out.println("[B: Sleeping Beauty ,   C: Cinderella]");
                }
            }
            else if(questionNumberCount == 3){
                if(i == 0){
                System.out.println("[A: California ,   D: Montana]");
                }
                else if(i == 1){
                System.out.println("[A: California ,   B: Florida]");
                }
                else if(i == 2){
                System.out.println("[A: California ,   C: Texas]");
                }
            }
            else if(questionNumberCount == 4){
                if(i == 0){
                System.out.println("[A: The Diamond Sutra ,   D: Lady Chatterley's Rastafarian Lover]");
                }
                else if(i == 1){
                System.out.println("[A: The Diamond Sutra ,   B: The Joy of Satanism]");
                }
                else if(i == 2){
                System.out.println("[A: The Diamond Sutra ,   C: Fifty Shades of Greek Orthodox]");
                }
            }
            else if(questionNumberCount == 5){
                if(i == 0){
                System.out.println("[C: Buffy the Vampire Slayer ,   D: Ally McBeal]");
                }
                else if(i == 1){
                System.out.println("[A: Gilmore Girls ,   C: Buffy the Vampire Slayer]");
                }
                else if(i == 2){
                System.out.println("[B: Felicity ,   C: Buffy the Vampire Slayer]");
                }
            }
            else if(questionNumberCount == 6){
                if(i == 0){
                System.out.println("[C: Martha Washington's silverware ,   D: Thomas Jefferson's copper sink]");
                }
                else if(i == 1){
                System.out.println("[A: Alexander Hamilton's gold inkwell ,   C: Martha Washington's silverware]");
                }
                else if(i == 2){
                System.out.println("[B: Benjamin Franklin's pewter beer steins ,   C: Martha Washington's silverware]");
                }
            }
            else if(questionNumberCount == 7){
                if(i == 0){
                System.out.println("[C: Globe Theater ,   D: Buckingham Palace]");
                }
                else if(i == 1){
                System.out.println("[A: British Museum ,   C: Globe Theater]");
                }
                else if(i == 2){
                System.out.println("[B: Tower of London ,   C: Globe Theater]");
                }
            }
            else if(questionNumberCount == 8){
                if(i == 0){
                System.out.println("[C: Bic ,   D: Evian]");
                }
                else if(i == 1){
                System.out.println("[A: Renault ,   C: Bic]");
                }
                else if(i == 2){
                System.out.println("[B: Nestlé ,   C: Bic]");
                }
            }
            else if(questionNumberCount == 9){
                if(i == 0){
                System.out.println("[A: The Tabard ,   D: The Moon Under Water]");
                }
                else if(i == 1){
                System.out.println("[A: The Tabard ,   B: The Admiral Benbow]");
                }
                else if(i == 2){
                System.out.println("[A: The Tabard ,   C: The Golden Perch]");
                }
            }
            else if(questionNumberCount == 10){
                if(i == 0){
                System.out.println("[C: The Thinker ,   D: Venus de Milo]");
                }
                else if(i == 1){
                System.out.println("[A: Pietà ,   C: The Thinker]");
                }
                else if(i == 2){
                System.out.println("[B: David ,   C: The Thinker]");
                }
            }
            else if(questionNumberCount == 11){
                if(i == 0){
                System.out.println("[C: Iran ,   D: Uganda]");
                }
                else if(i == 1){
                System.out.println("[A: Sweden ,   C: Iran]");
                }
                else if(i == 2){
                System.out.println("[B: David ,   C: Iran]");
                }
            }
            else if(questionNumberCount == 12){
                if(i == 0){
                System.out.println("[C: Calyx ,   D: Chloroplast]");
                }
                else if(i == 1){
                System.out.println("[A: Rhizome ,   D: Chloroplast]");
                }
                else if(i == 2){
                System.out.println("[B: Petiole ,   D: Chloroplast]");
                }
            }
            else if(questionNumberCount == 13){
                if(i == 0){
                System.out.println("[A: Hastings ,   D: Agincourt]");
                }
                else if(i == 1){
                System.out.println("[A: Hastings ,   B: Waterloo]");
                }
                else if(i == 2){
                System.out.println("[A: Hastings ,   C: Somme]");
                }
            }
            else if(questionNumberCount == 14){
                if(i == 0){
                System.out.println("[A: Boeing B-52 bomber ,   D: Avro Lancaster bombo]");
                }
                else if(i == 1){
                System.out.println("[A: Boeing B-52 bomber ,   B: Hawker Hurricane]");
                }
                else if(i == 2){
                System.out.println("[A: Boeing B-52 bomber ,   C: Lockhead SR-71 Blackbird]");
                }
            }
            else{
                System.out.println("error");
            } 
        }
        else{
            System.out.println("You do not have any fifty fifty lifeline attempts remaining.");
        }
    }
}
