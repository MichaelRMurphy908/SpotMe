package com.example.sadboys.spotme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by filth on 5/12/2016.
 */
public class Person {


    //TODO: add interests

    private String firstName;
    private String lastName;
    private int age;
    private String cityLocation;
    private ArrayList<String> goals;
    private ArrayList<String> interests;


    public Person(){
        //empty constructor
    }

    public Person(String fN, String lN, int a){
        //make a sample Person using simple info and junk data
        firstName = fN;
        lastName = lN;
        age =a;
        cityLocation= "edison, nj";


        ArrayList<String> goals = genereateRandomGoals();


    }

    public ArrayList<String> genereateRandomGoals() {
        // String tempGoals[] = {"Cardio", "Health", "Body Building", "Weight Management", "Strength"};

        Random rand = new Random();

        int numGoals = rand.nextInt(5) + 1;

        ArrayList<String> goals = new ArrayList<String>();
        goals.add("Cardio");
        goals.add("Health");
        goals.add("Body Building");
        goals.add("Weight Management");
        goals.add("Strength");

        Collections.shuffle(goals);

        for (int i = 5; i > numGoals; i--) {

            goals.remove(i);

        }

        return goals;

    }

    public BufferedImage selectRandomImage(){
        String[] images = {"ur1", "url2", "url3", "url4", "url5"};

        return new BufferedImage()
    }









}
