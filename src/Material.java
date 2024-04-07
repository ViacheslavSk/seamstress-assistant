package src;

import java.util.Scanner;

public class Material {
    private String name;
    private String color;
    private int length;
    private int width;
    private int area;
    private int price;
    private int priceSquareMeter;

    public Material() {
        Scanner sc = new Scanner(System.in);
        setLength(100);
        System.out.println("Вкажіть ширину:");
        setWidth(sc.nextInt());
        System.out.println("Вкажіть ціну матеріалу за метр погонний:");
        setPrice(sc.nextInt());
        area = length * width;
        setPriceSquareMeter();
    }

    public void setPriceSquareMeter() {
        priceSquareMeter = (price * 10000) / area;
    }

    public double getPriceSquareMeter() {
        return priceSquareMeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
