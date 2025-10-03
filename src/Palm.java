// Subclass to the class Plants and implements the Interface InterfaceForAmountOfLiquid
public class Palm extends Plants implements InterfaceForAmountOfLiquid {
    // In Liter
    private double dailyLiquidAmount = 0.5;

    public Palm(String name, double height, String liquid) {
        super(name, height, liquid);
    }

    @Override
    public double amountOfLiquid() {
        return dailyLiquidAmount * getHeight();
    }
}
