package com.codurance.training.tasks.usecase;

import com.codurance.training.tasks.entity.TaskList;
import com.codurance.training.tasks.usecase.out.IOutputDto;

public interface ICommand {
    IOutputDto execute();
}
