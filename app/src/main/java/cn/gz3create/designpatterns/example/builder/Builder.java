package cn.gz3create.designpatterns.example.builder;

/**
 * Created by Sampson on 2020/10/21.
 * DesignPatterns
 */
public abstract class Builder {
    public abstract Builder buildPartA();
    public abstract Builder buildPartB();
    public abstract Builder buildPartC();
    public abstract Product create();
}
