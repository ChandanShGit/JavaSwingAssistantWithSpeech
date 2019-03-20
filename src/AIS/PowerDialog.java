/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AIS;


public class PowerDialog extends javax.swing.JDialog {
int time;
    
    public PowerDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        pl.setText(new PowerOption().messagepowerlabel(0));
        
    }
public int getTime(){
int check=setTimerbox.getSelectedIndex();
time=0;
if(check==1){
time=15;
}    
if(check==2)time=30;
if(check==3)time=60;
if(check==4)time=120;
return  (time*60);

}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        hibernatebtn = new javax.swing.JButton();
        poweroffbtn = new javax.swing.JButton();
        restartbtn = new javax.swing.JButton();
        pl = new javax.swing.JLabel();
        setTimerbox = new javax.swing.JComboBox<>();
        SetTimerL = new javax.swing.JLabel();
        LogOffbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("POWER MODE");
        setResizable(false);

        hibernatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hl.000.jpg.png"))); // NOI18N
        hibernatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hibernatebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hibernatebtnMouseExited(evt);
            }
        });
        hibernatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hibernatebtnActionPerformed(evt);
            }
        });

        poweroffbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pl.jpg.png"))); // NOI18N
        poweroffbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poweroffbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poweroffbtnMouseExited(evt);
            }
        });
        poweroffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poweroffbtnActionPerformed(evt);
            }
        });

        restartbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rl.jpg.png"))); // NOI18N
        restartbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restartbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restartbtnMouseExited(evt);
            }
        });
        restartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartbtnActionPerformed(evt);
            }
        });

        pl.setFont(new java.awt.Font("SimSun-ExtB", 1, 10)); // NOI18N
        pl.setForeground(new java.awt.Color(255, 255, 255));

        setTimerbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zero time", "15 Min", "30 Min", "1 H", "2 H" }));
        setTimerbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setTimerboxActionPerformed(evt);
            }
        });

        SetTimerL.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        SetTimerL.setForeground(new java.awt.Color(255, 255, 255));
        SetTimerL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SetTimerL.setText("  Set Timer");

        LogOffbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log.off.jpg.png"))); // NOI18N
        LogOffbtn.setText("Log-off");
        LogOffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOffbtnActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(hibernatebtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(poweroffbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(restartbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(pl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(setTimerbox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SetTimerL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LogOffbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pl, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(hibernatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(poweroffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(LogOffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(SetTimerL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(setTimerbox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(SetTimerL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(setTimerbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(poweroffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hibernatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(restartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hibernatebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hibernatebtnMouseEntered
       pl.setText(new PowerOption().messagepowerlabel(1));
    }//GEN-LAST:event_hibernatebtnMouseEntered

    private void hibernatebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hibernatebtnMouseExited
       pl.setText(new PowerOption().messagepowerlabel(0));
    }//GEN-LAST:event_hibernatebtnMouseExited

    private void hibernatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hibernatebtnActionPerformed
       
    }//GEN-LAST:event_hibernatebtnActionPerformed
 
    private void poweroffbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poweroffbtnMouseEntered
        pl.setText(new PowerOption().messagepowerlabel(2));
    }//GEN-LAST:event_poweroffbtnMouseEntered

    private void restartbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartbtnMouseEntered
        pl.setText(new PowerOption().messagepowerlabel(3));
    }//GEN-LAST:event_restartbtnMouseEntered

    private void poweroffbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poweroffbtnMouseExited
       hibernatebtnMouseExited(null);
    }//GEN-LAST:event_poweroffbtnMouseExited

    private void restartbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartbtnMouseExited
        hibernatebtnMouseExited(null);
    }//GEN-LAST:event_restartbtnMouseExited

    private void poweroffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poweroffbtnActionPerformed
        int t=getTime()/60; 
        String  St="You are About To signOut in " + t;
        St=St.concat(" minutes");
        new ReturnVoice(St);
        new PowerOption().option(1,getTime());
        
    }//GEN-LAST:event_poweroffbtnActionPerformed

    private void restartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartbtnActionPerformed
      new PowerOption().option(2,getTime());
      
    }//GEN-LAST:event_restartbtnActionPerformed

    private void setTimerboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTimerboxActionPerformed
        
    }//GEN-LAST:event_setTimerboxActionPerformed

    private void LogOffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOffbtnActionPerformed
        new PowerOption().option(4,getTime());
    }//GEN-LAST:event_LogOffbtnActionPerformed
   
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
            java.util.logging.Logger.getLogger(PowerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PowerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PowerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PowerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PowerDialog dialog = new PowerDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOffbtn;
    private javax.swing.JLabel SetTimerL;
    private javax.swing.JButton hibernatebtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel pl;
    private javax.swing.JButton poweroffbtn;
    private javax.swing.JButton restartbtn;
    private javax.swing.JComboBox<String> setTimerbox;
    // End of variables declaration//GEN-END:variables
}
