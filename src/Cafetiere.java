public class Cafetiere {

    // Constructeur vide
    public Cafetiere() {
    }

    // Remplit une tasse avec du café Moka
    public void remplirTasse(Tasse tasse) {
        tasse.cafe = new Cafe(TypeCafe.MOKA, (float) tasse.quantiteCafeMax) ;
    }

    // Remplit une tasse avec une quantité de café et un type de café donnés
    public void remplirTasse(Tasse tasse, TypeCafe type, double quantiteCafe) {
        tasse.cafe = new Cafe(type, (float) quantiteCafe) ;
    }





}
