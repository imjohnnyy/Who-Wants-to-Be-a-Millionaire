package pdc_assignment2;

/**
 *
 * @author ethan
 */

public class NewGameQuestions {
    String[] qArr = new String[15];
    String[] ansArr = new String[15];
    String[] ansOpA = new String[15];
    String[] ansOpB = new String[15];
    String[] ansOpC = new String[15];
    String[] ansOpD = new String[15];
    String question = "";
    String answer = "";
    String opA,opB,opC,opD;
    
    public NewGameQuestions() {
        qArr[0] = "1. In the hisory of motor sport, which of these iconic races was held first? - D\"; tory of motor sport, which of these iconic races was held first? - D"; 
        qArr[1] = "2. In the UK, the abbreviation NHS stands for National what Service? - B"; 
        qArr[2] = "3. Which Disney character famously leaves a glass slipper behind at a royal ball? - C"; 
        qArr[3] = "4. Translating to mean \"I have found it,\" what is the only U.S. state to have an official motto in Greek? - A"; 
        qArr[4] = "5. Not to be confused with a similar-sounding racier text, what Buddhist scroll was discovered in a Chinese cave in 1907, over a Millennium after it was printed? - A";
        qArr[5] = "6. Long before he directed comic book guy fare like \"The Avengers,\" Joss Whedon created what female-centric cult TV show? - C"; 
        qArr[6] = "7. When the U.S. mint was established in 1792, legend has it that the first coins it produced were made from what? - C";
        qArr[7] = "8. For the sake of historical accuracy, what's the only building in Central London that's been allowed to have a thatched roof since a major \nfire struck the city in 1212? - C";
        qArr[8] = "9. Hoping to avoid mispronunciations, when it was established in 1949, what French company dropped the 'h' from the end of it's founder's \nlast name? - C";
        qArr[9] = "10. In 'The Canterbury Tales' by Chaucer, what is the name of the inn where the pilgrims first meet? - A";
        qArr[10] = "11. Which of these famous statues was originally conceived as part of a work named 'The Gates of Hell'? - C";
        qArr[11] = "12. Which country boasts its very own Carpet Museum, with an exterior  designed to look like a loom? - C";
        qArr[12] = "13. What name is given to the structure in a plant cell where photosynthesis takes place? - D";
        qArr[13] = "14. Which famous battle is depicted on the Bayeux Tapestry? - A";
        qArr[14] = "15. Which famous aircraft is also known as the Stratofortress? - A";
        
        ansArr[0] = "D";
        ansArr[1] = "B";
        ansArr[2] = "C";
        ansArr[3] = "A";
        ansArr[4] = "A";
        ansArr[5] = "C";
        ansArr[6] = "C";
        ansArr[7] = "C";
        ansArr[8] = "C";
        ansArr[9] = "A";
        ansArr[10] = "C";
        ansArr[11] = "C";
        ansArr[12] = "D";
        ansArr[13] = "A";
        ansArr[14] = "A";
        
        //Question 1
        ansOpA[0] = "A: Le Mans 24 Hours";
        ansOpB[0] = "B: Monaco Grand Prix";
        ansOpC[0] = "C: Indy 500";
        ansOpD[0] = "D: Isle of Man TT";
        //Question 2
        ansOpA[1] = "A: Humanity";
        ansOpB[1] = "B: Health";
        ansOpC[1] = "C: Household";
        ansOpD[1] = "D: Honour";
        //Question 3
        ansOpA[2] = "A: Pochahontas";
        ansOpB[2] = "B: Sleeping Beauty";
        ansOpC[2] = "C: Cinderella";
        ansOpD[2] = "D: Elsa";
        //Question 4
        ansOpA[3] = "A: California";
        ansOpB[3] = "B: Florida";
        ansOpC[3] = "C: Texas";
        ansOpD[3] = "D: Montana";
        //Question 5
        ansOpA[4] = "A: The Diamond Sutra";
        ansOpB[4] = "B: The Joy of Satanism";
        ansOpC[4] = "C: Fifty Shades of Greek Orthodox";
        ansOpD[4] = "D: Lady Chatterley's Rastafarian Lover";
        //Question 6
        ansOpA[5] = "A: Gilmore Girls";
        ansOpB[5] = "B: Felicity";
        ansOpC[5] = "C: Buffy the Vampire Slayer";
        ansOpD[5] = "D: Ally McBeal";
        //Question 7
        ansOpA[6] = "A: Alexander Hamilton's gold inkwell";
        ansOpB[6] = "B: Benjamin Franklin's pewter beer steins";
        ansOpC[6] = "C: Martha Washington's silverware";
        ansOpD[6] = "D: Thomas Jefferson's copper sink";
        //Question 8
        ansOpA[7] = "A: British Museum";
        ansOpB[7] = "B: Tower of London";
        ansOpC[7] = "C: Globe Theater";
        ansOpD[7] = "D: Buckingham Palace";
        //Question 9
        ansOpA[8] = "A: Renault";
        ansOpB[8] = "B: Nestlé";
        ansOpC[8] = "C: Bic";
        ansOpD[8] = "D: Evian";
        //Question 10
        ansOpA[9] = "A: The Tabard";
        ansOpB[9] = "B: The Admiral Benbow";
        ansOpC[9] = "C: The Golden Perch";
        ansOpD[9] = "D: The Moon Under Water";
        //Question 11
        ansOpA[10] = "A: Pietà";
        ansOpB[10] = "B: David";
        ansOpC[10] = "C: The Thinker";
        ansOpD[10] = "D: Venus de Milo";
        //Question 12
        ansOpA[11] = "A: Sweden";
        ansOpB[11] = "B: Brazil";
        ansOpC[11] = "C: Iran";
        ansOpD[11] = "D: Uganda";
        //Question 13
        ansOpA[12] = "A: Rhizome";
        ansOpB[12] = "B: Petiole";
        ansOpC[12] = "C: Calyx";
        ansOpD[12] = "D: Chloroplast";
        //Question 14
        ansOpA[13] = "A: Hastings";
        ansOpB[13] = "B: Waterloo";
        ansOpC[13] = "C: Somme";
        ansOpD[13] = "D: Agincourt";
        //Question 15
        ansOpA[14] = "A: Boeing B-52 bomber";
        ansOpB[14] = "B: Hawker Hurricane";
        ansOpC[14] = "C: Lockhead SR-71 Blackbird";
        ansOpD[14] = "D: Avro Lancaster bomber";
    }
    
