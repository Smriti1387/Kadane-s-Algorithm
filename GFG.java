import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t = Integer.parseInt(br.readLine());
while(t-- > 0) {
int n =Integer.parseInt(br.readLine());
int[] a = new int[n];
String line = br.readLine();
String[] strs = line.trim().split("\\s+");
for (int i = 0; i < n; i++) {
a[i] = Integer.parseInt(strs[i]);
}
          int max = a[0];
           int current_sum = a[0];
           for(int i = 1; i < n; i++){
           current_sum = Math.max(a[i], current_sum+a[i]);
           max = Math.max(max, current_sum);
	     
	 }
	 System.out.println(max);
	 }
}
}
