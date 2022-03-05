package com.simpllearn.basics;

public class User {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(Object age) {
        if (!(age instanceof Integer)) {
            throw new IllegalArgumentException("Age must be an integer");
        }
        this.age = (int) age;
    }
}
