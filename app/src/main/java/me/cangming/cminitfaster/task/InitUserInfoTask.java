package me.cangming.cminitfaster.task;

import android.os.SystemClock;

import me.cangming.initfaster.task.Task;

public class InitUserInfoTask extends Task {

    @Override
    public void run() {
        initUserinfo();
    }

    private void initUserinfo() {
        //200ms
        SystemClock.sleep(200);
    }
}
