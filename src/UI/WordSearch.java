/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Reese
 */
public class WordSearch extends javax.swing.JFrame
{

    /**
     * Creates new form WordSearch
     */
    public WordSearch()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblQuery = new javax.swing.JLabel();
        txtBoxQuery = new javax.swing.JTextField();
        pnlSearchOptions = new javax.swing.JPanel();
        rdBtnBeginsWith = new javax.swing.JRadioButton();
        rdBtnContains = new javax.swing.JRadioButton();
        rdBtnEndsWith = new javax.swing.JRadioButton();
        rdBtnExact = new javax.swing.JRadioButton();
        pnlCaseSens = new javax.swing.JPanel();
        chkBoxCaseSens = new javax.swing.JCheckBox();
        pnlLimitation = new javax.swing.JPanel();
        cmbBoxLimitation = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstResult = new javax.swing.JList();
        lblCount = new javax.swing.JLabel();
        lblCountAmount = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WordSearch");

        lblQuery.setText("Query:");

        txtBoxQuery.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtBoxQueryActionPerformed(evt);
            }
        });

        pnlSearchOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search Type"));

        buttonGroup1.add(rdBtnBeginsWith);
        rdBtnBeginsWith.setText("Begins With");

        buttonGroup1.add(rdBtnContains);
        rdBtnContains.setText("Contains");

        buttonGroup1.add(rdBtnEndsWith);
        rdBtnEndsWith.setText("Ends With");

        buttonGroup1.add(rdBtnExact);
        rdBtnExact.setText("Exact");

        javax.swing.GroupLayout pnlSearchOptionsLayout = new javax.swing.GroupLayout(pnlSearchOptions);
        pnlSearchOptions.setLayout(pnlSearchOptionsLayout);
        pnlSearchOptionsLayout.setHorizontalGroup(
            pnlSearchOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdBtnBeginsWith)
                    .addComponent(rdBtnContains)
                    .addComponent(rdBtnEndsWith)
                    .addComponent(rdBtnExact))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSearchOptionsLayout.setVerticalGroup(
            pnlSearchOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdBtnBeginsWith)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtnContains)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtnEndsWith)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtnExact)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCaseSens.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Style"));

        chkBoxCaseSens.setText("Case Sensitive");

        javax.swing.GroupLayout pnlCaseSensLayout = new javax.swing.GroupLayout(pnlCaseSens);
        pnlCaseSens.setLayout(pnlCaseSensLayout);
        pnlCaseSensLayout.setHorizontalGroup(
            pnlCaseSensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaseSensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkBoxCaseSens)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCaseSensLayout.setVerticalGroup(
            pnlCaseSensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chkBoxCaseSens)
        );

        pnlLimitation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Limitation"));

        cmbBoxLimitation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "10", "20", "50", "100" }));

        javax.swing.GroupLayout pnlLimitationLayout = new javax.swing.GroupLayout(pnlLimitation);
        pnlLimitation.setLayout(pnlLimitationLayout);
        pnlLimitationLayout.setHorizontalGroup(
            pnlLimitationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLimitationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbBoxLimitation, 0, 122, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLimitationLayout.setVerticalGroup(
            pnlLimitationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLimitationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbBoxLimitation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(lstResult);

        lblCount.setText("Count:");

        btnClose.setText("Close");

        btnSearch.setText("Search");

        btnClear.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblCountAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBoxQuery)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCount)
                                .addGap(0, 150, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSearchOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCaseSens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlLimitation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuery)
                    .addComponent(txtBoxQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlSearchOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCaseSens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlLimitation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose)
                    .addComponent(lblCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblCountAmount)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBoxQueryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtBoxQueryActionPerformed
    {//GEN-HEADEREND:event_txtBoxQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBoxQueryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(WordSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(WordSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(WordSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(WordSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }

        catch(Exception e)
        {
            // Use Default
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new WordSearch().setVisible(true);
            }
            
            public void search()
            {
            }
            
            
            
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkBoxCaseSens;
    private javax.swing.JComboBox cmbBoxLimitation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblCountAmount;
    private javax.swing.JLabel lblQuery;
    private javax.swing.JList lstResult;
    private javax.swing.JPanel pnlCaseSens;
    private javax.swing.JPanel pnlLimitation;
    private javax.swing.JPanel pnlSearchOptions;
    private javax.swing.JRadioButton rdBtnBeginsWith;
    private javax.swing.JRadioButton rdBtnContains;
    private javax.swing.JRadioButton rdBtnEndsWith;
    private javax.swing.JRadioButton rdBtnExact;
    private javax.swing.JTextField txtBoxQuery;
    // End of variables declaration//GEN-END:variables
}
