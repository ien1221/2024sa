package com.codurance.training.tasks.IO;

import java.io.PrintWriter;

public class Output {
    private final PrintWriter _out;

    public Output(){
        _out = new PrintWriter(System.out);
    }

    public void printPrompt(){
        _out.print("> ");
        _out.flush();
    }

    public void printResult(String result){
        _out.print(result);
        _out.flush();
    }
}
