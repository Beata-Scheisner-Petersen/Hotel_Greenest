import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PlantHotelGreenest {
    // Plants name = new plant sort is Morphism and LiquidVarietties is Enum.
    private Plants Igge = new Cactus("Igge", 0.2, LiquidVarieties.MINERAL_WATER.liquid);
    private Plants Laura = new Palm("Laura", 5.0, LiquidVarieties.TAP_WATER.liquid);
    private Plants Meatloaf = new CarnivorousPlants("Meatloaf", 0.7, LiquidVarieties.PROTEIN_DRINK.liquid);
    private Plants Olof = new Palm("Olof", 1.0, LiquidVarieties.TAP_WATER.liquid);

    private List<Plants> customers = new ArrayList<>();

    public PlantHotelGreenest() {
        customers.add(Igge);
        customers.add(Laura);
        customers.add(Meatloaf);
        customers.add(Olof);
    }

    public void WateringFormula () {
        boolean waterMore = true;
        int tryAgain;

        while (waterMore) {
            boolean isValidInput = false;

            String plantToWater = JOptionPane.showInputDialog(null, "Which plant should get fluid?", "", JOptionPane.QUESTION_MESSAGE);
            for (Plants p : customers) {
                if (p.name.equals(plantToWater)){
                    JOptionPane.showMessageDialog(null, String.format("%s should get %.2f Liter of %s", p.name, p.amountOfLiquid(), p.liquid), "Important",
                            JOptionPane.INFORMATION_MESSAGE);
                    isValidInput = true;
                }
            }
            if (!isValidInput) {
                tryAgain = JOptionPane.showConfirmDialog(null, (String.format("Error: Could not find %s in the system!\n" +
                                "Do you want to try again?", plantToWater)), "Error",
                        JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            } else {
                tryAgain = JOptionPane.showConfirmDialog(null, "Do you want to water another plant?", "", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
            }

            if (tryAgain != 0) {
                waterMore = false;
                JOptionPane.showMessageDialog(null, "Terminating program", "quit", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
