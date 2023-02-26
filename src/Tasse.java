public class Tasse {
    public double quantiteCafeMax;
     Cafe cafe;
    private double quantite;

    public Tasse() {
        this.quantite = 100.0;
    }

    public Tasse(double quantiteCafeMax) {
        this.quantiteCafeMax = quantiteCafeMax;
        this.quantite = 100.0;
    }

    public double boire(double but) {
        double quantiteRestante = this.quantite - but;
        if (quantiteRestante < 0) {
            this.quantite = 0;
            return 0.0;
        } else {
            this.quantite = quantiteRestante;
            return quantiteRestante;
        }
    }

    public void boire() {
        this.quantite = 0;
    }
}
