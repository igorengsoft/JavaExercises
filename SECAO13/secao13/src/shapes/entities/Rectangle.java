package shapes.entities;

import shapes.color.Color;

public final class Rectangle extends Shape {

    private Double length;
    private Double width;
    
    public Rectangle(Color color, Double length, Double width) {

        super(color);
        this.length = length;
        this.width = width;
    }

    public Double getLength() {

        return length;
    }

    public void setLength(Double length) {

        this.length = length;
    }

    public Double getWidth() {

        return width;
    }

    public void setWidth(Double width) {

        this.width = width;
    }

    @Override
    public Double area() {

        return length * width;
    }
}
