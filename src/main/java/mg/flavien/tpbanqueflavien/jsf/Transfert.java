/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.flavien.tpbanqueflavien.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import mg.flavien.tpbanqueflavien.entities.CompteBancaire;
import mg.flavien.tpbanqueflavien.service.GestionnaireCompte;

/**
 *
 * @author flavi
 */
@Named(value = "transfert")
@RequestScoped
public class Transfert {

    @Inject
    private GestionnaireCompte bean;
    private Long idSource;
    private Long idDestination;
    private int montant;

    public Long getIdSource() {
        return idSource;
    }

    public void setIdSource(Long idSource) {
        this.idSource = idSource;
    }

    public Long getIdDestination() {
        return idDestination;
    }

    public void setIdDestination(Long idDestination) {
        this.idDestination = idDestination;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
    
    
    
    public Transfert() {
    }
    
    public String valider() {
        boolean erreur = false;
        CompteBancaire source=bean.findById(idSource);
        CompteBancaire destinataire=bean.findById(idDestination);
        String lien="listeComptes?faces-redirect=true";
        if(erreur){
            return null;
        }
        bean.transferer(source, destinataire, montant);
        return lien;
    }
    
    
}
