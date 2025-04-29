package models;

import enums.DrugCondition;

public class Medicine {
    private String name;
    private String manufacturer;
    private String expiryDate;
    private DrugCondition condition;

    public Medicine(String name, String manufacturer, String expiryDate, DrugCondition condition) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public DrugCondition getCondition() {
        return condition;
    }
}