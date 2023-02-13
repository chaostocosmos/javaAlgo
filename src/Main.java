

import java.util.Scanner;


public class Main {

    public String solution2(String str){
        // 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
        //입력
        //첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
        //문자열은 영어 알파벳으로만 구성되어 있습니다.
        //출력
        //첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
        // 잘되는데 .. 뭐가 문제지 ..
        String answer = "";

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                char t = Character.toUpperCase(x);
                answer = answer + t;
            }
            else if(Character.isUpperCase(x)){
                char p = Character.toLowerCase(x);
                answer = answer + p;
            }
        }

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x))answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }

        // ASCII CODE를 활용
        for (char x : str.toCharArray()){
            if(x>=97 && x <=122) answer+=(x-32);
            else answer+=(x+32);
        }


        return answer;

    }

//    public int solution1(String str, char t){
//        // 첫 줄에 문자열이 주어지고, 두번쨰 줄에 문자가 주어진다.
//        // 문자열은 영어 알파벳으로만 구성되어 있습니다.
//        // 첫 줄에 해당 문자의 갯수를 출력한다.
//        int answer = 0;
//
//        str = str.toUpperCase(); // 전체 대문자 변경
//        t = Character.toUpperCase(t);
//
//        for(char x : str.toCharArray())
//            if(x==t) answer++;
//
//        //System.out.println(str);
//        //System.out.println(t);
//
////        for(int i=0; i<str.length(); i++){
////            if(str.charAt(i)==t){
////                answer++;
////            }
////        }
//        // for each 문
//
//
//        return answer;
//
//
//    }

    public static void main(String[] args){

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution2(str));
        //System.out.println(T.solution1(str,c));

    }
}

