package cn.gz3create.designpatterns.example.singleton;

/**
 * Created by Sampson on 2020/10/20.
 * DesignPatterns
 * 最好的方式，静态内部类，使用时才加载，线程安全，注意用static final修饰
 */
class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHoled.instance;
    }

    private static class SingletonHoled {
        private static final Singleton instance = new Singleton();
    }

}
