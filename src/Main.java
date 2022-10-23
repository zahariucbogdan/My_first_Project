public class Main {
    public static void main(String[] args) {
        printMyName();
    }


    public static void printMyName() {

        System.out.println("Hello");
        System.out.println("Bogdan");
        System.out.println("Hello \nBogdan");


// Scrieti o metoda java, care sa afiseze urmatorul model:

        System.out.println("       J       a      V       V     a    \n");
        System.out.println("       J     a   a     V     V    a   a  \n");
        System.out.println("J      J     aaaaa      V   V     aaaaa  \n");
        System.out.println("   JJ       a     a       V      a     a \n");


// Scrieti o metoda java, care sa afiseze urmatorul model:

        System.out.println("    +```````````+   \n");
        System.out.println("  [ |  o     o  | ] \n");
        System.out.println("    |     ^     |   \n");
        System.out.println("    |    '_'    |   \n");
        System.out.println("    +-----------+   \n");


// Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)
// sursa ``https://www.javatpoint.com/program-to-convert-fahrenheit-into-celsius``

        {
            float Fahrenheit, Celsius;
            Fahrenheit = 77;
            Celsius = ((Fahrenheit - 32) * 5) / 9;
            System.out.println("Temperature in celsius is: " + Celsius);
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
            float mps, kph, mph;
            float distance = 2000;
            float hour = 20;
            float minute = 20;
            float second = 20;
            // Calculate
            timeSeconds = (hour * 3600) + (minute * 60) + second;
            mps = distance / timeSeconds;
            kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
            mph = kph / 1.609f;
            // Show the data
            System.out.println("Your speed in meters/second is " + mps);
            System.out.println("Your speed in km/h is " + kph);
            System.out.println("Your speed in miles/h is " + mph);


        }


    }


    public static class main {
        public static void main(String[] args) {
            //if the text input is "FastTrack", print: "Learning comparison", if not, print :"Got to try more"
            LogicalOperation op = new LogicalOperation();
            String textInput = "FastTrack";
            System.out.println(op.textComp(textInput));


            // compare 2 numbers, get the greater number
            int first = 5;
            int second = 7;
            System.out.println(op.getGreaterNumber(first, second));


            //Given a text input and a number input,if the text is equal to "FastTrack" AND the number is
            //equal to or lower than 5, print the number and the text, in this order. If the text is not "FastTrack"
            //AND the number is equal to or higher than 7, print the number&text in this order.

            String textInput2 = "FastTrack";
            int numberInput = 5;

            System.out.println(op.textAndNumberComparison(textInput2, numberInput));




        }


    }
}







