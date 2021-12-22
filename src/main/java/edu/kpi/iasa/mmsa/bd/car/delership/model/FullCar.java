package edu.kpi.iasa.mmsa.bd.car.delership.model;

public class FullCar {
    private Long Id;
    private String modelById;
    private String bodyById;
    private String userById;
    private Integer year;
    private Integer price;
    private String photo;
    private String engine;
    private String color;
    private String description;
    private Integer mileage;
    private String gearbox;

    FullCar() {}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getModelById() {
        return modelById;
    }

    public void setModelById(String modelById) {
        this.modelById = modelById;
    }

    public String getBodyById() {
        return bodyById;
    }

    public void setBodyById(String bodyById) {
        this.bodyById = bodyById;
    }

    public String getUserById() {
        return userById;
    }

    public void setUserById(String userById) {
        this.userById = userById;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }
}
