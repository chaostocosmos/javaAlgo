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

설명
5*5 격자판에 아래와 같이 숫자가 적혀있습니다.
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력합니다.

첫 줄에 자연수 N이 주어진다. ( 2<=N<=50 )
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

최대 합을 출력합니다.

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
격자의 가장자리는 0으로 초기화 되었다고 가정한다.
만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
봉우리의 개수를 출력하세요.

5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2

6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6

임시반장 정하기
설명

김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다.
그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
그래서 김갑동 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표를 만들었다.
예를 들어 학생 수가 5명일 때의 표를 살펴보자.

5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2

위 경우에 4번 학생을 보면 3번 학생과 2학년 때 같은 반이었고, 3번 학생 및 5번 학생과 3학년 때 같은 반이었으며,
2번 학생과는 4학년 때 같은 반이었음을 알 수 있다. 그러므로 이 학급에서 4번 학생과 한번이라도
같은 반이었던 사람은 2번 학생, 3번 학생과 5번 학생으로 모두 3명이다.
이 예에서 4번 학생이 전체 학생 중에서 같은 반이었던 학생 수가 제일 많으므로 임시 반장이 된다.
각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.

첫째 줄에는 반의 학생 수를 나타내는 정수가 주어진다. 학생 수는 3 이상 1000 이하이다.
둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다.
주어지는 정수는 모두 1 이상 9 이하의 정수이다.

첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다.
단, 임시 반장이 될 수 있는 학생이 여러 명인 경우에는 그 중 가장 작은 번호만 출력한다.



 */
public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.check_solution(n, arr));
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n+1][6];
//
//        for(int i=1; i<n; i++){
//            for (int j=1; j<=5; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.print(T.check_solution(n,arr));

    }
    //정답
    private int check_solution(int n, int[][] arr){
        int answer=0, max=0;
        for(int i=1; i<=n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }


    private int solution12_right(int n, int[][] arr){
        int answer = 0 , max=0;

        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer = i;
            }
        }

        return answer;
    }


    //오답
    private int solution12(int n, int[][] arr) {

        int answer = n , minv=Integer.MIN_VALUE ;
        int[] dx = new int[n*2];
        int[] acc = new int[n];
        for(int x=0; x<n*2;x++){
            dx[x] = -n+x;
        }

        for(int i=0;i<n;i++){
            for(int j=0; j<5; j++){
                for(int k=0; k<n*2;k++){
                    int nx = i+dx[k];
                    if(nx>=0 && nx<n && i!=nx && arr[i][j] == arr[nx][j]){
                        acc[i] += 1;
                        break;
                    }
                }
            }
        }

        for(int x : acc){
            System.out.println("같은 반 겹치는 수 " + x);
        }

        return answer;
    }

    /*
    격자 안 봉우리
    Class Main
    int [] dx = {-1,0,1,0};
    int [] dy = {0,1,0,-1};
    public int solution(int n , int[][] arr){
        int answer=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k = 0 ; k<4; k++){
                    int nx = i+dx[k];
                    int ny = i+dy[k];
                    if( nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }
    void main
    int n = kb.nextInt();
    int[][] arr = new int[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            arr[i][j] = kb.nextInt();
        }
    System.out.print(T.solution11(n,arr));
     */
    private int solution11(int n, int[][] arr) {
        int answer = 0;


        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(arr[i][j]>arr[i-1][j]&&arr[i][j]>arr[i+1][j]&&arr[i][j]>arr[i][j-1]&&arr[i][j]>arr[i][j+1]){
                    answer++;
                }
            }
        }
        return answer;
    }

    /*
    격자판 최대합
    int answer = 0;
    int sum1 , sum2
    int x = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
        sum1=sum2=0;
        for(int j=0; j<n; j++){
            sum1+=arr[i][j]
            sum2+=arr[j][i]
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);
        }
    }
    sum1=sum2=0;
    for(int i=0; i<n; i++){
        sum1+=arr[i][i];
        sum2+=arr[i][n-i-1];
    }

     */

    private int solution10(int n, int[][] arr){
        int answer = 0;
        int x = Integer.MIN_VALUE;
        int[] sum1 = new int[n];
        int[] sum2 = new int[n];
        int i , j , sum3 = 0 ,sum4 =0;

        for(i=0; i<n; i++){
            for (j=0; j<n; j++){
                sum1[i]+=arr[i][j];
                sum2[i]+=arr[j][i];

                if(i==j){
                    sum3+=arr[i][j];
                }
                if(i+j==n-1){
                    sum4+=arr[i][j];
                }
            }
            if(sum1[i]>=x){
                x = sum1[i];
            }
            if(sum2[i]>=x){
                x = sum2[i];
            }
            if(sum3>=x){
                x = sum3;
            }
            if(sum4>=x){
                x = sum4;
            }


        }



        answer = x;
        return answer;
    }


    /*
    등수구하기 강의 ver
     private int[] solution9(int n, int[] arr) {
        int[] answer = new int[n]
        for(int i=0; i<n; i++){
            int cnt = 1;
            for (int j=0; j<n; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i] = cnt;
         }

        return answer;
     {
     */

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