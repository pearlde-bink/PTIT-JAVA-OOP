package run;

import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/run/hanoi.txt";
        File f = new File(fileName);
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getName());
        System.out.println(new Date(f.lastModified()));
        System.out.println(f.length());
    }
}
