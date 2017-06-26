/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstage;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JUJU
 */
public class Connecter {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost/gestion_offres_stage";
    /*private Statement st;
    private ResultSet rst;*/
    
    private Connection con ;
    
    public Connecter ()
    {
        
        //Se connecter à la BD
        try{
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connecte !!");
        }
        catch (SQLException e){
            System.err.println(e);
        }
        
    }
    
    Connection ObtenirConnection ()
    {
        return con;
    }
    
    public static void AjouterEntreprise (String nom, String mdp, String adresse, int codepostal, String ville, String mail, String tel, String secteur)
    {
        Statement st;
        ResultSet rst;
        Connecter cnx = new Connecter();
        boolean bool = false;
        
        try{
            st = cnx.ObtenirConnection().createStatement();
            rst = st.executeQuery("SELECT * FROM entreprise");
            
            while(rst.next())
            {
                if (rst.getString("nom").equals(nom))
                    bool = true;
            }
            
            
            if (bool == true)
                    JOptionPane.showMessageDialog(null,"L'entreprise existe deja");
                else
                {
                    try{
                        String query = "INSERT INTO entreprise (nom, mdp, adresse, codepostal, ville, mail, tel, secteur) VALUES ('"+nom+"','"+mdp+"','"+adresse+"',"+codepostal+",'"+ville+"','"+mail+"','"+tel+"','"+secteur+"')";
            
            
                       st.executeUpdate(query);
                       JOptionPane.showMessageDialog(null,"Ajout effectue avec succes");
                       }
                   catch (SQLException e){
                        System.err.println(e);
                       }
                }
            
        }
        catch (SQLException e){
            System.err.println(e);
        }
    }
    
    
    public static void AjouterEtudiant (String nom_et, String prenom_et, String user, String pass, String cv)
    {
        Statement st;
        ResultSet rst;
        Connecter cnx = new Connecter();
        boolean bool = false;
        
        try{
            st = cnx.ObtenirConnection().createStatement();
            rst = st.executeQuery("SELECT * FROM etudiant");
            
            while(rst.next())
            {
                if (rst.getString("user").equals(user))
                    bool = true;
                
            }
            
            if (bool == true)
                    JOptionPane.showMessageDialog(null,"L'identifiant existe deja");
                else
                {
                    try{
                        String query = "INSERT INTO etudiant (nom_et, prenom_et, user, pass, cv) VALUES ('"+nom_et+"','"+prenom_et+"','"+user+"','"+pass+"','"+cv+"')";
            
            
                       st.executeUpdate(query);
                       JOptionPane.showMessageDialog(null,"Ajout effectue avec succes");
                       }
                   catch (SQLException e){
                        System.err.println(e);
                       }
                }
            
        }
        catch (SQLException e){
            System.err.println(e);
        }
    }
    
    
    public static void AjouterOffre (String nom, String domaine, String libelle, String descriptif, String date , int duree)
    {
        Statement st;
        ResultSet rst;
        Connecter cnx = new Connecter();
        
        try{
            String query = "INSERT INTO offre (nom, domaine, libelle, descriptif, datedebut, duree) VALUES ('"+nom+"','"+domaine+"','"+libelle+"','"+descriptif+"','"+date+"',"+duree+")";
            
            st = cnx.ObtenirConnection().createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Ajout effectue avec succes");
        }
        catch (SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"Erreur base de donnees");
        }
    }
    
    public void consultation()
    {
        Statement st;
        ResultSet rst,rst2;
        Connecter cnx = new Connecter();
        try{
            st = cnx.ObtenirConnection().createStatement();
            rst = st.executeQuery("SELECT * FROM offre");
            
            
            
            while(rst.next())
            {
                rst2 = st.executeQuery("SELECT * FROM offre where nom ='"+rst.getString("nom")+"' ");
                while (rst2.next())
                {
                    
                }
            }
        }
        catch (SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"Erreur base de donnees");
        }
    }
    
    
    
}
