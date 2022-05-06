package TicuJianu.Robert.g1100;

import TicuJianu.Robert.g1100.Adapter.TestAdapter;
import TicuJianu.Robert.g1100.Builder.TestBuilder;
import TicuJianu.Robert.g1100.Composite.TestComposite;
import TicuJianu.Robert.g1100.Decorator.TestDecorator;
import TicuJianu.Robert.g1100.Facade.TestAssignment;
import TicuJianu.Robert.g1100.Factory.TestFactory;
import TicuJianu.Robert.g1100.Flyweight.TestFlyweight;
import TicuJianu.Robert.g1100.Prototype.TestPrototype;
import TicuJianu.Robert.g1100.Proxy.TestProxy;
import TicuJianu.Robert.g1100.Singleton.TestSingleton;

public class Main {
    public static void main(String[] args) {

        TestAssignment testAssignment = new TestAssignment(new TestAdapter(), new TestBuilder(), new TestComposite(), new TestDecorator(), new TestFactory(), new TestFlyweight(), new TestPrototype(), new TestProxy(), new TestSingleton());

        testAssignment.testAll();
    }
}
