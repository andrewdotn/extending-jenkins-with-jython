#!/usr/bin/env jython

print "hello_world_column_descriptor.py loaded"

def get_display_name():
    return "Hello World Descriptor"

def init_plugin():
    global HelloWorldColumn
    print "init_plugin in descriptor fired"
    HelloWorldColumn = extension.getParent()

def new_instance(req, data):
    print "new_instance(%s, %s) called" % (req, data)
    return HelloWorldColumn()
