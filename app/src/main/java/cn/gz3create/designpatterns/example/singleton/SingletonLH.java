package cn.gz3create.designpatterns.example.singleton;

/**
 * Created by Sampson on 2020/10/20.
 * DesignPatterns
 * 单例饿汉模式，第一次调用getInstance时初始化，注意使用synchronized同步锁，防止多线程时可能创建出多个实例
 * 但是带来额外的资源开销
 */
class SingletonLH {
    private static SingletonLH instance;

    private SingletonLH() {
    }

    public static synchronized SingletonLH getInstance() {
        if (instance == null) {
            instance = new SingletonLH();
        }
        return instance;
    }
}
