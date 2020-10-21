package cn.gz3create.designpatterns.example.builder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Sampson on 2020/10/21.
 * DesignPatterns
 */
public class ConcreteBuilderTest {
    private ConcreteBuilder concreteBuilder;

    @Before
    public void setUp() throws Exception {
        concreteBuilder = new ConcreteBuilder();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void buildPartA() {
        concreteBuilder.buildPartA();
    }

    @Test
    public void buildPartB() {
        concreteBuilder.buildPartB();
    }

    @Test
    public void buildPartC() {
        concreteBuilder.buildPartC();
    }

    @Test
    public void create() {
        Product product = concreteBuilder.create();
        assertNotNull(product);
    }
}