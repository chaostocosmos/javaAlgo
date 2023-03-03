import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



//회문 문자열
/*
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 */


public class Main {


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution6(str));
    }

    private String solution6(String str) {
        String answer = "";
        str = str.toUpperCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String restring = sb.reverse().toString();
        //System.out.println(restring);
        if(restring.equals(str)){
            return "YES";
        }
        else {
            return "NO";
        }



    }


    public String solution3(String str){

        //한 개의 문장이 주이지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램 작성
        //문장속의 각 단어는 공백

        // 첫 줄의 가장 긴 단어를 출력 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어
        // split 사용

        String anwser = "";
        int m = Integer.MIN_VALUE , pos;
        /*
        String[] s =str.split( " ");
        for (String x : s){
            int len = x.length();
            if(len>m){
                m=len;
                anwser=x;
            }
        }
        */
        // indexof , substring 사용
        while ((pos=str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m=len;
                anwser=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m) anwser=str;

        return anwser;

    }

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
            else answer+=(char)(x+32);
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


}

