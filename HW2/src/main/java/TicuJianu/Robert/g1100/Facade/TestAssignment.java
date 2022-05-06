package TicuJianu.Robert.g1100.Facade;

import TicuJianu.Robert.g1100.Adapter.TestAdapter;
import TicuJianu.Robert.g1100.Builder.TestBuilder;
import TicuJianu.Robert.g1100.Composite.TestComposite;
import TicuJianu.Robert.g1100.Decorator.TestDecorator;
import TicuJianu.Robert.g1100.Factory.TestFactory;
import TicuJianu.Robert.g1100.Flyweight.TestFlyweight;
import TicuJianu.Robert.g1100.Prototype.TestPrototype;
import TicuJianu.Robert.g1100.Proxy.TestProxy;
import TicuJianu.Robert.g1100.Singleton.TestSingleton;

public class TestAssignment {

    TestAdapter adapter;
    TestBuilder builder;
    TestComposite composite;
    TestDecorator decorator;
    TestFactory factory;
    TestFlyweight flyweight;
    TestPrototype prototype;
    TestProxy proxy;
    TestSingleton singleton;

    public TestAssignment(TestAdapter adapter, TestBuilder builder, TestComposite composite, TestDecorator decorator, TestFactory factory, TestFlyweight flyweight, TestPrototype prototype, TestProxy proxy, TestSingleton singleton) {
        this.adapter = adapter;
        this.builder = builder;
        this.composite = composite;
        this.decorator = decorator;
        this.factory = factory;
        this.flyweight = flyweight;
        this.prototype = prototype;
        this.proxy = proxy;
        this.singleton = singleton;
    }

    public void testAll(){
        this.adapter.test();
        this.builder.test();
        this.composite.test();
        this.decorator.test();
        this.factory.test();
        this.flyweight.test();
        this.prototype.test();
        this.proxy.test();
        this.singleton.test();
    }
}
