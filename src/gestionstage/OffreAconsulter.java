/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstage;

/**
 *
 * @author JUJU
 */
public class OffreAconsulter {
    
    int id;
    String nom;
    String ville;
    String mail;
    String domaine;
    String libelle;
    String datedebut;
    int duree;
    String descriptif;
    
    public OffreAconsulter()
    {
        
    }
    
    public OffreAconsulter(int id, String nom, String ville, String mail, String domaine, String libelle, String datedebut, int duree, String descriptif)
    {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.mail = mail;
        this.domaine = domaine;
        this.libelle = libelle;
        this.datedebut = datedebut;
        this.duree = duree;
        this.descriptif = descriptif;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public String getVille()
    {
        return this.ville;
    }
    
    public String getMail()
    {
        return this.mail;
    }
    
    public String getDomaine()
    {
        return this.domaine;
    }
    
    public String getLibelle()
    {
        return this.libelle;
    }
    
    public String getDatedebut()
    {
        return this.datedebut;
    }
    
    public int getDuree()
    {
        return this.duree;
    }
    
    public String getDescriptif()
    {
        return this.descriptif;
    }
    
    public void setId (int id)
    {
        this.id = id;
    }
    
    public void setNom (String nom)
    {
        this.nom = nom;
    }
    
    public void setVille (String ville)
    {
        this.ville = ville;
    }
    
    public void setMail (String mail)
    {
        this.mail = mail;
    }
    
    public void setDomaine (String domaine)
    {
        this.domaine = domaine;
    }
    
    public void setLibelle (String libelle)
    {
        this.libelle = libelle;
    }
    
    public void setDatedebut (String datedebut)
    {
        this.datedebut = datedebut;
    }
    
    public void setDuree (int duree)
    {
        this.duree = duree;
    }
    
    public void setDescriptif (String descriptif)
    {
        this.descriptif = descriptif;
    }
    
}
