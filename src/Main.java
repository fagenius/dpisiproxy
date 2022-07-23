/*
 * Main.java
 */
public class Main {
  
  public static void main(String[] args) {
    IDepot depot = new DepotProxy();
    
    // Initialisation de l'exemple
    Image i;
    i = depot.get("Image1.jpg");    
    i = depot.get("Image2.jpg");    
    i = depot.get("Image3.jpg");    
    i = depot.get("Image4.jpg");    
    i = depot.get("Image5.jpg");    
    System.out.println("------------------------------");
    
    i = depot.get("Image3.jpg"); 
    i.afficher();
    i = depot.get("Image9.jpg");
    i.afficher();
    i = depot.get("Image9.jpg");
    i.afficher();
    i = depot.get("Image1.jpg");  // N'est plus en cache
    i.afficher();
  }
  
}
