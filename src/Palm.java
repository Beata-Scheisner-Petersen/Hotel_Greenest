// Subclass to the class Plants.
public class Palm extends Plants implements InterfaceForAmountOfLiquid {
    // In Liter
    double dailyLiquidAmount = 0.5;
    public Palm(String name, double height, String liquid) {
        super(name, height, liquid);
    }

    @Override
    public double amountOfLiquid() {
        return dailyLiquidAmount * height;
    }
}
