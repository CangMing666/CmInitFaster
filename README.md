# CmInitFaster



有依赖关系的初始化异步框架，实现异步初始化



tips： 



使用依赖方法：

```java
implementation 'me.cangming:cminitfaster:0.1.0'
```



```JAVA
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
```