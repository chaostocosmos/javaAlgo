
import java.util.*;


//Chapter 3


public class Main {
    public static void main(String[] args) {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int a = 0 , b = 0;
        a = sc.nextInt();
        int[] arr1 = new int[a];
        for(int x=0; x<a; x++ ){
            arr1[x] = sc.nextInt();
        }
        b = sc.nextInt();

        int[] arr2 = new int[b];
        for(int x=0; x<b; x++){
            arr2[x] = sc.nextInt();
        }


        for(int x : T.solution2(a,b,arr1,arr2)){
            System.out.print(x + " ");
        }

    }


    private ArrayList<Integer> solution2(int n, int m, int[] arr1 , int[] arr2){

        //해결 알고리즘은 알았는데.. 1차원 배열의 정렬이 안됌
        //1. 정렬
        //2. 작은 수에 pointer ++
        //3. 같으면 둘 다 ++
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 =0 , p2 =0;
        while (p1<n && p2<m){
            if(arr1[p1]<arr2[p2]){
                p1++;
            }
            else if (arr1[p1]>arr2[p2]) {
                p2++;
            }
            else {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }
        }


        return answer;
    }
    /*
    설명

A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.

두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.

네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

각 집합의 원소는 1,000,000,000이하의 자연수입니다.


출력
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

5
1 3 9 5 2
5
3 2 5 7 8


     */


    private ArrayList<Integer> solution1(int a , int b , int[] arr1 , int[] arr2) {
        //음 이렇게 풀지말고;
        // Two Pointers Algorithm
        //   0 1 2 3 4
        //   p1 p1을 증가시키면서 확인 while문 사용
        // a 1 3 5
        //   p2
        // b 2 3 6 7 9
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0 , p2=0;
        while (p1<a && p2<b){
            if(arr1[p1]<arr2[p2]){
                answer.add(arr1[p1++]); // 후위 연산
            }
            else {
                answer.add(arr2[p2++]);
            }

        }

        while (p1<a) answer.add(arr1[p1++]);
        while (p2<b) answer.add(arr2[p2++]);


        return answer;
//        int[] answer = new int[a+b];
//        List<Integer> ac = new ArrayList<>();
//        for(int x : arr1){
//            ac.add(x);
//        }
//        for(int y : arr2){
//            ac.add(y);
//        }
//
//        answer = ac.stream().sorted().mapToInt(x->x).toArray();
//
//
//        return answer;
    }


    //chapter3 Solution1 두 배열 합치기
    /*
    오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

    입력
    첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
    두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
    세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
    네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
    각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

    출력
    오름차순으로 정렬된 배열을 출력합니다.

3
1 3 5
5
2 3 6 7 9

    1 2 3
    3 4 5 6 7
    결과
    1 2 3 3 5 6 7 9
     */

}