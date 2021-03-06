/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JUJU
 */
public class ConsulteCandidature extends javax.swing.JFrame {

    private Connecter cnx = new Connecter();
    private Espace_Entreprise e;
    
    private int index = 0;
    
    /**
     * Creates new form ConsulteCandidature
     */
    
    public ConsulteCandidature()
    {
        
    }
    
    public ConsulteCandidature(Espace_Entreprise e) {
        initComponents();
        
        this.e = e;
        affiche();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nom_et = new javax.swing.JLabel();
        prenom_et = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cv = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        libelle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        reponse = new javax.swing.JTextField();
        repondre = new javax.swing.JButton();
        precedent = new javax.swing.JButton();
        suivant = new javax.swing.JButton();
        fermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CANDIDATURES");

        jLabel2.setText("Nom");

        jLabel3.setText("Prenom");

        nom_et.setFont(new java.awt.Font("Ravie", 3, 12)); // NOI18N
        nom_et.setText("jLabel4");

        prenom_et.setFont(new java.awt.Font("Ravie", 3, 12)); // NOI18N
        prenom_et.setText("jLabel4");

        jLabel4.setText("CV");

        cv.setEditable(false);
        cv.setColumns(20);
        cv.setRows(5);
        jScrollPane1.setViewportView(cv);

        jLabel5.setText("Libellé");

        libelle.setEditable(false);

        jLabel6.setText("Réponse");

        repondre.setText("Répondre");
        repondre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repondreActionPerformed(evt);
            }
        });

        precedent.setText("Précedent");
        precedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precedentActionPerformed(evt);
            }
        });

        suivant.setText("Suivant");
        suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivantActionPerformed(evt);
            }
        });

        fermer.setText("Fermer");
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(prenom_et)
                                            .addComponent(nom_et)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(libelle, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(reponse, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(repondre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(precedent)
                                        .addGap(154, 154, 154)
                                        .addComponent(fermer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(suivant))
                                    .addComponent(jScrollPane1))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom_et))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(prenom_et))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(libelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(reponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repondre))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precedent)
                    .addComponent(suivant)
                    .addComponent(fermer))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
        this.e.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_fermerActionPerformed

    private void precedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precedentActionPerformed
        leprecedent();
    }//GEN-LAST:event_precedentActionPerformed

    private void suivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivantActionPerformed
        lesuivant();
    }//GEN-LAST:event_suivantActionPerformed

    private void repondreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repondreActionPerformed
        lareponse();
    }//GEN-LAST:event_repondreActionPerformed

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
            java.util.logging.Logger.getLogger(ConsulteCandidature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulteCandidature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulteCandidature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulteCandidature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulteCandidature().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cv;
    private javax.swing.JButton fermer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField libelle;
    private javax.swing.JLabel nom_et;
    private javax.swing.JButton precedent;
    private javax.swing.JLabel prenom_et;
    private javax.swing.JButton repondre;
    private javax.swing.JTextField reponse;
    private javax.swing.JButton suivant;
    // End of variables declaration//GEN-END:variables



       
    
    public List <CandidatureAconsulter> consultation()
    {
        
        Statement st,st2,st3;
        ResultSet rst,rst2,rst3;
        
        
        List <CandidatureAconsulter> listaconsulter = new ArrayList<>();
        
               
        try{
            st = cnx.ObtenirConnection().createStatement();
            st2 = cnx.ObtenirConnection().createStatement();
            st3 = cnx.ObtenirConnection().createStatement();
            
            rst = st.executeQuery("SELECT * FROM postule where nom= '"+this.e.getnom()+"' ");
            
            
            
            
            while(rst.next())
            {
                
                
                // On cherche les données dans la table entreprise 
                rst2 = st2.executeQuery("SELECT * FROM offre where id_of ='"+rst.getInt("id_of")+"' ");
                rst3 = st3.executeQuery("SELECT * FROM etudiant where user ='"+rst.getString("user")+"'  ");
                
                rst2.next();
                rst3.next();
                
                
                 listaconsulter.add(new CandidatureAconsulter(
                                                        this.e.getnom(),
                                                        rst3.getString("nom_et"),
                                                        rst3.getString("prenom_et"),
                                                        rst3.getString("cv"),
                                                        rst2.getString("libelle"),
                                                        rst.getString("reponse"),
                                                        rst.getInt("id_of"),
                                                        rst.getString("user")
                                                        ));
                
                
               
            }
        }
        catch (SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"Erreur base de donnees");
        }
        
        return listaconsulter;
        
    }
    
    public void affiche ()
    {
        
        if (consultation().size() == 0)
            JOptionPane.showMessageDialog(null,"Personne n'a encore postulé à vos offres");
        
        else
        {
            nom_et.setText(consultation().get(index).getNomet());
            prenom_et.setText(consultation().get(index).getPrenomet());
            cv.setText(consultation().get(index).getCv());
            libelle.setText(consultation().get(index).getLibelle());
            reponse.setText(consultation().get(index).getReponse());
            
        }
        
        
        
    }
    
    public void lesuivant()
    {
        index++;
        if (index > consultation().size() -1)
            index = 0;
        
        affiche();
    }
    
    public void leprecedent()
    {
        index--;
        if (index < 0)
            index = consultation().size() -1;
        
        affiche();
    }
    
    public void lareponse()
    {
        
        Statement st;
        ResultSet rst;
        
        
        try{
            st = cnx.ObtenirConnection().createStatement();
            String query = "UPDATE postule set reponse =  '"+reponse.getText()+"' where nom = '"+this.e.getnom()+"' and user = '"+consultation().get(index).getUser()+"' and id_of = '"+consultation().get(index).getIdof()+"' ";
            
            
                       st.executeUpdate(query);
            
            
            
            
            
        }
        catch (SQLException e){
            System.err.println(e);
        }
        
    }
    
}
