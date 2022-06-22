package pdc_assignment2;

/**
 *
 * @author Ethan Haggart
 */
public class BankSystem {
    int bank;
    
    //Constructor
    public BankSystem(){
        bank = 0;
    }
    
    //Getter Method
    public int getBank(){
        return bank;
    }
    
    //AddBank method that checks for questionNumberCount and changes the bank points according to the question number
    public int addBank(int round){
        if(round == 0){
            bank = 100;
            return bank;
        }if(round == 1){
            bank = 200;
            return bank;
        }if(round == 2){
            bank = 300;
            return bank;
        }if(round == 3){
            bank = 500;
            return bank;
        }if(round == 4){
            bank = 1000;
            return bank;
        }if(round == 5){
            bank = 2000;
            return bank;
        }if(round == 6){
            bank = 4000;
            return bank;
        }if(round == 7){
            bank = 8000;
            return bank;
        }if(round == 8){
            bank = 16000;
            return bank;
        }if(round == 9){
            bank = 32000;
            return bank;
        }if(round == 10){
            bank = 64000;
            return bank;
        }if(round == 11){
            bank = 125000;
            return bank;
        }if(round == 12){
            bank = 250000;
            return bank;
        }if(round == 13){
            bank = 500000;
            return bank;
        }if(round == 14){
            bank = 1000000;
            return bank;
        }
        return bank;
    }
    
    //exitBank method that checks for questionNumberCount and changes the bank points when exit button is clicked
    public void exitBank(int round){
        System.out.println("\nYou exited on round: " + (round+1) + " and won: $" + bank);
    }
    
    //RemoveBank method that checks for questionNumberCount and changes the bank points according to the question number
    public int removeBank(int round){
        if(round == 0 || round == 1 || round == 2 || round == 3){
            bank = 0;
            return bank;
        }
        if(round == 4 || round == 5 || round == 6 || round == 7 || round == 8){
            bank = 1000;
            return bank;
        }
        if(round == 9 || round == 10 || round == 11 || round == 12 || round == 13){
            bank = 32000;
            return bank;
        }
        if(round == 14){
            bank = 1000000;
            return bank;
        }
        return bank;
    }
    
    //Ending method that takes in questionNumbrCount to output a string according to which round the player lost at, and takes in an input that checks for correct input and displays
    //text according to the questionNumberCount and the input used.
    public String ending(int round, String input){
        String output;
        
        if(round == 0 || round == 1 || round == 2 || round == 3) {
            output = "\nYou got to round " + (round+1) + " which is tier 0. You did not win any money this time.";
            return output;
        }
        if(round == 4 || round == 5 || round == 6 || round == 7 || round == 8) {
            output = "\nYou got to round " + (round+1) + " which is tier 1. You won with $1,000.";
            return output;
        }
        if(round == 9 || round == 10 || round == 11 || round == 12 || round == 13) {
            output = "\nYou got to round " + (round+1) + " which is tier 2. You won with $32,000, congratulations.";
            return output;
        }
        if(round == 14) {
            output = "\nYou got to round " + (round+1) + " which is tier 3. You won $1,000,000 congratulations";
            return output;
        }
        else{
            return "";
        }
    }
}