    public String getQuestion(int round) {
        for(;round < 15; round++) {
            question = qArr[round];
            round++;
            return question;
        }
        return question;
    }
    
    public String getAnswer(int round){
        if(qArr[0].equalsIgnoreCase("D")){
            System.out.println("D");
            return ansArr[0];
        }if(qArr[1].equalsIgnoreCase("B")){
            System.out.println("B");
            return ansArr[0];
        }if(qArr[2].equalsIgnoreCase("C")){
            System.out.println("C");
            return ansArr[0];    
        }if(qArr[3].equalsIgnoreCase("A")){
            System.out.println("A");
            return ansArr[0];    
        }if(qArr[4].equalsIgnoreCase("A")){
            System.out.println("A");
            return ansArr[0];    
        }if(qArr[5].equalsIgnoreCase("C")){
            System.out.println("C");
            return ansArr[0];    
        }if(qArr[6].equalsIgnoreCase("C")){
            System.out.println("C");
            return ansArr[0];    
        }if(qArr[7].equalsIgnoreCase("C")){
            System.out.println("C");
            return ansArr[0];    
        }if(qArr[8].equalsIgnoreCase("C")){
            System.out.println("C");
            return ansArr[0];    
        }if(qArr[9].equalsIgnoreCase("A")){
            System.out.println("A");
            return ansArr[0];    
        }if(qArr[10].equalsIgnoreCase("C")){
            System.out.println("C");
            return ansArr[0];    
        }if(qArr[11].equalsIgnoreCase("C")){
            System.out.println("C");
            return ansArr[0];    
        }if(qArr[12].equalsIgnoreCase("D")){
            System.out.println("D");
            return ansArr[0];    
        }if(qArr[13].equalsIgnoreCase("A")){
            System.out.println("A");
            return ansArr[0];    
        }if(qArr[14].equalsIgnoreCase("A")){
            System.out.println("A");
            return ansArr[0];    
        }
        return "??";
    }
    
    public String ansOptionsA(int round) {
        for(;round < 15; round++) {
            opA = ansOpA[round];
            round++;
            return opA;
        }
        return opA;
    }
    
    public String ansOptionsB(int round) {
        for(;round < 15; round++) {
            opB = ansOpB[round];
            round++;
            return opB;
        }
        return opB;
    }
    
    public String ansOptionsC(int round) {
        for(;round < 15; round++) {
            opC = ansOpC[round];
            round++;
            return opC;
        }
        return opC;
    }
    
    public String ansOptionsD(int round) {
        for(;round < 15; round++) {
            opD = ansOpD[round];
            round++;
            return opD;
        }
        return opD;
    }
    
    public String resultAns(String input, int round) {
        for(;round < 15; round++) {
            answer = ansArr[round];
            if(input.equalsIgnoreCase(ansArr[round])) {
                return "Correct";
            }
            else {
                return "Incorrect";
            }
        }
        return "Incorrect";
    }
    
    public boolean resultBoolean(String input, int round){
        for(;round < 15; round++) {
            answer = ansArr[round];
            if(input == (answer)) {
                return true;
            }
            else 
                return false;
        }
        return false;
    }
}
