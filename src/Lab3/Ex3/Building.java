package Lab3.Ex3;

import java.time.Year;

public class Building {
    private int storeysNumber;
    private int yearBuilt;
    private String name;

    public Building(){}

    public void createBuilding(int storeysNumber, int yearBuilt, String name){
        this.storeysNumber = storeysNumber;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    public int yearsPassed(){
        return Year.now().getValue() - this.yearBuilt;
    }

    public String buildingInfo(){
        return "Building:" + "\n" +
                "Name: '" + name + '\'' + "\n" +
                "Number of storeys: " + storeysNumber + "\n" +
                "Year built: " + yearBuilt
                ;
    }
}
