import java.util.*;



public class QuadEq
{
    
 
    public static void main(String[] args)
    {
        // declaration and initialization of variables 
        double a, b, c, root1, root2, sqrtDiscr;
        Scanner scanner;
        scanner = new Scanner(System.in);

        // input a, b, and c 
        System.out.print("Enter a: "); 
        a = scanner.nextDouble(); 
        System.out.print("Enter b: "); 
        b = scanner.nextDouble();
        System.out.print("Enter c: ");
        c = scanner.nextDouble();

        // compute the two roots
        sqrtDiscr = Math.sqrt(Math.pow(b, 2) - 4*a*c);
        root1 = (-b + sqrtDiscr) / (2*a);
        root2 = (-b - sqrtDiscr) / (2*a);

        // output two roots
        System.out.println();
        System.out.println("Two roots of the equation, " + a + "*x*x + " + b + "*x + " + c + " = 0, are");

        System.out.printf("%.2f and %.2f.", root1, root2);

    }
}



