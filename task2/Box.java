package lesson_3.task2;

import java.util.ArrayList;

    public  class Box {
    private ArrayList<Fruits> product = new ArrayList<>();

    public Box() {
        ArrayList<Fruits> product = new ArrayList<>();
        }

    public double getWeight() {
        double sumWeightProducts = 0.0f;
        for (Fruits e : product) {
        sumWeightProducts += e.getWeight();
        }
        return sumWeightProducts;
        }

    public ArrayList<Fruits> getProduct() {
        return product;
        }

    public void add(Fruits fruit) {
        if (product.size() > 1) {
        if (isProductsComparable(fruit)) {
        throw new BoxCustomException("Внимание! Смешивать товары запрещено, используйте другой товар или коробку!");
        }
        }
        product.add(0, fruit);
        }

    public boolean compare(Box other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.0001;
        }

    public void shiftSingleItem(Box box2) throws BoxCustomException {
        if (isProductsComparable(box2)) {
        throw new BoxCustomException("Внимание! Смешивать товары запрещено, используйте другой товар или коробку!");
        }
        for (int i = product.size() - 1; i >= 0; i--) {
        box2.getProduct().add(product.get(i));
        product.remove(i);
        }
    }

    public boolean isProductsComparable(Box otherBox) {
        return product.get(0).getClass() != otherBox.getProduct().get(0).getClass();
        }

    public boolean isProductsComparable(Fruits fruit) {
        return product.get(0).getClass() != fruit.getClass();
        }
    }
