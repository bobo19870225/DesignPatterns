package cn.gz3create.designpatterns.example.singleton;

/**
 * Created by Sampson on 2020/10/20.
 * DesignPatterns
 * 饿汉单例
 * 一开始就初始化了，内存常驻注意必须用final static修饰
 */
class SingletonEH {
    private final static SingletonEH instance = new SingletonEH();

    private SingletonEH() {

    }

    public static SingletonEH getInstance() {
        return instance;
    }
}
