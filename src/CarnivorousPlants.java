// Subclass to the class Plants
public class CarnivorousPlants extends Plants  {

    // A Carnivorous Plants needs 0.1 Liter of proteindrink each day.
    private final double dailyLiquidAmount = 0.1;
    // and need an extra 0.2 Liter proteindrink extra each day.
    private final double extraProtein = 0.2;

    public CarnivorousPlants(String name, double height, String liquid) {
        super(name, height, liquid);
    }

    // Interface methods that is inherited from the Super Class Plants
    @Override
    public double TotalAmountOfLiquid() {
        return dailyLiquidAmount + (extraProtein * getHeight());
    }
}
