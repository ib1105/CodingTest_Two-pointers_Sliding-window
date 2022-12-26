package com.example.codingtest_twopointer;
import java.util.*;
public class example3_3 {
    public int solution(int n, int k, int[] arr){
        /*int answer, sum=0;
        for(int i=0; i<k; i++) sum+=arr[i];
        answer=sum;
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer, sum);
        }
        return answer;*/
        ArrayList<Integer> answer = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n - 2; i++) {
            int sum1 = arr[i] + arr[i+1] + arr[i+2];
            System.out.println("sun1 : " + sum1);
            answer.add(sum1);
        }
        int t = answer.size();
        Collections.sort(answer, Collections.reverseOrder());//내림차순 정렬
        return sum = answer.get(0);
    }

    public static void main(String[] args){
        example3_3 T = new example3_3();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
