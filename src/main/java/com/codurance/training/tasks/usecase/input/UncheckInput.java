package com.codurance.training.tasks.usecase.input;

public class UncheckInput implements Input {
    private final int _id;

    public UncheckInput(int id){
        _id = id;
    }

    public int getId(){
        return _id;
    }
}
