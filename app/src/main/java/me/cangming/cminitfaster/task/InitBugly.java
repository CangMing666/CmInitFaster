package me.cangming.cminitfaster.task;

import android.os.SystemClock;

import me.cangming.initfaster.task.Task;

public class InitBugly extends Task {

    @Override
    public void run() {
        initBugly();
    }

    private void initBugly() {
        SystemClock.sleep(80);
    }
}
