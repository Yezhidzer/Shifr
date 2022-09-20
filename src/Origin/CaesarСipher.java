package Origin;



import java.util.List;
import java.util.Scanner;
public class CaesarСipher {

    public static void main(String[] args) {

        System.out.println("[1 - шифрование] [2 - расшифровка], Выберите один");
        Scanner c=new Scanner(System.in);
        String s1=c.nextLine();
        if(s1.equalsIgnoreCase("1")) {
            System.out.println("Введите простой текст:");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println("Введите ключ:");
            Scanner sc1=new Scanner(System.in);
            int key=sc1.nextInt();
            Encryption(s,key);
        }else if(s1.equalsIgnoreCase("2")) {
            System.out.println("Введите зашифрованный текст:");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println("Введите ключ:");
            Scanner sc1=new Scanner(System.in);
            int key=sc1.nextInt();
            Decrypt(s,key);
        }
    }

    public static List<Character> Decrypt(String str, int n) {

        int k=Integer.parseInt("-"+n);
        String string="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='а'&&c<='я')
            {
                c+=k%26;
                if(c<'а')
                    c+=26;
                if(c>'я')
                    c-=26;
            }else if(c>='А'&&c<='Я')
            {
                c+=k%26;
                if(c<'А')
                    c+=26;
                if(c>'Я')
                    c-=26;
            }
            string +=c;
        }
        System.out.println(str+"После расшифровки:"+string);
        return null;
    }

    public static void Encryption(String str, int k) {

        String string="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='а'&&c<='я')
            {
                c+=k%33;
                if(c<'а')
                    c+=33;
                if(c>'я')
                    c-=33;
            }else if(c>='А'&&c<='Я')
            {
                c+=k%33;
                if(c<'А')
                    c+=33;
                if(c>'Я')
                    c-=33;
            }
            string +=c;
        }
        System.out.println(str+"После шифрования:"+string);
    }


}