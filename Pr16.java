import java.util.*;

public class Pr16 {
    public static void main(String[] args) {
        float r1, r2, i1, i2; 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter real and imaginary numbers (space separated): ");
        r1 = sc.nextFloat();
        i1 = sc.nextFloat();
        
        System.out.print("Enter other real and imaginary numbers (space separated): ");
        r2 = sc.nextFloat();
        i2 = sc.nextFloat();
        
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        Complex difference = c1.subtract(c2);
        System.out.print("Difference: ");
        difference.display();

        Complex product = c1.multiply(c2);
        System.out.print("Product: ");
        product.display();
        
        sc.close();
    }

    static class Complex {
        private float real;
        private float imag;

        public Complex(float real, float imag) {
            this.real = real;
            this.imag = imag;
        }

        public Complex add(Complex other) {
            float newReal = this.real + other.real;
            float newImag = this.imag + other.imag;
            return new Complex(newReal, newImag);
        }

        public Complex subtract(Complex other) {
            float newReal = this.real - other.real;
            float newImag = this.imag - other.imag;
            return new Complex(newReal, newImag);
        }

        public Complex multiply(Complex other) {
            float newReal = this.real * other.real - this.imag * other.imag;
            float newImag = this.real * other.imag + this.imag * other.real;
            return new Complex(newReal, newImag);
        }

        public void display() {
            if (imag >= 0) {
                System.out.println(real + " + " + imag + "i");
            } else {
                System.out.println(real + " - " + (-imag) + "i");
            }
        }
    }
}
