public enum LiquidVarieties {
    TAP_WATER("tap water"),
    PROTEIN_DRINK("protein drink"),
    MINERAL_WATER("mineral water");

    private final String liquid;

    LiquidVarieties(String liquid) {
        this.liquid = liquid;
    }

    public String getLiquid() {
        return liquid;
    }
}
