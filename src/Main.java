import java.util.ArrayList;
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
 */
public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x : T.solution4(n)){
            System.out.print(x + " ");
        }
//        int[] arr = new int[n];
//        int[] arr2 = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int j=0; j<n; j++){
//            arr2[j]=sc.nextInt();
//        }
//
//        for(String x : T.solution3(n,arr,arr2)){
//            System.out.println(x);
//        }

        //System.out.println(T.solution2(n,arr));
        // 인자로 넘겨주는데서 다 처리하면 왜 함수로 넘기냐 여기서 그냥 다처리하지 ㅡㅡ
    }
//    1  1    2    3    5 8 13 21 34 55
//    0 0+1  1+2  2+3
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