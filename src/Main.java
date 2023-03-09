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
        System.out.println(T.solution2(n,arr));
        // 인자로 넘겨주는데서 다 처리하면 왜 함수로 넘기냐 여기서 그냥 다처리하지 ㅡㅡ
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