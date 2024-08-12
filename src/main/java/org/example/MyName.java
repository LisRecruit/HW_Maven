package org.example;


import com.google.gson.Gson;

public class MyName {
    public static void main(String[] args) {

        Student student = new Student("Ihor","Lisovskiy");
        Gson gson = new Gson();
        System.out.println(gson.toJson(student));

    }
}