package q601;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        for(int i=0; i<str.length(); i++) {
            char last = str.charAt(str.length() -1); //0,1,...제일 뒤에 있는 문자를 떼고
            String name = last + str.substring(0,str.length()-1);//m,a....앞에 붙이는 원리
            str=name;
            System.out.println(name);
        }

    }

}
