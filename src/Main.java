import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/*

보이는 학생
선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
선생님이 볼 수 있는 최대학생수를 출력한다.

8
130 135 148 140 145 150 150 153

가위 바위 보
A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
예를 들어 5이면
c :1 2 3 4 5
A :2 3 3 1 3
B :1 1 2 2 3
A B A B D
두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.

5
2 3 3 1 3
1 1 2 2 3
3
1 1 1
1 1 1

1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
첫 줄에 피보나치 수열을 출력합니다.
10
1 1 2 3 5 8 13 21 34 55

소수(에라토스테네스 체)

설명
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
출력
첫 줄에 소수의 개수를 출력합니다.
20
8

설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
각 자연수의 크기는 100,000를 넘지 않는다.

출력
첫 줄에 뒤집은 소수를 출력합니다.
출력순서는 입력된 순서대로 출력합니다.
9
32 55 62 20 250 370 200 30 100
23 2 73 2 3

1. 수를 뒤집어야 하고
1의 자리일때는 나머지를 구하고 10의 자리일땐 나눈다 100의 자리일떄도 나눈다
그런데 1의 자리였던 부분이 0이면 추가하지 않고 2번쨰 자리도 0 이면 추가하지 않는다.


2. 뒤집힌 수가 소수인지 판별해야함


OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제를 말한다.
여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점을 주기 위해서 다음과 같이 점수 계산을 하기로 하였다.
1번 문제가 맞는 경우에는 1점으로 계산한다. 앞의 문제에 대해서는 답을 틀리다가 답이 맞는 처음 문제는 1점으로 계산한다.
또한, 연속으로 문제의 답이 맞는 경우에서 두 번째 문제는 2점, 세 번째 문제는 3점, ..., K번째 문제는 K점으로 계산한다. 틀린 문제는 0점으로 계산한다.
예를 들어, 아래와 같이 10 개의 OX 문제에서 답이 맞은 문제의 경우에는 1로 표시하고, 틀린 경우에는 0으로 표시하였을 때,

점수 계산은 아래 표와 같이 계산되어, 총 점수는 1+1+2+3+1+2=10 점이다.
1 0 1 1 1 0 0 1 1 0

1 0 1 2 3 0 0 1 2 0
시험문제의 채점 결과가 주어졌을 때, 총 점수를 계산하는 프로그램을 작성하시오.

첫째 줄에 문제의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸을 사이에 두고 주어진다.
0은 문제의 답이 틀린 경우이고, 1은 문제의 답이 맞는 경우이다.

10
1 0 1 1 1 0 0 1 1 0

설명

N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

입력
첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.

출력
입력된 순서대로 등수를 출력한다.

5
87 89 92 100 76

30
65 54 81 56 54 70 61 87 99 58 78 99 99 70 96 60 77 84 67 86 84 98 63 96 83 54 52 86 78 69

30
65 54 81 56 54 70 61 87 99 58 78 99 99 70 96 60 77 84 67 86 84 98 63 96 83 54 52 86 78 69

21 27 13 26 29 17 23 7 1 25 14 1 1 22 5 24 16 10 20 8 11 4 22 6 12 49 30 10 24 19
21 27 13 26 29 17 23 7 1 25 14 1 1 22 5 24 16 10 20 8 11 4 22 6 12 49 30 10 24 19

21 27 13 26 27 17 23 7 1 25 14 1 1 17 5 24 16 10 20 8 10 4 22 5 12 27 30 8 14 19
21 27 13 26 27 17 23 7 1 25 14 1 1 17 5 24 16 10 20 8 10 4 22 5 12 27 30 8 14 19
21 5 13 26 7 12 23 7 1 25 4 1 1 17 4 24 16 9 20 6 10 4 22 5 12 27 30 8 14 19


 */
