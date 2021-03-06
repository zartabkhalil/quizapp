/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizsystem;

/**
 *
 * @author zakisardar
 */
public class ChooseSubject extends javax.swing.JFrame {

    /**
     * Creates new form ChooseSubject
     */
    public ChooseSubject() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Btn_Return = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        loading = new javax.swing.JLabel();
        Select_TRW = new javax.swing.JCheckBox();
        Select_CCN = new javax.swing.JCheckBox();
        Select_PF = new javax.swing.JCheckBox();
        bndjhsj = new javax.swing.JCheckBox();
        Btn_Attempt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        Btn_Return.setBackground(new java.awt.Color(102, 0, 0));
        Btn_Return.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Return.setText("Back");
        Btn_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReturnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(98, 0, 238));

        loading.setBackground(new java.awt.Color(98, 0, 238));
        loading.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Available Quiz");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        buttonGroup1.add(Select_TRW);
        Select_TRW.setText("Techinical Report Writing");
        Select_TRW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_TRWActionPerformed(evt);
            }
        });

        buttonGroup1.add(Select_CCN);
        Select_CCN.setText("Computer Networks");
        Select_CCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_CCNActionPerformed(evt);
            }
        });

        buttonGroup1.add(Select_PF);
        Select_PF.setText("Programming Fundamental");
        Select_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_PFActionPerformed(evt);
            }
        });

        buttonGroup1.add(bndjhsj);
        bndjhsj.setText("Operating System");
        bndjhsj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bndjhsjActionPerformed(evt);
            }
        });

        Btn_Attempt.setBackground(new java.awt.Color(0, 51, 0));
        Btn_Attempt.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Attempt.setText("Attempt");
        Btn_Attempt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AttemptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Select_CCN)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Attempt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Btn_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Select_TRW)
                    .addComponent(Select_PF)
                    .addComponent(bndjhsj))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Select_TRW)
                .addGap(18, 18, 18)
                .addComponent(Select_CCN)
                .addGap(18, 18, 18)
                .addComponent(Select_PF)
                .addGap(21, 21, 21)
                .addComponent(bndjhsj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Return)
                    .addComponent(Btn_Attempt))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReturnActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new loginLayout2().toFront();
        new loginLayout2().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_Btn_ReturnActionPerformed

    private void Select_TRWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_TRWActionPerformed
        availablequiz = "Techinical Report Writing" ; 
    }//GEN-LAST:event_Select_TRWActionPerformed

    private void Select_CCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_CCNActionPerformed
         availablequiz = "Computer Networks" ;
    }//GEN-LAST:event_Select_CCNActionPerformed

    private void Select_PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_PFActionPerformed
         availablequiz = "Programming Fundamentals" ;
    }//GEN-LAST:event_Select_PFActionPerformed

    private void bndjhsjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bndjhsjActionPerformed
         availablequiz = "Operating System" ;
    }//GEN-LAST:event_bndjhsjActionPerformed

    private void Btn_AttemptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AttemptActionPerformed
        new QuestionLayout2 ().setVisible(true);
        
    }//GEN-LAST:event_Btn_AttemptActionPerformed

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
            java.util.logging.Logger.getLogger(ChooseSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseSubject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Attempt;
    private javax.swing.JButton Btn_Return;
    private javax.swing.JCheckBox Select_CCN;
    private javax.swing.JCheckBox Select_PF;
    private javax.swing.JCheckBox Select_TRW;
    private javax.swing.JCheckBox bndjhsj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loading;
    // End of variables declaration//GEN-END:variables

    private String availablequiz;
}
