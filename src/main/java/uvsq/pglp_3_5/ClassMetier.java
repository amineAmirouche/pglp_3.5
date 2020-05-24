package uvsq.pglp_3_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassMetier {
  /**
   * methode qui fait un traitement metier et qui fait appel au module affichage.
   */
  public void methodeMetier() {
    LogPrint.affiche(LoggerFactory.getLogger(App.class),"Debut de methode metier");
    // Traitements Métier
    LogPrint.affiche(LoggerFactory.getLogger(App.class),"Fin de methode metier");
  }
}
