package cn.gz3create.designpatterns.example.builder;

/**
 * Created by Sampson on 2020/10/21.
 * DesignPatterns
 */
public class ConcreteBuilder extends Builder {
    private final ProductA productA = new ProductA();

    @Override
    public Builder buildPartA() {
        productA.setPartA();
        return this;
    }

    @Override
    public Builder buildPartB() {
        productA.setPartB();
        return this;
    }

    @Override
    public Builder buildPartC() {
        productA.setPartC();
        return this;
    }

    @Override
    public Product create() {
        return productA;
    }
}
