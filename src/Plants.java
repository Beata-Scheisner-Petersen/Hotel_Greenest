// Superclass to the classes: Cactus, Palm and CarnivorousPlants
public abstract class Plants implements InterfaceForAmountOfLiquid {

     //I use encapsulation by set the accessor to my instance variable to private and use getters  to be able to read the variable.

    // In Liter
    private String name;
    private double height;
    private String liquid;

    public Plants(String name, double height, String liquid) {
        this.name = name;
        this.height = height;
        this.liquid = liquid;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getLiquid() {
        return liquid;
    }
}
