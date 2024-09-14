public class Dog {

    // instance variable
    String name;
    String breed;
    int age;
    String color;

    // Constructor Declaration of Class
    // constructor name same as the class

    public Dog(String name, String breed, int age, String Color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method 1

    public String getName() {
        return name;    // it returns name because we initlise string in arguments
    }

    public String getBreed(){
        return breed;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    @Override public String toString() {
        return("Hi My Dog Name is " + this.getName() + ".\n Breed, age and color are " + this.getBreed() + ", " + this.getAge() + ", " + this.getColor());
    }

    public static void main(String[] args) {
        Dog JOJO = new Dog("JOJO", "DESI BRAND", 5, "BHURA");
        System.out.println(JOJO.toString());
    }
    

    
    
}
