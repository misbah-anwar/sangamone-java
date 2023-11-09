import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TeacherWebsite {
    public static void main(String[]args)throws IOException {
        File f1=new File("Eshwar.html");
        FileWriter fw1=new FileWriter(f1);
        String s1="<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <head>\n" +
                "\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1>My name is ";

        String s2=".</h1>\n" +
                "        <h2>I teach ";
        String s3=".</h2>\n" +
                "    </body>\n" +
                "</html>";
        String content1=s1+"Eshwar"+s2+"English"+s3;

        fw1.write(content1);
        fw1.close();


    }
}
