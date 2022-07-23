/*
 * DepotProxy.java
 */
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Dépôt virtuel (CacheProxy)
 */
public class DepotProxy implements IDepot {  
  private static final int MAX_CACHE = 3;
  
  // Least Recently Used Cache
  private Map<String, Image> images = new LinkedHashMap<String, Image>(MAX_CACHE+1, 1, true) {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean removeEldestEntry(@SuppressWarnings("rawtypes") Map.Entry eldest) {
      return size() > MAX_CACHE;
    }
  };
  
  public Image get(String fichier) {
    Image image = this.images.get(fichier);
    if (image == null) {
      image = new Image(fichier);
      image.charger();
      this.images.put(fichier, image);
    } else {
      System.out.println("*** Image prise en cache (" + fichier + ") ***");
    }
    
    return image;
  }
  
}
