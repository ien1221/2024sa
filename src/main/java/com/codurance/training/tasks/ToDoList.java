package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import com.codurance.training.tasks.IO.ConsoleInput;
import com.codurance.training.tasks.IO.ConsoleOutput;
import com.codurance.training.tasks.adapter.controller.Controller;
import com.codurance.training.tasks.adapter.presenter.CommandPresenter;
import com.codurance.training.tasks.adapter.ControllerFactory;

public final class ToDoList implements Runnable {
    private static final String QUIT = "quit";

//    private final TaskList taskList = new TaskList();
    private final ConsoleOutput _output;
    private final ConsoleInput _input;


    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        new ToDoList(in, out).run();
    }

    public ToDoList(BufferedReader reader, PrintWriter output) {
        _input = new ConsoleInput(reader);
        _output = new ConsoleOutput(output);
    }

    public void run() {
        while (true) {
            _output.printPrompt();
            String command = _input.readCommand();
            if (command.equals(QUIT)) {
                break;
            }
            execute(command);
        }
    }

    private void execute(String commandLine) {
        ControllerFactory controllerFactory = new ControllerFactory();
        Controller controller = controllerFactory.createController(commandLine);
        CommandPresenter presenter = new CommandPresenter(controller.execute());
        if (presenter.hasResult()){
            _output.printResult(presenter.getResult());
        }
    }
}
