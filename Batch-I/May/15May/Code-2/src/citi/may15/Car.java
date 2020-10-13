package citi.may15;

public class Car implements Comparable<Car> {
    String BrandName;
    String ModelName;
    String Type;
    int YearModel;
    int TopSpeed;

    public Car(String brandName,String modelName, String type, int yearModel, int topSpeed ){

        this.BrandName = brandName;
        this.ModelName = modelName;
        this.Type = type;
        this.YearModel = yearModel;
        this.TopSpeed = topSpeed;
    }

    public Car()
    {
    }

    @Override
    public int compareTo(Car c12) {
        return this.ModelName.compareTo(c12.ModelName);
    }
}
