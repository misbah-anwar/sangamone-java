import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherWebsite_updated {
	
	public static void main(String args[]) throws FileNotFoundException
	{
		File f1 = new File("TeacherWebsite.txt");
		List<String> subjects =new ArrayList<>();
		List<String> names1;
		List<List<String>> all_names =new ArrayList<>();
		Scanner sc =new Scanner(f1);
		String[] temp1 ;
		String[] temp2;
		int len2 = 0;
		while(sc.hasNextLine())
		{
			names1 =new ArrayList<>();
			temp1 = sc.nextLine().split(":");
			subjects.add(temp1[0]);
			temp2 = temp1[1].split(",");
			len2 = temp2.length;
			for(int i=0;i<len2;i++){
				names1.add(temp2[i]);
			}
			all_names.add(names1);
		}
		System.out.println(all_names);
		sc.close();
	}
}
