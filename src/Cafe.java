public class Cafe {
     TypeCafe typeCafe;
    float quantiteLiquideMl;

    public Cafe() {
        this.typeCafe = TypeCafe.MOKA;
        this.quantiteLiquideMl = 100;
    }

    public Cafe(TypeCafe typeCafe, float quantiteLiquideMl) {
        this.typeCafe = typeCafe;
        this.quantiteLiquideMl = quantiteLiquideMl;
    }
}
