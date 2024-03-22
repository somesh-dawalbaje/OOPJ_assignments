import java.util.Scanner;

class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber add(RationalNumber other) {
        int commonDenominator = this.denominator * other.denominator;
        int sumNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        return new RationalNumber(sumNumerator, commonDenominator).reduce();
    }

    public RationalNumber subtract(RationalNumber other) {
        int commonDenominator = this.denominator * other.denominator;
        int diffNumerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        return new RationalNumber(diffNumerator, commonDenominator).reduce();
    }

    public RationalNumber multiply(RationalNumber other) {
        int productNumerator = this.numerator * other.numerator;
        int productDenominator = this.denominator * other.denominator;
        return new RationalNumber(productNumerator, productDenominator).reduce();
    }

    public RationalNumber divide(RationalNumber other) {
        int dividendNumerator = this.numerator * other.denominator;
        int dividendDenominator = this.denominator * other.numerator;
        return new RationalNumber(dividendNumerator, dividendDenominator).reduce();
    }

    public RationalNumber reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        return new RationalNumber(this.numerator / gcd, this.denominator / gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first rational number:");
        System.out.print("Numerator: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Denominator: ");
        int den1 = scanner.nextInt();
        RationalNumber rational1 = new RationalNumber(num1, den1);

        System.out.println("Enter the second rational number:");
        System.out.print("Numerator: ");
        int num2 = scanner.nextInt();
        System.out.print("Denominator: ");
        int den2 = scanner.nextInt();
        RationalNumber rational2 = new RationalNumber(num2, den2);

        System.out.print("Enter the arithmetic operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        RationalNumber result;
        switch (operation) {
            case '+':
                result = rational1.add(rational2);
                break;
            case '-':
                result = rational1.subtract(rational2);
                break;
            case '*':
                result = rational1.multiply(rational2);
                break;
            case '/':
                result = rational1.divide(rational2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
    }
}
