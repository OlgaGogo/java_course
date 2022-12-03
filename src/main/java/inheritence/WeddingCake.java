package inheritence;

public class WeddingCake extends Cake {
    public int tiers;

    public WeddingCake(){
        super("cherry");
    }

    public int getTiers(){
        return tiers;
    }

    public void setTiers(int tiers){
        this.tiers = tiers;
    }
}
