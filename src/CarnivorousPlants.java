// Subclass to the class Plants and implements the Interface InterfaceForAmountOfLiquid
public class CarnivorousPlants extends Plants implements InterfaceForAmountOfLiquid {
    // In Liter
    private double dailyLiquidAmount = 0.1;
    private double extraProtein = 0.2;

    public CarnivorousPlants(String name, double height, String liquid) {
        super(name, height, liquid);
    }

    @Override
    public double amountOfLiquid() {
        return dailyLiquidAmount + (extraProtein * getHeight());
    }
}
