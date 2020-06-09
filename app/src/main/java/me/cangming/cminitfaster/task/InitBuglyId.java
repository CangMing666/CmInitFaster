package me.cangming.cminitfaster.task;

import java.util.ArrayList;
import java.util.List;

import me.cangming.initfaster.task.Task;

public class InitBuglyId extends Task {

    @Override
    public void run() {

    }

    @Override
    public List<Class<? extends Task>> dependsOn() {
        List<Class<? extends Task>> taskClassList = new ArrayList<>();
        taskClassList.add(InitBugly.class);
        taskClassList.add(InitUserInfoTask.class);
        return taskClassList;
    }
}
