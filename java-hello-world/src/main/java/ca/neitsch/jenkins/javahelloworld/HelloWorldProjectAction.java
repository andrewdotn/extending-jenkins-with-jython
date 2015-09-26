package ca.neitsch.jenkins.javahelloworld;

import hudson.model.Action;

import java.util.logging.Logger;

public class HelloWorldProjectAction
    implements Action
{
    @Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return "Hello World";
    }

    @Override
    public String getUrlName() {
        return null;
    }
}
