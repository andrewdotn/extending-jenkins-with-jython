package ca.neitsch.jenkins.javahelloworld;

import hudson.Extension;
import hudson.model.AbstractProject;
import hudson.model.Action;
import hudson.model.TransientProjectActionFactory;

import java.util.Collection;
import java.util.Collections;
import java.util.logging.Logger;

@Extension
public class HelloWorldProjectActionFactory extends TransientProjectActionFactory {

    private static final Logger LOG
            = Logger.getLogger(HelloWorldProjectActionFactory.class.getName());

    static {
        LOG.info("HelloWorldProjectActionFactory loaded");
    }

    @Override
    public Collection<? extends Action> createFor(AbstractProject target) {
        LOG.info("HelloWorldProjectActionFactory called");
        return Collections.singletonList(new HelloWorldProjectAction());
    }
}
