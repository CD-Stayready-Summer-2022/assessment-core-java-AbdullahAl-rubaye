package com.codedifferently.assessment01.part02;

public abstract class Pet implements Animal {
    private String name;
    private Integer age;
    private String petOwner;

    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet(String name, Integer age,String petOwner) {
        this.name = name;
        this.age = age;
        this.petOwner=petOwner;
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.getName();
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        this.getAge();
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.getName();
        this.getAge();
    }

    public Pet() {

    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     *                    ensure this instance of `Pet` is added to the owner's composite `pets` list
     * @return
     */
    public String setOwner(PetOwner newPetOwner) {
        return this.petOwner=petOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return getOwner();
    }
}
