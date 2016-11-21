package base;

import java.util.Map;

/**
 * Created by galax on 21/11/2016.
 */
public interface Batiment {
    int getNiveau();
    Map<TypeRessource, Integer> getPrerequis(int niveau);
    Map<TypeRessource, Integer> jouerTour();
    int niveauSuivant(Map<TypeRessource,Integer> ensRdispo);

}
