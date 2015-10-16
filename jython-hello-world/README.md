Run the plugin with `mvn hpi:run`.

Before that will work, you may need to follow
some of the steps in the [Jenkins Plugin
Tutorial](https://wiki.jenkins-ci.org/display/JENKINS/Plugin+tutorial).

The following worked for me:

 1. [Install Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
 2. On the mac: `export JAVA_HOME="$(/usr/libexec/java_home -Fv 1.8)"`
 3. `brew install maven`
 4. Create `~/.m2/settings.xml` as in [the tutorial](https://wiki.jenkins-ci.org/display/JENKINS/Plugin+tutorial).
 5. Run `mvn -U org.jenkins-ci.tools:maven-hpi-plugin:create`.
 6. `rm ~/.m2/settings.xml`
 7. Try `mvn hpi:run` again.
