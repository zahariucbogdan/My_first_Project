package AnimalRescue;

public class AppMain {
    public static void main(String[] args){
    Dog Rocky = new Dog();
    Rocky.setName("Rocky");
    Rocky.setAge(2);
    Rocky.setBreed("Bichon");
    Rocky.setWeight(7.6);
    Rocky.setGender("Male");
    Rocky.setSize("Small");
    Rocky.setColor("White");
    Rocky.setHealth_level(8);
    Rocky.setFavorite_food("Royal Canin");
    Rocky.setRecreational_activity("walk in the Park");

    Recreational_Activity Recreational_Activity = new Recreational_Activity();
    Recreational_Activity.setName("Walk in the park");

    Doctor Catalina = new Doctor();
    Catalina.setName("Catalina");
    Catalina.setSpecialization("Veterinary doctor");

    Food Food = new Food();
    Food.setFood_name("Royal Canin");
    Food.setPrice(90);
    Food.setQuantity(60);
    Food.setAvailability(120);

    Girl Girl = new Girl();
    Girl.setName("Diana");
    Girl.setAvailable_money(300);




        System.out.println("The dog name is: " + Rocky.getName());
        System.out.println("The dog age is: " + Rocky.getAge() + " years");
        System.out.println("The dog weight is: " + Rocky.getWeight() + " kg");
        System.out.println("The dog size is: " + Rocky.getSize());
        System.out.println("The dog breed is: " + Rocky.getBreed());
        System.out.println("The dog gender is: " + Rocky.getGender());
        System.out.println("The dog color is: " + Rocky.getColor());
        System.out.println("The dog level of health is: " + Rocky.getHealth_level());
        System.out.println("The dog favorite food is: " + Rocky.getFavorite_food());
        System.out.println("The dog favorite recreational activity is: " + Rocky.getRecreational_activity());

        System.out.println("The dog food name is: " + Food.getFood_name());
        System.out.println("The dog food price is: " + Food.getPrice());
        System.out.println("The dog food quantity is: " + Food.getQuantity());
        System.out.println("The dog food availability is: " + Food.getAvailability());

        System.out.println("The dog recreational activity is: " + Recreational_Activity.getName());

        System.out.println("The girl name is: " + Girl.getName());
        System.out.println("The girl availabile money is: " + Girl.getAvailable_money());

        System.out.println("The Doctor name is: " + Catalina.getName());
        System.out.println("The Doctor specialization is: " + Catalina.getSpecialization());



    }

}