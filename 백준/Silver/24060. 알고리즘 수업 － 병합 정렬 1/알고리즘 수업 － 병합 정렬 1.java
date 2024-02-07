import java.util.*;
import java.io.*;

class Main {

    static int[] tmp;
    static int count = 0;
    static int result = -1;
    static int K;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        tmp = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr,0,N-1);
        bw.write(String.valueOf(result));
        
        br.close();
        bw.flush();
        bw.close();
    }
    private static void mergeSort(int[] arr,int l,int r){
        if(count > K) return;
        if(l < r){
            int m = (l+r) / 2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    private static void merge(int[] arr, int l, int m, int r){
        int i = l;
        int j = m + 1;
        int t = 0;
        
        while(i <= m && j <= r){
            if(arr[i] < arr[j])
                tmp[t++] = arr[i++];
            else
                tmp[t++] = arr[j++];
        }

        while(i <= m)
            tmp[t++] = arr[i++];

        while(j <= r)
            tmp[t++] = arr[j++];

        i = l;
        t = 0;
        while(i <= r){
            count++;
            if(count == K){
                result = tmp[t];
                break;
            }
            arr[i++] = tmp[t++];
        }
    }
}