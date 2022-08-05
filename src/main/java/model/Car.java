package model;

public class Car {
    private Integer id;
    private String brandCar;
    private String model;

    public Car(Integer id, String brendCar, String model) {
        this.id = id;
        this.brandCar = brendCar;
        this.model = model;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrendCar(String brendCar) {
        this.brandCar = brendCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
