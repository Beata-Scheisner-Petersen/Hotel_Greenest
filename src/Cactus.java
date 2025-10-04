// Subclass to the class Plants
public class Cactus extends Plants {

    // A cactus needs 0.02 Liter of mineral water each day
    private final double dailyLiquidAmount = 0.02;

    public Cactus(String name, double height, String liquid) {
        super(name, height, liquid);
    }

    // Interface methods that is inherited from the Super Class Plants
    @Override
    public double TotalAmountOfLiquid() {
        return dailyLiquidAmount;
    }
}