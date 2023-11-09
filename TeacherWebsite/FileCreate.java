//file to be read into a Map
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileCreate {
    public static void main(String[]args){
        File f1;
        int len1=0,len2=0;
        String name1;
//        Map<String,List<String>> map1;
        List<String> subjects=new ArrayList<>();
        List<String> names=new ArrayList<>();
        subjects.add("1English");
        subjects.add("1Maths");
        subjects.add("1Physics");
        subjects.add("1Chemistry");
        subjects.add("1Biology");
        String subject1;
        for(int i=0;i<5;i++){
            subject1=subjects.get(i);
            f1=new File(subject1);
            f1.mkdir();
        }
        //map1=new HashMap<String,List<String>>();
        //map1.put("English",["Eshwar"]);
        names.add("Eshwar");
        len2=names.size();
        for(int i=0;i<len2;i++){
            name1=names.get(i);
            f1=new File(subjects.get(0)+"/"+name1);
            f1.mkdir();
        }
        names.clear();

        names.add("Manohar");
        names.add("Mani");
        names.add("Meera");
        len2=names.size();
        for(int i=0;i<len2;i++){
            name1=names.get(i);
            f1=new File(subjects.get(1)+"/"+name1);
            f1.mkdir();
        }
        names.clear();

        names.add("Parvathi");
        names.add("Prema");
        len2=names.size();
        for(int i=0;i<len2;i++){
            name1=names.get(i);
            f1=new File(subjects.get(2)+"/"+name1);
            f1.mkdir();
        }
        names.clear();

        names.add("Chandrika");
        names.add("Chirag");
        len2=names.size();
        for(int i=0;i<len2;i++){
            name1=names.get(i);
            f1=new File(subjects.get(3)+"/"+name1);
            f1.mkdir();
        }
        names.clear();

        names.add("Bhargav");
        names.add("Bhaskar");
        len2=names.size();
        for(int i=0;i<len2;i++){
            name1=names.get(i);
            f1=new File(subjects.get(4)+"/"+name1);
            f1.mkdir();
        }
        names.clear();
    }
}
