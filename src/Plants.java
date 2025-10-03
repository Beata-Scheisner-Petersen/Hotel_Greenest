public abstract class Plants implements InterfaceForAmountOfLiquid {
    String name;
    double height;
    String liquid;

    public Plants(String name, double height, String liquid) {
        this.name = name;
        this.height = height;
        this.liquid = liquid;
    }
}
