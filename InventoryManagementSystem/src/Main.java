import enums.DeliveryPriority;
import enums.DrugCondition;
import exceptions.InvalidPalletException;
import models.ExpressPallet;
import models.Medicine;
import models.Pallet;
import models.Task;
import util.InventoryUtils;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Medicine med1 = new Medicine("Paracetamol", "PharmaCorp", "2025-08-01", DrugCondition.EXCELLENT);
            Medicine med2 = new Medicine("Ibuprofen", "HealthPlus", "2024-10-15", DrugCondition.GOOD);
            List<Medicine> medicines = Arrays.asList(med1, med2);

            Pallet pallet = new Pallet("PALLET-001", medicines);
            pallet.printSummary();
            pallet.markAsProcessed();

            Task task = new Task("TASK-001", "Check temperature of storage unit", "John", true);
            System.out.println(task);
            task.markAsComplete();

            InventoryUtils.log("Standard inventory processed successfully.");

            // Express pallet with exception handling
            try {
                ExpressPallet expressPallet = new ExpressPallet("EXPRESS-001", medicines, DeliveryPriority.HIGH);
                expressPallet.printSummary();
                expressPallet.markAsProcessed();
            } catch (InvalidPalletException e) {
                InventoryUtils.log("Failed to create express pallet: " + e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}