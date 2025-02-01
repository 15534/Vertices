package org.ftcvertex.vertices;

public interface Command {
    void init();

    void loop();

    boolean isFinished();
}
