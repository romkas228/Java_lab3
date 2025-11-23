import java.util.Arrays;
import java.util.Comparator;


public class Lab3 {

    public static void main(String[] args) {
        SportsEquipment[] equipmentArray = {
            new SportsEquipment("Football Ball", "Nike", "Football", 1200.50, 450),
            new SportsEquipment("Tennis Racket", "Wilson", "Tennis", 4500.00, 300),
            new SportsEquipment("Dumbbell", "Rogue", "Fitness", 1200.50, 5000), 
            new SportsEquipment("Running Shoes", "Adidas", "Running", 3200.00, 600),
            new SportsEquipment("Yoga Mat", "Gaiam", "Yoga", 800.00, 900),
            new SportsEquipment("Football Ball", "Puma", "Football", 1200.50, 430) 
        };

        System.out.println("### Початковий масив:");
        printArray(equipmentArray);


        Arrays.sort(equipmentArray, Comparator
                .comparingDouble(SportsEquipment::getPrice) 
                .thenComparing(Comparator.comparingInt(SportsEquipment::getWeightInGrams).reversed()) // 2-й пріоритет: Вага (Descending)
        );

        System.out.println("\n### Відсортований масив (Ціна: зростання, Вага: спадання):");
        printArray(equipmentArray);

        SportsEquipment target = new SportsEquipment("Running Shoes", "Adidas", "Running", 3200.00, 600);
        System.out.println("\n### Пошук об'єкта: " + target);

        boolean found = false;
        for (SportsEquipment item : equipmentArray) {

            if (item.equals(target)) {
                System.out.println("✅ Об'єкт знайдено у масиві!");
                System.out.println("Знайдений об'єкт: " + item);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Об'єкт не знайдено.");
        }
    }

    private static void printArray(SportsEquipment[] array) {
        for (SportsEquipment item : array) {
            System.out.println(item);
        }
    }
}