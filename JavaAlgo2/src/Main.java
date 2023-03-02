// 4. 단어 뒤집기
/*
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번쨰 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
출력 : N 개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.


 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        //문자열 뒤집기
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] str = new String[n];
//        for(int i=0; i<n; i++){
//            str[i] = sc.next();
//        }
//        for (String x : T.solution(n,str)){
//            System.out.println(x);
//        }
        String str = sc.next();
        System.out.println(T.solution3(str));
    }

    public String solution3(String str){
        String answer = "";
        List<Character> as = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] ca = str.toCharArray();
        int lt = 0 , rt = ca.length-1;
        //char array를 순회하면서,
        //그 값이 있는지 없는지 찾기
        //그래서 해당 값이 있으면 첫자를 남기고 다음 값은 제거

        for(lt=0;lt<=rt;lt++){

            if(!as.contains(ca[lt])){
                as.add(ca[lt]);
                sb.append(ca[lt]);
            }

        }

        answer = String.valueOf(sb);


        return answer;

    }

    public String solution2(String str){

        String answer;
        char[] s = str.toCharArray();
        int lt = 0 , rt = str.length()-1;


        while (lt<rt){
            if(!Character.isAlphabetic(s[lt]))lt++;
            else if(!Character.isAlphabetic(s[rt]))rt--; //음..

            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s);
        return answer;
    }

    public ArrayList<String> solution(int n , String[] str){
        ArrayList<String> answer = new ArrayList<>();
//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        //일일히 뒤집기
        for (String x : str){
            char[] s = x.toCharArray();
            int lt = 0 , rt = x.length()-1;
            while (lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;


    }

}
