package AnimalRescue;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private int weight;
    private String gender;
    private String size;
    private String color ;
    private String health_level;

    String favorite_food = "Royal Canin";
    String recreational_activity = "Park walk";


    public void setname(String name){
        this.name = name;
    }
    public String getname() {
        return name;
    }
    public void setage(int age){
        this.age = age;
    }
    public int getage() {
        return age;
    }
    public void setbreed(String breed){
        this.breed = breed;
    }
    public String getbreed() {
        return breed;
    }

    public void setweight(int weight){
        this.weight = weight;
    }
    public int getweight() {
        return weight;
    }

    public void setgender(String gender){
        this.gender = gender;
    }
    public String getgender() {
        return gender;
    }
    public void setsize(String size){
        this.size = size;
    }
    public String getsize() {
        return size;
    }
    public void setcolor(String color){
        this.color = color;
    }
    public String getcolor() {
        return color;
    }

    public void sethealth_level(String health_level){
        this.health_level = health_level;
    }
    public int gethealth_level() {
        return health_level;
    }

    public void eat(){
        System.out.println("Eating food...");
    }
    public void sleep(){
        System.out.println("Snorrinnnggg  zzzzz....zzzz...");
    }
    public void run(){
        System.out.println("running... fast");
    }
    public void speak(){
        System.out.println("Woof woof woof !!!...");
    }
    public void play(){
        System.out.println("yeeaaaayyy let¨s play !!!...");
    }
}
