package com.myhexaville.androidarchitectureexample;

public class User {
    private String name, id, image;
    private int age;

    public User() {
    }

    public User(String name, String image, int age) {
        this.name = name;
        this.image = image;
        this.age = age;
    }

    public User(String name, String id, String image, int age) {
        this.name = name;
        this.id = id;
        this.image = image;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
