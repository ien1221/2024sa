package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import com.codurance.training.tasks.IO.Input;
import com.codurance.training.tasks.IO.Output;
import com.codurance.training.tasks.adapter.CommandPresenter;
import com.codurance.training.tasks.usecase.ICommand;
import com.codurance.training.tasks.adapter.CommandController;

public final class ToDoList implements Runnable {
    private static final String QUIT = "quit";

//    private final TaskList taskList = new TaskList();
    private final Output _output;
    private final Input _input;


    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        new ToDoList(in, out).run();
    }

    public ToDoList(BufferedReader reader, PrintWriter output) {
        _input = new Input(reader);
        _output = new Output(output);
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
        CommandController commandController = new CommandController();
        ICommand command = commandController.createCommand(commandLine);
        CommandPresenter presenter = new CommandPresenter(command.execute());
        if (presenter.hasResult()){
            _output.printResult(presenter.getResult());
        }
    }
}
