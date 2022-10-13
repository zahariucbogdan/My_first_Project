public class Main {
    public static void main(String[] args) {


        System.out.println("Hello");
        System.out.println("Bogdan");
        System.out.println(123 + 234);
        System.out.println(75 / 3);
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);


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
}

    public static float sum(float first, float second) {
        float result = first + second;
        return result;
    }
    public static float substract(float first, float second){
        float result = first - second;
        return result;
    }


    public static float multiply(float first, float second){
        float result = first * second;
        return result;
    }


    public static float divide(float first, float second){
        float result = first / second;
        return result;
        }










}