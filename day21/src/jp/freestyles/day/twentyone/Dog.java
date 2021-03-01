package jp.freestyles.day.twentyone;

public class Dog {

    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void introduce() {
        System.out.format(
            "%s の %s は %d 歳です %n",
            this.breed, this.name, this.age);
    }
}
