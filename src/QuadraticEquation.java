import java.util.Scanner;
public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        double delta = b * 2 - 4 * a * c;
        return delta;
    }
    public double getRoot1(){
        double r1 = (-b + Math.sqrt((Math.pow(b,2) - 4 * a * c ))) / (2 * a);
        return r1;
    }
    public double getRoot2(){
        double r2 = (-b - Math.sqrt((Math.pow(b,2) - 4 * a * c ))) / (2 * a);
        return r2;
    }
}

class Execute{
    public static void main(String[] args) {
        System.out.println("Quadratic Equation");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a");
        double inputA = scanner.nextDouble();

        System.out.println("Insert b");
        double inputB = scanner.nextDouble();

        System.out.println("Insert c");
        double inputC = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(inputA,inputB,inputC);
        double outputDelta = equation.getDiscriminant();
        if (outputDelta > 0 )
            System.out.println("The equation has two roots " + equation.getRoot1() + " and " + equation.getRoot2());
        else if (outputDelta == 0)
            System.out.println("The equation has one root " + equation.getRoot1());
        else
            System.out.println("The equation has no roots");
    }
}
