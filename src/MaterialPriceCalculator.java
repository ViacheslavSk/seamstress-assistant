package src;

import java.util.Scanner;

public class MaterialPriceCalculator {
    private Material material;
    private double materialHeight;
    private double materialWidth;
    private double materialPrice;

    public double getMaterialHeight() {
        return materialHeight;
    }

    public void setMaterialHeight(int materialHeight) {
        this.materialHeight = materialHeight;
    }

    public double getMaterialWidth() {
        return materialWidth;
    }

    public void setMaterialWidth(int materialWidth) {
        this.materialWidth = materialWidth;
    }

    public MaterialPriceCalculator() {
        Scanner sc = new Scanner(System.in);
        material = new Material();
        System.out.println("Вкажіть довжину деталі на яку цікавить ціна:");
        setMaterialHeight(sc.nextInt());
        System.out.println("Вкажіть ширину деталі на яку цікавить ціна:");
        setMaterialWidth(sc.nextInt());
        setMaterialPrice();
    }

    public void setMaterialPrice() {
        materialPrice = (materialHeight * materialWidth * material.getPriceSquareMeter()) / 10000;
    }

    public double getMaterialPrice() {
        return materialPrice;
    }
}
