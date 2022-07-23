/*
 * DepotReel.java
 */

/**
 * D�p�t d'images (RealSubject)
 */
public class DepotReel implements IDepot {
  
  public Image get(String fichier) {
    Image image = new Image(fichier);
    image.charger();
    
    return image;
  }
  
}
