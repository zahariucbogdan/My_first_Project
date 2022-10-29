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


    }

}