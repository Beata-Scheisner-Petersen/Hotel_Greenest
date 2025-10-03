// Subclass to the class Plants.
public class CarnivorousPlants extends Plants implements InterfaceForAmountOfLiquid {
    // In Liter
    double dailyLiquidAmount = 0.1;
    double extraProtein = 0.2;

    public CarnivorousPlants(String name, double height, String liquid) {
        super(name, height, liquid);
    }

    @Override
    public double amountOfLiquid() {
        return dailyLiquidAmount + (extraProtein * height);
    }
}
