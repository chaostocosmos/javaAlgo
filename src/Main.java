

import java.util.Scanner;


public class Main {

    public int solution1(String str, char t){
        // 첫 줄에 문자열이 주어지고, 두번쨰 줄에 문자가 주어진다.
        // 문자열은 영어 알파벳으로만 구성되어 있습니다.
        // 첫 줄에 해당 문자의 갯수를 출력한다.
        int answer = 0;

        str = str.toUpperCase(); // 전체 대문자 변경
        t = Character.toUpperCase(t);

        //System.out.println(str);
        //System.out.println(t);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==t){
                answer++;
            }
        }

        return answer;


    }

    public static void main(String[] args){

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution1(str,c));

    }
}

