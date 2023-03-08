import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int x : T.solution1(n, arr)){
            System.out.print(x+" ");
        }
        //아니 쉬바.. 인자로 넘겨주는데서 다 처리하면 왜 함수로 넘기냐 여기서 그냥 다처리하지 ㅡㅡ
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