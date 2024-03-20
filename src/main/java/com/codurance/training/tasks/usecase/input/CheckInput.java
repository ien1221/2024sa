package com.codurance.training.tasks.usecase.input;

public class CheckInput implements Input {
    private final int _id;

    public CheckInput(int id){
        _id = id;
    }

    public int getId(){
        return _id;
    }
}
