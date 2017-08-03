package fileOps;

import java.io.File;

/**
 * Created by machu on 2017-04-01.
 */
public class MyLogger implements Logger {
    private File f;
    private String prefix;

    public MyLogger(File f, String prefix) {
        this.f = f;
        this.prefix = prefix;
    }

}
