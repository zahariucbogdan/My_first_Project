public class Calculator {
    public static void main(String[] args) {
        System.out.println(123 + 234);
        System.out.println(75 / 3);
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

// Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.

        int x = 21;
        int y = 7;

        float a = sum(x, y);
        System.out.println(a);

        float b = substract(x, y);
        System.out.println(b);

        float c = multiply(x, y);
        System.out.println(c);

        float d = divide(x, y);
        System.out.println(d);
        // Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.

        int a1 = 15;
        int b1 = 20;
        int c1 = 45;

        float e = avr(a1, b1, c1);
        System.out.println(e);


    }

    public static float sum(float first, float second) {
        return first + second;
    }

    public static float substract(float first, float second) {
        return first - second;
    }


    public static float multiply(float first, float second) {
        return first * second;
    }


    public static float divide(float first, float second) {
        return first / second;
    }


    public static float avr(float a1, float b1, float c1) {
        return (a1 + b1 + c1) / 3;
    }


}