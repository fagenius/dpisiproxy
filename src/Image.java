/*
 * Image.java
 */

/**
 * Image
 */
public class Image {
  private String fichier;
  
  public Image(String fichier) {
    this.fichier = fichier;
  }
  
  public String getFichier() {
    return this.fichier;
  }
  
  public void afficher() {
    System.out.println("Affichage (" + this.fichier + ")");
  }
  
  public void charger() {
    System.out.println(">>> Chargement (" + this.fichier + ") <<<");
  }
  
}
