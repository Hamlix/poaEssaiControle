package base;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Created by galax on 21/11/2016.
 */
public abstract class AbstractBatiment implements Batiment{
    private int niveau;
    public AbstractBatiment() {
        niveau=0;
    }

    @Override
    public int getNiveau() {
        return niveau;
    }

    @Override
    public int niveauSuivant(Map<TypeRessource, Integer> ressourceDispo) {
        Map<TypeRessource, Integer> ressourceBesoin = getPrerequis(this.niveau);
        // d'abord on obtient la liste des clés de la MAP
        Set listKeys= ressourceBesoin.keySet();
        Iterator iterateur = listKeys.iterator();
        //parcourir les clés et afficher les entrées de chaque clef
        while(iterateur.hasNext()){
            Object key= iterateur.next();
            if(ressourceBesoin.get(key)>ressourceDispo.get(key))
                break;
//PROBLEME : PARCOURIR TOUTES LES RESSOURCES NECESSAIRE AU BATIMENTS TESTER SI DISPO SUFFISANT
        }

        niveau++;
        return niveau;
    }


}
