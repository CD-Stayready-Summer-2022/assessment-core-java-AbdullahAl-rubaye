package com.codedifferently.assessment01.part02;

public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog() {



    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        super();
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        super("dog",11, "abdul");

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return null;
    }
}
