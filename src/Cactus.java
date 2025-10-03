public class Cactus extends Plants implements  InterfaceForAmountOfLiquid{
    // In Liter
    double dailyLiquidAmount = 0.02;

    public Cactus(String name, double height, String liquid) {
        super(name, height, liquid);
    }

    @Override
    public double amountOfLiquid() {
        return dailyLiquidAmount;
    }
}
