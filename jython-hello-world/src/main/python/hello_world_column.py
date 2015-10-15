#!/usr/bin/env jython

import time

import hudson.model.Action

def get_display_name():
    return "Hello World"

def hello(job):
    return job.getName().upper() + "@" + str(time.time())
