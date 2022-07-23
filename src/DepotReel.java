/*
 * DepotReel.java
 */

/**
 * Dépôt d'images (RealSubject)
 */
public class DepotReel implements IDepot {
  
  public Image get(String fichier) {
    Image image = new Image(fichier);
    image.charger();
    
    return image;
  }
  
}
