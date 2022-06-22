/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assignment2;

/**
 *
 * @author ethan
 */
public class EndPoints extends javax.swing.JFrame {
    int bank;
    int round;
    
    public EndPoints() {
        initComponents();
        exitPoints(round);
        endPoints(round);
        round = 0;
        bank = 0;
    }
    
    public int getBank(){
        return bank;
    }
    
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
    
    public int removeBank(int round){
        if(round == 1 || round == 2 || round == 3 || round == 4){
            bank = 0;
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(bank));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
            return bank;
        }
        if(round == 5 || round == 6 || round == 7 || round == 8 || round == 9){
            bank = 1000;
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(bank));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
            return bank;
        }
        if(round == 10 || round == 11 || round == 12 || round == 13 || round == 14){
            bank = 32000;
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(bank));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
            return bank;
        }
        if(round == 15){
            bank = 1000000;
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(bank));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
            return bank;
        }
        return bank;
    }
    
    public void exitPoints(int round) {
        if(round == 0) {
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 1) {
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 2) {
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 3) {
             jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 4) {
           jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 5) {
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 6) {
             jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 7) {
             jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 8) {
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 9) {
             jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 10) {
             jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 11) {
             jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 12) {
             jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 13) {
             jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }if(round == 14) {
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(getBank()));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }
    }
    
    public void endPoints(int round) {
        if(round == 1 || round == 2 || round == 3 || round == 4){
            bank = 0;
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(bank));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }
        if(round == 5 || round == 6 || round == 7 || round == 8 || round == 9){
            bank = 1000;
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(bank));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }
        if(round == 10 || round == 11 || round == 12 || round == 13 || round == 14){
            bank = 32000;
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(bank));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }
        if(round == 15){
            bank = 1000000;
            jLabel3.setText(String.valueOf(round));
            jLabel3.paintImmediately(jLabel3.getVisibleRect());
            jLabel7.setText(String.valueOf(bank));
            jLabel7.paintImmediately(jLabel7.getVisibleRect());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(500, 420));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(37, 72, 142));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 200));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Who Wants to Be a Millionaire");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Congratulations, you made it to round:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        jLabel3.paintImmediately(jLabel3.getVisibleRect());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("You made: $");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel7");
        jLabel7.paintImmediately(jLabel7.getVisibleRect());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(0, 63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EndPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EndPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EndPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EndPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndPoints().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
