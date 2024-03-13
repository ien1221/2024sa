package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import com.codurance.training.tasks.IO.Output;
import com.codurance.training.tasks.command.ICommand;
import com.codurance.training.tasks.command.factory.CommandFactory;
import com.codurance.training.tasks.taskList.TaskList;

public final class ToDoList implements Runnable {
    private static final String QUIT = "quit";

    private final TaskList taskList = new TaskList();
    private final BufferedReader in;
    private final PrintWriter _output;
//    private final Output _output;


    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
//        Output out = new Output();
        new ToDoList(in, out).run();
    }

    public ToDoList(BufferedReader reader, PrintWriter output) {
        this.in = reader;
        _output = output;
    }

    public void run() {
        while (true) {
            _output.print("> ");
            _output.flush();
//            _output.printPrompt();
            String command;
            try {
                command = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (command.equals(QUIT)) {
                break;
            }
            execute(command);
        }
    }

    private void execute(String commandLine) {
        CommandFactory commandFactory = new CommandFactory();
        ICommand command = commandFactory.createCommand(commandLine);
        String result =  command.execute(taskList);
        if (!result.isEmpty()){
            _output.print(result);
            _output.flush();
//            _output.printResult(result);
        }
    }
}
