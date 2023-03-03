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

//유효한 펠린드롬
/*
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

알파벳 이외의 문자들의 무시합니다.

found7, time: study; Yduts; emit, 7Dnuof
foundtimestudy
ydutsemitdnuof
// https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%A0%95%EA%B7%9C%EC%8B%9DRegular-Expression-%EC%82%AC%EC%9A%A9%EB%B2%95-%EC%A0%95%EB%A6%AC
자바 정규식

1. 문자열을 알파벳으로 모두 변경한다. ( 정규식을 이용 )
2. 정규식으로 변경된 알파벳이 회문문자인지 판별한다.

YES

.	임의의 문자 1개를 의미
^	시작을 의미한다
[] 괄호 안에 있다면 일치하지 않는 부정의 의미로로 쓰인다	^a : a로 시작하는 단어
[^a] : a가 아닌 철자인 문자 1개
$	$앞의 문자열로 문자가 끝나는지를 의미한다	a$ : a로 끝나는 단어
[]	[] 괄호 안의 문자가 있는지를 확인한다	[ab][cd] : a,b중 한 문자와 c,d중 한 문자
→ ac ad bc bd
[^]	[] 대괄호 안에 ^ 문자가 있으면, 제외를 뜻함

- 대괄호 안에 ^ 가 쓰이면 제외의 뜻
- 대괄호 밖에 ^ 가 쓰이면 시작점의 뜻	[^a-z] : 알파벳 소문자 a부터 z까지를 제외한 모든 문자
-	사이의 문자 혹은 숫자를 의미한다	[a-z] : 알파벳 소문자 a부터 z까지 하나
[a-z0-9] : 알파벳 소문자 전체,0~9 중 한 문자
|	또는	[a|b] : a 혹은 b
()	그룹	01(0|1) : 01뒤에 0 또는 1이 들어간다
→ 010(o), 011(o), 012(x)
{}	개수	a{3}b : a가 3번 온 후 b가 온다
→ aab(x), aaab(o), aaaab(o)
\b	공백, 탭, ",", "/" 등을 의미한다	apple\b : apple뒤에 공백 탭등이 있다
→ apple juice (o), apple.com (x)
\B	\b의 부정
공백 탭등이 아닌 문자인 경우 매치한다	apple\B
→ apple.com (o)
\d	0~9 사이의 숫자
[0-9]와 동일
\D	\d의 부정
숫자가 아닌 어떤 문자, [^0-9]와 동일
\s	공백, 탭
\S	공백, 탭이 아닌 문자
\w	알파벳 대소문자+숫자+"_"

[a-zA-Z_0-9]와 동일
\W	\w의 부정

[^a-zA-Z_0-9]


정규식 수량 기호
기호	설명	예제
?	앞의 표현식이 없거나 or 최대 한개만	a1? : 1이 최대 한개만 있거나 없을수도 있다
→ a(o), a1(o), a11(x), a111(x)
*	앞의 표현식이 없거나 or 있거나 (여러개)	a1* : 1이 있을수도 없을수도 있다
→ a(o), a1(o), a11(o), a111(o)
+	앞의 표현식이 1개 이상 or 여러개	a1* : 1이 1개 이상있다
→ a(x), a1(o), a11(o), a111(o)
{n}	딱 n개 있다	a{3} : a가 딱 3개 있다
→ aa(x), aaa(o), aaaa(x), aaaaaaa(x)
{n, m}	n개 이상 m개 이하	a{3,5} : a가 3개 이상 5개 이하 있다
→ aa(x), aaa(o), aaaa(o), aaaaaaa(x)
{n,}	n개 이상	a{3,} : a가 3개 이상 있다
→ aa(x), aaa(o), aaaa(o), aaaaaaa(o)


정규식 그룹 캡쳐 기호
기호	설명
()	그룹 및 캡쳐
(?:)	찾지만 그룹에 포함 안됨
(?=)	=앞 문자를 기준으로 전방 탐색
(?<=)	=뒤 문자를 기준으로 후방 탐색


자주 사용되는 정규식 샘플
정규 표현식	설명
^[0-9]*$	숫자
^[a-zA-Z]*$	영문자
^[가-힣]*$	한글
\\w+@\\w+\\.\\w+(\\.\\w+)?	E-Mail
^\d{2,3}-\d{3,4}-\d{4}$	전화번호
^01(?:0|1|[6-9])-(?:\d{3}|\d{4})-\d{4}$	휴대전화번호
\d{6} \- [1-4]\d{6}	주민등록번호
^\d{3}-\d{2}$	우편번호

 */

//----
/*
9. 숫자만 추출
문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 */


public class Main {


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution8(str));
    }


    //숫자만 추출
    private int solution8(String str){
        int answer =0;
        str = str.replaceAll("[^0-9]","");

        answer = Integer.parseInt(str);



        return answer;
    }
    //유효한 펠랜드롬
    private String solution7(String str){

        String answer = "YES";
        String tmp = "";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        //tmp = str.replaceAll("^[a-zA-Z]*$"," ");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(str);
        String reverstring = sb.reverse().toString();
        if(!reverstring.equalsIgnoreCase(str)){
            return "NO";
        }

        return answer;


    }


    private String solution6(String str) {
        String answer = "";
        int len = str.length();
        str = str.toUpperCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String restring = sb.reverse().toString();
        //System.out.println(restring);
//        if(restring.equals(str)){
//            return "YES";
//        }
//        else {
//            return "NO";
//        }




        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return "NO";
            }
        }

        return answer;

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

