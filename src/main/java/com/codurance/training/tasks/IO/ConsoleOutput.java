package com.codurance.training.tasks.IO;

import java.io.PrintWriter;

public class ConsoleOutput {
    private final PrintWriter _out;

    public ConsoleOutput(PrintWriter out){
        _out = out;
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
