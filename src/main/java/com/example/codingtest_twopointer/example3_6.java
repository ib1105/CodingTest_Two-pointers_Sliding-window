package com.example.codingtest_twopointer;
import java.util.*;
public class example3_6 {
    public int solution(int n, int k, int[] arr){
        /*int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }
        return answer;*/
        int answer=0, cnt=0, lt=0, ltp= 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0){
                cnt++;
            }
            while (cnt > k) {
                //result.add(rt);
                if (arr[lt] == 0) {
                    cnt--;
                    System.out.println("rt : " + rt + "lt : " + lt);
                    result.add(rt-lt+2);
                }
                lt++;
            }
        }
        Collections.sort(result, Collections.reverseOrder());
        return result.get(0);
    }

    public static void main(String[] args){
        example3_6 T = new example3_6();
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