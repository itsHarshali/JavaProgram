import java.util.*;
import java.io.*;
public class pro {
    public static void main(String[] args) throws Exception {

        FileReader reader=new FileReader("pro.properties");

        Properties p=new Properties();
        p.load(reader);
        System.out.println(p.getProperty("name"));
    }
}

