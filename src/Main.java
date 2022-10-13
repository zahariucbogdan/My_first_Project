public class Main {
    public static void main(String[] args) {
        printMyName();}


    public static void printMyName(){

        System.out.println("Hello");
        System.out.println("Bogdan");
        System.out.println("Hello \nBogdan");

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

// Scrieti o metoda java, care sa afiseze urmatorul model:

        System.out.println("       J       a      V       V     a    \n");
        System.out.println("       J     a   a     V     V    a   a  \n");
        System.out.println("J      J     aaaaa      V   V     aaaaa  \n");
        System.out.println("   JJ       a     a       V      a     a \n");

// Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.

        int a1 = 15;
        int b1 = 20;
        int c1 = 45;

        float e = avr(a1, b1, c1);
            System.out.println(e);

// Scrieti o metoda java, care sa afiseze urmatorul model:

        System.out.println("    +```````````+   \n");
        System.out.println("  [ |  o     o  | ] \n");
        System.out.println("    |     ^     |   \n");
        System.out.println("    |    '_'    |   \n");
        System.out.println("    +-----------+   \n");


// Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)
// sursa ``https://www.javatpoint.com/program-to-convert-fahrenheit-into-celsius``

        { float Fahrenheit, Celsius;
            Fahrenheit = 77;
            Celsius  = ((Fahrenheit-32)*5)/9;
            System.out.println("Temperature in celsius is: "+Celsius);
        }
//  Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii

        {

            double inch = 82;
            double meter = inch * 0.0254;
            System.out.println(inch + " inch is " + meter + " meters");
        }

// Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)
// Sursa ``https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-7.php``


        {
            float timeSeconds;
            float mps,kph, mph;
            int distance = 2000;
            float hour = 20;
            float minute = 20;
            float second = 20;
            // Calculate
            timeSeconds = (hour*3600) + (minute*60) + second;
            mps = distance / timeSeconds;
            kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
            mph = kph / 1.609f;
            // Show the data
            System.out.println("Your speed in meters/second is "+mps);
            System.out.println("Your speed in km/h is "+kph);
            System.out.println("Your speed in miles/h is "+mph);


        }


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


    public static float avr(float a1, float b1, float c1) {
        float result = (a1 + b1 + c1)/3;
        return result;
    }






}

