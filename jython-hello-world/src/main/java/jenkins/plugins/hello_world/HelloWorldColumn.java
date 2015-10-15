package jenkins.plugins.hello_world;

import hudson.Extension;
import jenkins.python.expoint.ListViewColumnPW;
import jenkins.python.descriptor.ListViewColumnDescriptorPW;

@Extension
public class HelloWorldColumn
extends ListViewColumnPW
{

    static {
        System.out.println("HelloWorldColumn class loaded");
    }

    public HelloWorldColumn() {
        System.out.println("HelloWorldColumn constructor called");
    }

    public String hello(Object o) {
        return execPython("hello", o).toString();
    }

    @Extension
    public static class HelloWorldColumnDescriptor
        extends ListViewColumnDescriptorPW
    {

        public static Class getParent() {
            return HelloWorldColumn.class;
        }

    }
}
