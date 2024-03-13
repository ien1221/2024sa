package com.codurance.training.tasks.IO;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {
    private final BufferedReader _input;
    public Input(BufferedReader input){
        _input = input;
    }

    public String readCommand(){
        try {
            return _input.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
