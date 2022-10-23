package AnimalRescue;

public class AppMain {
    Dog Rocky = new Dog();

    {
        System.out.println("The dog name is: " + Rocky.name);
        System.out.println("The dog age is: " + Rocky.age + "years");
        System.out.println("The dog weight is: " + Rocky.weight + "kg");
        System.out.println("The dog size is: " + Rocky.size);
        System.out.println("The dog breed is: " + Rocky.breed);
        System.out.println("The dog color is: " + Rocky.color);
        System.out.println("The dog level of health is: " + Rocky.health_level);
        System.out.println("The dog level of hunger is: " + Rocky.hunger_level);
        System.out.println(" The dog mood level is: " + Rocky.mood_level);
        System.out.println("The dog favorite food is: " + Rocky.favorite_food);
        System.out.println("The dog favorite recreational activity is: " + Rocky.recreational_activity);
        Rocky.run();
        Rocky.eat();
        Rocky.speak();
        Rocky.sleep();
        Rocky.play();


    }

}