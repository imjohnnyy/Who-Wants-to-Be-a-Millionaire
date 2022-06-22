
package pdc_assignment2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 *
 * @author ethan
 */
public class MillionaireAppMain extends javax.swing.JFrame {
    NewGameQuestions ngq = new NewGameQuestions();
    BankSystem bank = new BankSystem();
    UserAnswersDBManager answers = new UserAnswersDBManager();
    
    boolean ans = false;
    int points = 0;
    int round = 0;
    String input;

    public MillionaireAppMain() {
        initComponents();
        ActionListeners();
        GUIQuestions();
        GUIAnswerOptions();
        points(round);
    }
    
    public void GUIQuestions() {
        jTextField2.setText(ngq.getQuestion(round));
    }
    
    public void GUIAnswerOptions() {
        A.setText(ngq.ansOptionsA(round));
        B.setText(ngq.ansOptionsB(round));
        C.setText(ngq.ansOptionsC(round));
        D.setText(ngq.ansOptionsD(round));
    }
    
    public boolean points(int round) {
        if(ngq.resultBoolean(input, round)){
            jLabel12.setText(String.valueOf(bank.addBank(round)));
            return true;
        }
        if(!ngq.resultBoolean(input, round)){
            jLabel12.setText(String.valueOf(bank.removeBank(round)));
            return false;
        }
        return false;
    }
    
