/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.flavien.tpbanqueflavien.jsf;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import mg.flavien.tpbanqueflavien.entities.CompteBancaire;
import mg.flavien.tpbanqueflavien.service.GestionnaireCompte;

/**
 *
 * @author flavi
 */
@Named(value = "listeComptes")
@ViewScoped
public class ListeComptes implements Serializable {

    @Inject
    private GestionnaireCompte bean;
    private List<CompteBancaire> compteList;

    public ListeComptes() {
    }

    public List<CompteBancaire> getAllComptes() {
        if (compteList == null) {
            compteList = bean.getAllComptes();
        }
        return compteList;
    }
}
