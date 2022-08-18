import java.util.*;
import java.io.*;

public class Main {

    static int n,m;
    static String [] arr;
    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
        HashSet<String> set=new HashSet<>();
        StringTokenizer st=new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new String[m];
        for(int i=0; i<n; i++) {
            set.add(br.readLine());
        }
     
        for(int i=0; i<m; i++) {
            arr[i]=br.readLine();
        }
        for(String str: arr) {
            if(set.contains(str)) {
                list.add(str);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(String i: list) {
            System.out.println(i);
        }
    }

}
