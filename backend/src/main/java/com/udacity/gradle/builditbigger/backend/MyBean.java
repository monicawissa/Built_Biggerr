package com.udacity.gradle.builditbigger.backend;

import com.example.jokeslib.MyClass_jokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        myData = new MyClass_jokes().getJoke();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}