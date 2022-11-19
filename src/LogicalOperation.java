public class LogicalOperation {

    // In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(), si sa primeasca doua int-uri ca si parametrii. Folosind if - else, verificati in interiorul metode care numar este mai mare, dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.
    public int checkBiggerNumber() {
        int number2 = 7;
        int number1 = 21;
        if (number1 < number2) {
            return number2;
        } else
            return number1;
    }


// Creati o metoda de tip String, care sa primeasca un parametru de tip String. Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”. Daca da, atunci metoda sa returneze “Learning text comparison”. Daca nu, atunci metoda sa returneze “Got to try some more”.

    public String checkText(String text) {

        if (text.equals("FastTrackIT")) {

            return "Learning text comparision.";

        } else {

            return "Got to try some more.";

        }

    }


//  Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int. Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String returnTextNumber(String text) {

        int number = 2;
        if (text.equals("FastTrackIT ") && number <= 3) {

            return text + number;

        } else if (!text.equals("FastTrackIT ") && number >= 4) {

            return number + text;

        } else {

            return "Neither conditions are true";

        }

    }
//    Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String orCondition(int number) {

        if (number > 8 || number == 6) {

            return "The amount of snow this winter was(cm): " + number;

        } else {

            return "The forecast snow is(cm): " + number;

        }

    }

//    Creati o metoda de tip String, care sa primeasca un parametru de tip numar. Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”. Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String greaterThanEqualTo(int number) {

        if (number > 3 && number != 4) {

            return "The number is greater than 3 and not equal to 4";

        } else if (number == 4) {

            return "The number is equal to 4";

        } else if (number < 3) ;
        {

            return "The number is lower than 3";

        }

    }

//    Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit. Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case. Apelati metoda in main() pentru a verifica daca functioneaza.

    public void printNumber(int number) {

        switch (number) {

            case 0:

                System.out.println("The number os 0");

                break;

            case 1:

                System.out.println("The number is 1");

                break;

            case 2:

                System.out.println("The number is 2");

                break;

            case 3:

                System.out.println("The number is 3");

                break;

            case 4:

                System.out.println("The number is 4");

                break;

            case 5:

                System.out.println("The number is 5");

                break;

            case 6:

                System.out.println("The number is 6");

                break;

            case 7:

                System.out.println("The number is 7");

                break;

            case 8:

                System.out.println("The number is 8");

                break;

            case 9:

                System.out.println("The number is 9");

                break;

            default:

                System.out.println("Not allowed");

        }

    }

//    Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false. Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isNumberEven(int number) {

        if (number % 2 == 0) {

            return true;

        } else {

            return false;

        }

    }

//    Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot. Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false. Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isEligibleToVote(int number) {

        if (number >= 18) {

            return true;

        } else {

            return false;

        }

    }


//  Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void countHundred(int a) {

        for (int i = a; i <= 100; i++) {

            System.out.println(i);

        }

    }

// Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void countMinusHundred(int a) {

        for (int i = a; i >= -100; i--) {

            System.out.println(i);

        }

    }

// Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
//
//            Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

                                                                                                                                                                                                                              public void countBetween(int a, int b) {

        for (int i = a; i <= b; i++) {

            System.out.println(i);

        }

        for (int i = a; i >= b; i--) {

            System.out.println(i);

        }

    }

// Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
//
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void countBetweenab(int a, int b) {

        if(a < b){

            for (int i = a; i <= b; i++) {

                System.out.println(i);

            }

        } else if(b < a){

            for (int i = b; i <= a; i++) {

                System.out.println(i);

            }

        }else{

            System.out.println("Numbers are equal");

        }

    }

// Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void displayEvenNumbers() {

        for(int i = 0; i<= 100;i++){

            if(i % 2 == 0){

                System.out.println(i);

            }

        }

    }

// Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void displayUnevenNumbers() {

        for(int i = 0; i<= 100;i++){

            if(i % 2 != 0){

                System.out.println(i);

            }

        }

    }

// Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public int returnSum(int a) {

        int sum = 0;

        for(int i = a; i<= 100;i++){

            sum += i;

        }

        return sum;

    }

// Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La final, metoda sa returneze media.

    public int returnAverage(int a) {

        int sum = 0;

        int counter = 0;

        for(int i = a; i<= 100;i++){

            sum += i;

            counter ++;

        }

        return sum/counter;

    }

// Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
//
//           *******
//
//            ******
//
//            *****
//
//            ****
//
//            ***
//
//            **
//
//            *
//    Cateva mentiuni:
//
//            - pentru a putea rezolva problema, trebuie folosite doua bucle for. O bucla se va construi in alta bucla.
//
//            - prima bucla for se va ocupa de afisarea pe orizontala, si cealalta pe verticala
//
//- semnul asterisk (*) se poate afisa sub forma de string

    public void printPattern() {

        for (int j = 7; j >= 1; j--) {

            String text = "";

            for (int i = j; i >= 1; i--) {

                text = text + "*";

            }

            System.out.println(text);

        }

    }

//  Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void countToHundredWhile(int givenNumber) {

        while (givenNumber <= 100) {

            System.out.println(givenNumber);

            givenNumber++;

        }

    }

//  Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void countBackwardsWhile(int givenNumber) {

        while (givenNumber >= -100) {

            System.out.println(givenNumber);

            givenNumber--;

        }

    }

//  Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y
//  Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void countBetweenWhile(int firstNumber, int secondNumber) {

        while (firstNumber <= secondNumber) {

            System.out.println(firstNumber);

            firstNumber++;

        }

    }

//  Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

//     Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void countBetweenfirstsecond(int firstNumber, int secondNumber) {

        if(firstNumber < secondNumber){

            while (firstNumber <= secondNumber) {

                System.out.println(firstNumber);

                firstNumber++;

            }

        }

        else if(secondNumber < firstNumber){

            while (secondNumber <= firstNumber) {

                System.out.println(firstNumber);

                firstNumber++;

            }

        }

        else{

            System.out.println("The numbers are equal");

        }

    }
//  Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void evenNumbersWhile() {

        int number = 1;

        while (number <= 100) {

            number++;

            if (number % 2 == 0) {

                System.out.println(number);

            }

        }

    }

//  Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void unevenNumbersWhile() {

        int number = 1;

        while (number <= 100) {

            number++;

            if (number % 2 != 0) {

                System.out.println(number);

            }

        }

    }

//  Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void sumAndAverageWhile() {

        int firstNumber = 111;

        int secondNumber = 8899;

        double sum = 0;

        int count = 0;


        while (firstNumber <= secondNumber) {

            sum += firstNumber;

            firstNumber++;

            count++;

        }

        System.out.println(sum);

        double average = sum / count;

        System.out.println("The average of the numbers is: " + average);

    }

//  Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public float divideBySevenWhile(int firstNumber, int lastNumber) {

        float count = 0F;

        float sum = 0F;

        while (firstNumber <= lastNumber) {

            if (firstNumber % 7 == 0) {

                count ++;

                sum += firstNumber;

            }

            firstNumber++;

        }

        float average = sum / count;

        return average;

    }


//  Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void fibonacci() {

        int count = 20;

        int num1 = 0;

        int num2 = 1;


        int i=1;

        while(i<=count)

        {

            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;

            num1 = num2;

            num2 = sumOfPrevTwo;

            i++;

        }

    }


//     Creati o metoda numita CozaLozaWoza.

//     Metoda va afisa:

//             - numerele de la 1 la 110

//             - 11 numere pe linie

// - se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)

//             - se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)

//             - se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)

//             - se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5

//             - se va afisa CozaWoza pentru multiplu de 3 SI 7

//             - se va afisa WozaLoza pentru multiplu de 5 SI 7

//             - se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7

//     Ar trebui sa arate similar:

//     1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11

//     Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22

//      23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza

    public void wozaCozaLoza() {

        int i = 1;

        while (i <= 110) {

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

                System.out.print("CozaLozaWoza ");

            } else if (i % 5 == 0 && i % 7 == 0) {

                System.out.print("WozaLoza ");

            } else if (i % 3 == 0 && i % 7 == 0) {

                System.out.print("CozaWoza ");

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("CozaLoza ");

            } else if (i % 7 == 0) {

                System.out.print("Woza ");

            } else if (i % 5 == 0) {

                System.out.print("Loza ");

            } else if (i % 3 == 0) {

                System.out.print("Coza ");

            } else {

                System.out.print(i + " ");

            }

            if (i % 11 == 0) {

                System.out.println();

            }

            i++;

        }

    }



}

