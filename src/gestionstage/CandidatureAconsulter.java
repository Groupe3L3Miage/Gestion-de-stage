/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstage;

/**
 *
 * @author JUJU
 */
public class CandidatureAconsulter {
    String nom;
    String nom_et;
    String prenom_et;
    String cv;
    String libelle;
    String reponse;
    int id_of;
    String user;
    
    public CandidatureAconsulter()
    {
        
    }
    
    public CandidatureAconsulter(String nom, String nom_et, String prenom_et, String cv, String libelle, String reponse, int id_of, String user)
    {
        this.nom = nom;
        this.nom_et = nom_et;
        this.prenom_et = prenom_et;
        this.cv = cv;
        this.libelle = libelle;
        this.reponse = reponse;
        this.id_of = id_of;
        this.user = user;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public String getNomet()
    {
        return this.nom_et;
    }
    
    public String getPrenomet()
    {
        return this.prenom_et;
    }
    
    public String getCv()
    {
        return this.cv;
    }
    
    public String getLibelle()
    {
        return this.libelle;
    }
    
    public String getReponse()
    {
        return this.reponse;
    }
    
    public int getIdof()
    {
        return this.id_of;
    }
    
    public String getUser()
    {
        return this.user;
    }
    
    public void setNom (String nom)
    {
        this.nom = nom;
    }
    
    public void setNomet (String nom_et)
    {
        this.nom_et = nom_et;
    }
    
    public void setPrenomet (String prenom_et)
    {
        this.prenom_et = prenom_et;
    }
    
    public void setCv (String cv)
    {
        this.cv = cv;
    }
    
    public void setLibelle (String libelle)
    {
        this.libelle = libelle;
    }
    
    public void setReponse (String reponse)
    {
        this.reponse = reponse;
    }
    
    public void setIdof (int id_of)
    {
        this.id_of = id_of;
    }
    
    public void setUser (String user)
    {
        this.user = user;
    }
    
}
