/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author UNKNOWN'PC
 */
public class PilihGambarButtonFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButtonFullScreen() {
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

        buttonPanel = new javax.swing.JPanel();
        narutoBT = new javax.swing.JButton();
        sasukeBT = new javax.swing.JButton();
        bebanBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        narutoLB = new javax.swing.JLabel();
        sasukeLB = new javax.swing.JLabel();
        bebanLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Penampil Gambar Button FullScreen");

        narutoBT.setText("naruto");
        narutoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                narutoBTActionPerformed(evt);
            }
        });
        buttonPanel.add(narutoBT);

        sasukeBT.setText("sasuke");
        sasukeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sasukeBTActionPerformed(evt);
            }
        });
        buttonPanel.add(sasukeBT);

        bebanBT.setText("sakura");
        bebanBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebanBTActionPerformed(evt);
            }
        });
        buttonPanel.add(bebanBT);

        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        buttonPanel.add(exitBT);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setAlignmentX(1.0F);
        imagePanel.setAlignmentY(1.0F);
        imagePanel.setLayout(new java.awt.CardLayout());

        narutoLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        narutoLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/naruto.jpg"))); // NOI18N
        narutoLB.setToolTipText("null");
        narutoLB.setMinimumSize(new java.awt.Dimension(316, 400));
        narutoLB.setName("null"); // NOI18N
        narutoLB.setPreferredSize(new java.awt.Dimension(316, 400));
        narutoLB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imagePanel.add(narutoLB, "0");

        sasukeLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sasukeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/sasuke.jpg"))); // NOI18N
        sasukeLB.setMaximumSize(new java.awt.Dimension(316, 400));
        sasukeLB.setMinimumSize(new java.awt.Dimension(316, 400));
        sasukeLB.setName("null"); // NOI18N
        sasukeLB.setPreferredSize(new java.awt.Dimension(316, 400));
        imagePanel.add(sasukeLB, "1");

        bebanLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bebanLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/sakura.png"))); // NOI18N
        bebanLB.setToolTipText("null");
        bebanLB.setName("null"); // NOI18N
        imagePanel.add(bebanLB, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void narutoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narutoBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_narutoBTActionPerformed

    private void sasukeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sasukeBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_sasukeBTActionPerformed

    private void bebanBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebanBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_bebanBTActionPerformed

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PilihGambarButtonFullScreen FullFrame = new PilihGambarButtonFullScreen();
            
                GraphicsDevice device =
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(FullFrame);
                
                FullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bebanBT;
    private javax.swing.JLabel bebanLB;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton exitBT;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton narutoBT;
    private javax.swing.JLabel narutoLB;
    private javax.swing.JButton sasukeBT;
    private javax.swing.JLabel sasukeLB;
    // End of variables declaration//GEN-END:variables
}
