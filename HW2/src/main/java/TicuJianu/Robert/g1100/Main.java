package TicuJianu.Robert.g1100;

import TicuJianu.Robert.g1100.Adapter.Models.TestAdapter;
import TicuJianu.Robert.g1100.Builder.Models.TestBuilder;
import TicuJianu.Robert.g1100.Composite.Models.TestComposite;
import TicuJianu.Robert.g1100.Decorator.Models.TestDecorator;
import TicuJianu.Robert.g1100.Facade.TestAssignment;
import TicuJianu.Robert.g1100.Factory.Models.TestFactory;
import TicuJianu.Robert.g1100.Flyweight.Models.TestFlyweight;
import TicuJianu.Robert.g1100.Prototype.Models.TestPrototype;
import TicuJianu.Robert.g1100.Proxy.Models.TestProxy;
import TicuJianu.Robert.g1100.Singleton.Models.TestSingleton;

public class Main {
    public static void main(String[] args) {

        TestAssignment testAssignment = new TestAssignment(new TestAdapter(), new TestBuilder(), new TestComposite(), new TestDecorator(), new TestFactory(), new TestFlyweight(), new TestPrototype(), new TestProxy(), new TestSingleton());

        testAssignment.testAll();
    }
}
