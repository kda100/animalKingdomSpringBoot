package com.example.animalKingdomSpringBoot;


abstract public class Animal {
    public static Gender genRandomGender() {
        if(Math.random() < 0.5) {
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }
    public static <T extends Animal> boolean canSexualBreed(T animal1, T animal2) {
        return animal1.getGender().equals(animal2.getGender()) && animal1.getClass() == animal2.getClass();
    }

    public static boolean canAsexualBreed(Animal animal) {
        return animal.getGender().equals(Gender.BOTH);
    }

    public String name;

    final public Gender gender;
    final public Boolean isWarmBlooded;

    private boolean isSleeping = false;
    private boolean isAlive = true;

    public Animal(String name, Gender gender, boolean isWarmBlooded) {
        super();
        this.name = name;
        this.gender = gender;
        this.isWarmBlooded = isWarmBlooded;
    }

    public Animal(Gender gender, boolean isWarmBlooded) {
        this("Anoy", gender, isWarmBlooded);
    }


    abstract public String eat();
    abstract public String breathe();
    abstract public <T extends Animal> Animal breed(T partner);
    final public String move() {
        return "The animal is moving";
    }

    final public String poop() {
        return "The animal is pooping";
    }

    final public void sleep() {
        isSleeping = true;
    }

    final public void wakeUp() {
        this.isSleeping = false;
    }

    final public void dies() {
        if(this.isAlive) {
            this.isAlive = false;
        }
    }

    final public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return this.gender;
    }

    public boolean getIsSleeping() {
        return this.isSleeping;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public Boolean getWarmBlooded() {
        return this.isWarmBlooded;
    }
}
