package AnimalRescue;

public class AppMain {
    public static void main(String[] args){
    Dog Rocky = new Dog();
    Rocky.setname("Rocky");
    Rocky.setage(2);
    Rocky.setbreed("Bichon");
    Rocky.setweight(2);
    Rocky.setgender("Male");
    Rocky.setsize("Small");
    Rocky.setcolor("White");
    Rocky.sethealth_level("8");


        System.out.println("The dog name is: " + Rocky.getname());
        System.out.println("The dog age is: " + Rocky.getage() + " years");
        System.out.println("The dog weight is: " + Rocky.getweight() + " kg");
        System.out.println("The dog size is: " + Rocky.getsize());
        System.out.println("The dog breed is: " + Rocky.getbreed());
        System.out.println("The dog gender is: " + Rocky.getgender());
        System.out.println("The dog color is: " + Rocky.getcolor());
        System.out.println("The dog level of health is: " + Rocky.gethealth_level());
        System.out.println("The dog favorite recreational activity is: " + Rocky.getRecreational_activity);
        Rocky.getRun();
        Rocky.getEat();
        Rocky.getSpeak();
        Rocky.getSleep();
        Rocky.getPlay();


    }

}