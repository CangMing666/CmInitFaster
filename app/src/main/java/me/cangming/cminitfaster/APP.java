package me.cangming.cminitfaster;

import android.app.Application;
import android.content.Context;

import me.cangming.cminitfaster.task.InitBugly;
import me.cangming.cminitfaster.task.InitBuglyId;
import me.cangming.cminitfaster.task.InitFrescoTask;
import me.cangming.cminitfaster.task.InitUserInfoTask;
import me.cangming.initfaster.TaskDispatcher;

public class APP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化
        TaskDispatcher.init(this);
        TaskDispatcher dispatcher = TaskDispatcher.createInstance();
        dispatcher.addTask(new InitUserInfoTask())
                .addTask(new InitFrescoTask())
                .addTask(new InitBuglyId())
                .addTask(new InitBugly())
                .start();
        // Task 等待
        dispatcher.await();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

    }
}
