// Subclass to the class Plants and implements the Interface InterfaceForAmountOfLiquid
public class Cactus extends Plants {

    private double dailyLiquidAmount = 0.02;

    public Cactus(String name, double height, String liquid) {
        super(name, height, liquid);
    }

    // Interface
    @Override
    public double amountOfLiquid() {
        return dailyLiquidAmount;
    }
}