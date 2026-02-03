package shapes.application;

import shapes.entities.Shape;
import shapes.entities.Rectangle;
import shapes.entities.Circle;
import shapes.color.Color;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static String errorMessage = "Você digitou algo inválido!";
    public static void main (String args[]) {

        calcShapes();
    }    

    public static void calcShapes() {

        Integer quantity;
        List<Shape> Shapes = new ArrayList<Shape>();

        try {

            System.out.print("Quantas formas serão? ");
            quantity = sc.nextInt();

            for(Integer count = 1; count <= quantity; count++) {

                
                Character shape;

                System.out.print("Escolha retângulo (r) ou círculo (c): ");
                shape = sc.next().charAt(0);

                if (shape == 'r') {

                    Color color;
                    Double length;
                    Double width;

                    System.out.print("Digite a cor: ");
                    color = Color.valueOf(sc.next().toUpperCase());

                    System.out.print("Digite o comprimento: ");
                    width = sc.nextDouble();

                    System.out.print("Digite a largura: ");
                    length = sc.nextDouble();

                    Shape rectangle = new Rectangle(color, length, width);
                    Shapes.add(rectangle);
                }

                else if (shape == 'c') {

                    Color color;
                    Double radius;

                    System.out.print("Digite a cor: ");
                    color = Color.valueOf(sc.next().toUpperCase());

                    System.out.print("Digite o raio: ");
                    radius = sc.nextDouble();

                    Shape circle = new Circle(color, radius);
                    Shapes.add(circle);
                }
            }
            sc.close();

            for(Shape item : Shapes) {

                if (item instanceof Rectangle) {

                    System.out.println("RETÂNGULO:");
                    System.out.println(item.getColor());
                    System.out.println(item.area());
                    System.out.println("");
                }

                else {

                    System.out.println("CÍRCULO:");
                    System.out.println(item.getColor());
                    System.out.println(item.area());
                    System.out.println("");
                }            
            }

        }

        catch(Exception e) {

            sc.nextLine();
            System.out.println(errorMessage);
            calcShapes();

            
        }
    }
}   
