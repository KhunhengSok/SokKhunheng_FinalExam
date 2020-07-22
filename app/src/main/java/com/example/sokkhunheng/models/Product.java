package com.example.sokkhunheng.models;

public class Product {
    public int id ;
    public String name ;
    public String code ;
    public String description ;
    public float price ;
    public String imageUrl ;
    public float totalRate ;
    public float averageRate ;
    public int totalView ;
    public int categoryId ;
    public String categoryName ;

    public Product() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTotalRate(float totalRate) {
        this.totalRate = totalRate;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }

    public void setTotalView(int totalView) {
        this.totalView = totalView;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public float getTotalRate() {
        return totalRate;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int getTotalView() {
        return totalView;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Product(int id, String name, String code, String description, float price, String imageUrl, float totalRate, float averageRate, int totalView, int categoryId, String categoryName) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.totalRate = totalRate;
        this.averageRate = averageRate;
        this.totalView = totalView;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
}
