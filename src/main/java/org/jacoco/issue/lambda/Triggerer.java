package org.jacoco.issue.lambda;

public class Triggerer {
    public void trigger(Runnable r) {
            r.run();
            return;
    }
    
}
