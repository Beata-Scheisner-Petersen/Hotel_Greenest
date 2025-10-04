// Subclass to the class Plants and implements the Interface InterfaceForAmountOfLiquid
public class Palm extends Plants  {
    // A palm need each day 0.5 Liter tap water
    private final double dailyLiquidAmount = 0.5;

    public Palm(String name, double height, String liquid) {
        super(name, height, liquid);
    }

    // Interface methods that is inherited from the Super Class Plants
    @Override
    public double TotalAmountOfLiquid() {
        return dailyLiquidAmount * getHeight();
    }
}
