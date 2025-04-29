package models;

import enums.DeliveryPriority;
import exceptions.InvalidPalletException;
import util.InventoryUtils;
import java.util.List;

public class ExpressPallet extends Pallet {
    private DeliveryPriority priority;

    public ExpressPallet(String palletId, List<Medicine> medicines, DeliveryPriority priority) throws InvalidPalletException {
        super(palletId, medicines);
        if (medicines == null || medicines.isEmpty()) {
            throw new InvalidPalletException("Express Pallet must contain at least one medicine.");
        }
        this.priority = priority;
    }

    @Override
    public void markAsProcessed() {
        super.markAsProcessed();
        InventoryUtils.log("Express Pallet with priority " + priority + " has been processed.");
    }

    public DeliveryPriority getPriority() {
        return priority;
    }
}