    public void ActionListeners() {
        //Exit button
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                A.setEnabled(false);
                B.setEnabled(false);
                C.setEnabled(false);
                D.setEnabled(false);
                bank.exitBank(round);
                System.exit(0);
            }
        }
        );
        
        //Controls button
        jButton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Controls().setVisible(true);
            }
        }
        );
        
        //A button
        A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input = "A";
                ngq.resultAns(input, round);
                answers.insertDataIntoUATable(round, input);        //Inserts the "A" input and the current round number into the UsersAnswersDB_Ebd database when the user presses this A button
            
                jTextField1.setText(input + " is " + ngq.resultAns(input, round));
                if(round < 15) {
                    System.out.println(ngq.getQuestion(round));
                    System.out.println("Round: " + (round+1) + " | Input: A | " + ngq.resultAns(input, round));
                    points(round);
                    if(!points(round)) {
                        bank.removeBank(round);
                        System.out.println(bank.ending(round, input));
                        A.setEnabled(false);
                        B.setEnabled(false);
                        C.setEnabled(false);
                        D.setEnabled(false);
                        System.exit(0);
                    }
                }
                else {
                    jTextField1.setText("");
                }
                if(round == 14) {
                    bank.removeBank(round);
                    System.out.println(bank.ending(round, input));
                }
                round++;
                jTextField2.setText(ngq.getQuestion(round));
                A.updateUI();
                A.setText(ngq.ansOptionsA(round));
                B.updateUI();
                B.setText(ngq.ansOptionsB(round));
                C.updateUI();
                C.setText(ngq.ansOptionsC(round));
                D.updateUI();
                D.setText(ngq.ansOptionsD(round));
                
                //reset button after 5050 lifeline
                A.setEnabled(true);
                B.setEnabled(true);
                C.setEnabled(true);
                D.setEnabled(true);
                
                //reset color after audience suggestion lifeline
                A.setBackground(new java.awt.Color(37,72,142));
                B.setBackground(new java.awt.Color(37,72,142));
                C.setBackground(new java.awt.Color(37,72,142));
                D.setBackground(new java.awt.Color(37,72,142));
            }
        }
        );
        
        //B button
        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input = "B";
                ngq.resultAns(input, round);
                answers.insertDataIntoUATable(round, input);      //Inserts the "B" input and the current round number into the UsersAnswersDB_Ebd database when the user presses this B button
                jTextField1.setText(input + " is " + ngq.resultAns(input, round));
                if(round < 15) {
                    System.out.println(ngq.getQuestion(round));
                    System.out.println("Round: " + (round+1) + " | Input: B | " + ngq.resultAns(input, round));
                    points(round);
                    if(!points(round)) {
                        bank.removeBank(round);
                        System.out.println(bank.ending(round, input));
                        A.setEnabled(false);
                        B.setEnabled(false);
                        C.setEnabled(false);
                        D.setEnabled(false);
                        System.exit(0);
                    }
                }
                else {
                    jTextField1.setText("");
                }
                if(round == 14) {
                    bank.removeBank(round);
                    System.out.println(bank.ending(round, input));
                }
                round++;
                jTextField2.setText(ngq.getQuestion(round));
                A.updateUI();
                A.setText(ngq.ansOptionsA(round));
                B.updateUI();
                B.setText(ngq.ansOptionsB(round));
                C.updateUI();
                C.setText(ngq.ansOptionsC(round));
                D.updateUI();
                D.setText(ngq.ansOptionsD(round));
                
                //reset button after 5050 lifeline
                A.setEnabled(true);
                B.setEnabled(true);
                C.setEnabled(true);
                D.setEnabled(true);
                
                //reset color after audience suggestion lifeline
                A.setBackground(new java.awt.Color(37,72,142));
                B.setBackground(new java.awt.Color(37,72,142));
                C.setBackground(new java.awt.Color(37,72,142));
                D.setBackground(new java.awt.Color(37,72,142));
            }
        }
        );
        
        //C button
        C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input = "C";
                ngq.resultAns(input, round);
                answers.insertDataIntoUATable(round, input);     //Inserts the "C" input and the current round number into the UsersAnswersDB_Ebd database when the user presses this C button
                jTextField1.setText(input + " is " + ngq.resultAns(input, round));
                if(round < 15) {
                    System.out.println(ngq.getQuestion(round));
                    System.out.println("Round: " + (round+1) + " | Input: C | " + ngq.resultAns(input, round));
                    points(round);
                    if(!points(round)) {
                        bank.removeBank(round);
                        System.out.println(bank.ending(round, input));
                        A.setEnabled(false);
                        B.setEnabled(false);
                        C.setEnabled(false);
                        D.setEnabled(false);
                        System.exit(0);
                    }
                }
                else {
                    jTextField1.setText("");
                }
                if(round == 14) {
                    bank.removeBank(round);
                    System.out.println(bank.ending(round, input));
                }
                round++;
                jTextField2.setText(ngq.getQuestion(round));
                A.updateUI();
                A.setText(ngq.ansOptionsA(round));
                B.updateUI();
                B.setText(ngq.ansOptionsB(round));
                C.updateUI();
                C.setText(ngq.ansOptionsC(round));
                D.updateUI();
                D.setText(ngq.ansOptionsD(round));
                
                //reset button after 5050 lifeline
                A.setEnabled(true);
                B.setEnabled(true);
                C.setEnabled(true);
                D.setEnabled(true);
                
                //reset color after audience suggestion lifeline
                A.setBackground(new java.awt.Color(37,72,142));
                B.setBackground(new java.awt.Color(37,72,142));
                C.setBackground(new java.awt.Color(37,72,142));
                D.setBackground(new java.awt.Color(37,72,142));
            }
        }
        );
        
        //D button
        D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input = "D";
                ngq.resultAns(input, round);
                answers.insertDataIntoUATable(round, input);       //Inserts the "D" input and the current round number into the UsersAnswersDB_Ebd database when the user presses this D button
                jTextField1.setText(input + " is " + ngq.resultAns(input, round));
                if(round < 15) {
                    System.out.println(ngq.getQuestion(round));
                    System.out.println("Round: " + (round+1) + " | Input: D | " + ngq.resultAns(input, round));
                    points(round);
                    if(!points(round)) {
                        bank.removeBank(round);
                        System.out.println(bank.ending(round, input));
                        A.setEnabled(false);
                        B.setEnabled(false);
                        C.setEnabled(false);
                        D.setEnabled(false);
                        System.exit(0);
                    }
                }
                else {
                    jTextField1.setText("");
                }
                if(round == 14) {
                    bank.removeBank(round);
                    System.out.println(bank.ending(round, input));
                }
                round++;
                jTextField2.setText(ngq.getQuestion(round));
                A.updateUI();
                A.setText(ngq.ansOptionsA(round));
                B.updateUI();
                B.setText(ngq.ansOptionsB(round));
                C.updateUI();
                C.setText(ngq.ansOptionsC(round));
                D.updateUI();
                D.setText(ngq.ansOptionsD(round));
                
                //reset button after 5050 lifeline
                A.setEnabled(true);
                B.setEnabled(true);
                C.setEnabled(true);
                D.setEnabled(true);
                
                //reset color after audience suggestion lifeline
                A.setBackground(new java.awt.Color(37,72,142));
                B.setBackground(new java.awt.Color(37,72,142));
                C.setBackground(new java.awt.Color(37,72,142));
                D.setBackground(new java.awt.Color(37,72,142));
            }
        }
        );
        
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(round == 0) {
                    A.setEnabled(false);
                    C.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 1) {
                    C.setEnabled(false);
                    D.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 2) {
                    B.setEnabled(false);
                    D.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 3) {
                    B.setEnabled(false);
                    D.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 4) {
                    B.setEnabled(false);
                    C.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 5) {
                    B.setEnabled(false);
                    D.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 6) {
                    B.setEnabled(false);
                    D.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 7) {
                    B.setEnabled(false);
                    D.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 8) {
                    A.setEnabled(false);
                    B.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 9) {
                    C.setEnabled(false);
                    B.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 10) {
                    B.setEnabled(false);
                    D.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 11) {
                    B.setEnabled(false);
                    D.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 12) {
                    B.setEnabled(false);
                    D.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 13) {
                    B.setEnabled(false);
                    D.setEnabled(false);
                    jButton6.setEnabled(false);
                }if(round == 14) {
                    B.setEnabled(false);
                    C.setEnabled(false);
                    jButton6.setEnabled(false);
                }
            }
        }
        );
        
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(round == 0) {
                    D.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 1) {
                    B.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 2) {
                    C.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 3) {
                    C.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 4) {
                    A.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 5) {
                    C.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 6) {
                    C.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 7) {
                    C.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 8) {
                    C.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 9) {
                    A.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 10) {
                    C.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 11) {
                    C.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 12) {
                    D.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 13) {
                    A.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }if(round == 14) {
                    A.setBackground(Color.red);
                    jButton5.setEnabled(false);
                }
            }
        }
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        A = new javax.swing.JButton();
        D = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jFrame1.setAlwaysOnTop(true);
        jFrame1.setLocation(new java.awt.Point(500, 500));
        jFrame1.setName("startFrame"); // NOI18N
        jFrame1.setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Welcome to - 'Who Wants to Be a Millionaire?'");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CONTROLS:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("- Questions will be at the top, click on the answer (a button) that you think is correct.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("- Once you have clicked on the answer the text at the bottom will tell you if you are correct or incorrect.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("- You also get 2 Lifelines, which are 2 buttons near the bottom left");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("- And if you want to exit the game early and take your money, you're free to do so by clicking the 'Exit' button.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Good Luck!");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("*Every 5 questions is a new tier and a guarentee of money, if you lose before tier 1 you win nothing.*");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Who Wants To Be a Millionaire");
        setBackground(new java.awt.Color(71, 71, 209));
        setLocation(new java.awt.Point(500, 250));
        setName("mainFrame"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 61, 122));
        jPanel1.setPreferredSize(new java.awt.Dimension(970, 500));

        jButton15.setBackground(new java.awt.Color(37, 72, 142));
        jButton15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Controls");
        jButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton7.setBackground(new java.awt.Color(37, 72, 142));
        jButton7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Exit");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        A.setBackground(new java.awt.Color(37, 72, 142));
        A.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setText("A: Le Mans 24 Hours");
        A.setActionCommand("A");
        A.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0), null, null));
        A.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A.setName("A"); // NOI18N
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        D.setBackground(new java.awt.Color(37, 72, 142));
        D.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setText("D: Isle of Man TT");
        D.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0), null, null));
        D.setName("D"); // NOI18N
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        B.setBackground(new java.awt.Color(37, 72, 142));
        B.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setText("B: Monaco Grand Prix");
        B.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0), null, null));
        B.setName("B"); // NOI18N
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(37, 72, 142));
        C.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setText("C: Indy 500");
        C.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0), null, null));
        C.setName("C"); // NOI18N
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(37, 72, 142));
        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Audience Lifeline");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton6.setBackground(new java.awt.Color(37, 72, 142));
        jButton6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("50-50 Lifeline");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Result:");

        jTextField1.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Points:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("0");
        jLabel12.setName("pointsLabel"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6))
                                .addGap(225, 225, 225)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(148, 148, 148))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MillionaireAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MillionaireAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MillionaireAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MillionaireAppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        UserAnswersDBManager ua = new UserAnswersDBManager(); 
        ua.createUATable();
        ua.clearAllDataInUATable();       //Deletes all of the existing data in the USER_ANSWERS table before recording the user's new data, for each time the game runs i.e. Resetting the recorded data.
                                    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controls().setVisible(true);
                new MillionaireAppMain().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
