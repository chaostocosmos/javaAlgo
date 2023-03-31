
import java.util.*;


//Chapter 3


public class Main {
    public static void main(String[] args) {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = 0 , k = 0;

        n = sc.nextInt();
        k = sc.nextInt();

        int[] arr1 = new int[n];
        for(int x=0; x<n; x++){
            arr1[x] = sc.nextInt();
        }


        System.out.println(T.solution3(n,k,arr1));

    }

    private int solution3(int n, int k, int[] arr1) {

        int answer = 0 , p1 = 0 , p2 = k-1;
        int maxnum = Integer.MIN_VALUE;
        int temp;
        while (p2<n){

            temp = 0;
            for(int i=0; i<k; i++){
              temp += arr1[p1+i];
            }
            if(temp>maxnum){
                maxnum = temp;
                answer = maxnum;
            }

            p1++;
            p2++;

        }
        return answer;
    }

    /*
현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고
연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
12 1511 20 2510 20 19 13 15
연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
여러분이 현수를 도와주세요.


입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.


출력
첫 줄에 최대 매출액을 출력합니다.
10 3
12 15 11 20 25 10 20 19 13 15

     */










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