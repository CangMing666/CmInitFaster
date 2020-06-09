package me.cangming.cminitfaster.task;

import android.os.SystemClock;

import me.cangming.initfaster.task.Task;

public class InitFrescoTask extends Task {

    @Override
    public boolean needWait() {
        return super.needWait();
    }

    @Override
    public void run() {
        initFresco();
    }

    private void initFresco() {
        SystemClock.sleep(400);
    }
}
