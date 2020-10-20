package cn.gz3create.designpatterns.example.singleton;

/**
 * Created by Sampson on 2020/10/20.
 * DesignPatterns
 * 双重锁DCL单例，
 */
public class SingletonDCL {
    private static SingletonDCL instance;

    private SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if (instance == null) {//这里不嫁锁,避免每次都上锁消耗资源
            synchronized (SingletonDCL.class) {//第一次创建的时候上锁避免多线程问题
                instance = new SingletonDCL();
            }
        }
        return instance;
    }
}
