package models;

import exceptions.InvalidPalletException;
import java.util.List;

public class Pallet {
    private String palletId;
    private List<Medicine> medicines;
    private boolean isProcessed;

    public Pallet(String palletId, List<Medicine> medicines) throws InvalidPalletException {
        if (medicines == null || medicines.isEmpty()) {
            throw new InvalidPalletException("Pallet must contain at least one medicine.");
        }
        this.palletId = palletId;
        this.medicines = medicines;
        this.isProcessed = false;
    }

    public void markAsProcessed() {
        this.isProcessed = true;
        System.out.println("Pallet with ID " + palletId + " has been processed.");
    }

    public void printSummary() {
        System.out.println("Pallet ID: " + palletId);
        for (Medicine medicine : medicines) {
            System.out.println("Medicine: " + medicine.getName() + ", Manufacturer: " + medicine.getManufacturer() + ", Expiry: " + medicine.getExpiryDate());
        }
    }
}