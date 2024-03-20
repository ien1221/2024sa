package com.codurance.training.tasks.usecase.command;

import com.codurance.training.tasks.usecase.input.Input;
import com.codurance.training.tasks.usecase.out.Output;

public interface Command<In extends Input> {
    Output execute(In input);
}
