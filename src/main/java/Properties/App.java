package Properties;

/**
 * Hello world!
 *
 */
import java.io.*;
import java.util.*;
class App
{
    public static void main(String arg[])
    {
        Properties p =new Properties();
        Set s;
        String string;
String ss;
        p.put("name","Sakshi Sharma ");
        p.put("course","Big Data");
        p.put("position","Senior ");
        s=p.keySet();
        Iterator it =s.iterator();
        while(it.hasNext())
        { string =(String) it.next();
            System.out.println("key " +string +" value "+ p.getProperty(string));

        }
        try {File f=new File("db.Properties");
            FileOutputStream fs =new FileOutputStream(f);
            p.store(fs,"thats it");
            fs.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis =new FileInputStream("/home/perky/Properties/db.Properties");
            p.load(fis);
            System.out.println(p.getProperty("position"));
            System.out.println(p.getProperty("course"));
            System.out.println(p.getProperty("name"));


        } catch (Exception  e) {
            e.printStackTrace();
        }
        p.setProperty("another","anything");

        try {
            FileInputStream fis =new FileInputStream("/home/perky/Properties/db.Properties");
            p.load(fis);
            System.out.println(p.getProperty("position"));
            System.out.println(p.getProperty("course"));
            System.out.println(p.getProperty("name"));
            System.out.println(p.getProperty("another"));


        } catch (Exception  e) {
            e.printStackTrace();
        }
p.list(System.out);
    }
}