public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int x : T.solution9(n,arr)){
            System.out.print(x + " ");
        }



    }



    private int[] solution9(int n, int[] arr) {

        int[] answer = new int[n];
        int x = Integer.MIN_VALUE;

        for(int i=0; i<n;i++){
            if(arr[i]>=x){

                x = arr[i];
                answer[i] = 1;

                for (int k=0; k<i; k++){
                    if(arr[i]>arr[k]){
                        answer[k]+=1;
                    }
                    else {
                        answer[k] = 1;
                    }
                }


            }
            else {
                answer[i] += 1;
                for(int j=0; j<=i; j++){
                    if(arr[i]<arr[j]){
                        answer[i]+=1;
                    }
                    else if (arr[i]>arr[j]) {
                        answer[j]+=1;
                    }
                }
            }



        }

        return answer;

    }

    private int solution8(int n, int[] arr) {
        int answer = 0;
        int count = 0;
        int[] score = new int[n];
        for(int i=0; i<n;i++){
            if(arr[i]==1){
                score[i] = 1 + count;
                count++;
            }
            else {
                score[i] = 0;
                count = 0;
            }
        }
        for(int x : score){
            answer += x;
        }
        return answer;
    }
//1. 수를 뒤집어야 하고
//1의 자리일때는 나머지를 구하고 10의 자리일땐 나눈다 100의 자리일떄도 나눈다
//    그런데 1의 자리였던 부분이 0이면 추가하지 않고 2번쨰 자리도 0 이면 추가하지 않는다.
//
//
//2. 뒤집힌 수가 소수인지 판별해야함

    public boolean isPrime(int num){

        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }

    public  ArrayList<Integer> solution7(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while (tmp>0){
                int t= tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }
        return answer;
    }
    private List<Integer> solution6(int n, int[] arr) {

        int[] temp = new int[n];
        List<Integer> answer = new ArrayList<>();
        int conut = 0;
        String sb = "";

        for (int i=0; i<n; i++){

            sb = String.valueOf(arr[i]%10);
            while (arr[i]>10){
                arr[i] /= 10;
                sb +=  String.valueOf(arr[i]%10);

            }
            temp[i] = Integer.parseInt(sb);
        }
        for(int k=0; k<temp.length;k++){
            if(temp[k]>1){
                for(int j=2;j<temp[k];j++){
                    if(temp[k]%j==0){
                        conut++;
                    }
                }
                if(conut==0){
                    answer.add(temp[k]);
                }
                conut=0;
            }
        }
        return answer;
    }
//    1  1    2    3    5 8 13 21 34 55
//    0 0+1  1+2  2+3

    // 제공된 자연수 n개에 대해서
    // 2부터 n까지 증가되는 수 중 그 배수가 존재한다면 그 수는 배제
    // 전체를 순회했을 떄 남은 수는 리스트에 추가
    private int solution5(int n){
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i=2;i<=n;i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i) ch[j]=1;
            }
        }

        return answer;


    }

    private ArrayList<Integer> solution4(int n){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(answer.isEmpty()){
                answer.add(1);
            } else if (answer.size()==1) {
                answer.add(1);

            }else{
                answer.add(answer.get(i-2)+answer.get(i-1));
            }


        }


        return answer;

    }

    private String[] solution3(int n, int[] arr, int[] arr2){

        /*
        썜 답안

         */
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            if(arr[i]==arr2[i]){
                answer[i]="D";
            }
            else if (arr[i]==1&&arr2[i]==3 || arr[i]==2&&arr2[i]==1 || arr[i]==3&&arr2[i]==2){
                answer[i]="A";

            }
            else {
                answer[i]="B";
            }

        }


        return answer;

    }

    private int solution2(int n , int[] arr){
        
        int answer = 0;
        int maxcnt = 0;

        ArrayList<Integer> ai = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]>maxcnt){
                maxcnt = arr[i];
                ai.add(maxcnt);
            }

        }
        answer = ai.size();



        return answer;


    }

    private ArrayList<Integer> solution1(int n , int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if (arr[i]>arr[i-1]) answer.add(arr[i]);

        }

        return answer;

    }
}