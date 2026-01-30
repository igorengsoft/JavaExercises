package shapes.entities;

import shapes.color.Color;
import java.lang.Math;

public final class Circle extends Shape {

    private Double radius;

    public Circle(Color color, Double radius) {

        super(color);
        this.radius = radius;
    }

    public Double getRadius() {

        return radius;
    }

    public void setRadius(Double radius) {

        this.radius = radius;
    }

    @Override
    public Double area() {

        return Math.PI * Math.pow(radius, 2);
    }
    
}
