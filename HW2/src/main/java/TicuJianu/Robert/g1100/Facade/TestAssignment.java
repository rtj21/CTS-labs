package TicuJianu.Robert.g1100.Facade;

import TicuJianu.Robert.g1100.Adapter.Models.TestAdapter;
import TicuJianu.Robert.g1100.Builder.Models.TestBuilder;
import TicuJianu.Robert.g1100.Composite.Models.TestComposite;
import TicuJianu.Robert.g1100.Decorator.Models.TestDecorator;
import TicuJianu.Robert.g1100.Factory.Models.TestFactory;
import TicuJianu.Robert.g1100.Flyweight.Models.TestFlyweight;
import TicuJianu.Robert.g1100.Prototype.Models.TestPrototype;
import TicuJianu.Robert.g1100.Proxy.Models.TestProxy;
import TicuJianu.Robert.g1100.Singleton.Models.TestSingleton;

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
