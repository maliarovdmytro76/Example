package Animals;

public class Cat {

    // public, protected, private, (default)
    private String breed;

    private int age;

    private String color;

    public Cat() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;


    }
}