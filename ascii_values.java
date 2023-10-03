public class ascii_values{
    public static void main(String[]args)
    {
        for(char c='A';c<='Z';c++)
            System.out.print(c);
        System.out.println();
        int num1=65;//65 is ascii value of 'A'
        int num2=97;//97 is ascii value of 'a'
        for(int i=0;i<26;i++) {
            System.out.print((char)(num1+i));
        }
        System.out.println();
        for(int i=0;i<26;i++){
            System.out.print((char)(num2+i));
        }
        System.out.println();
        char char1='A';
        System.out.println((int)(char1));
    }
}
