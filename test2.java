package jd;/*
山区无线网
时间限制： 3000MS
内存限制： 589824KB
题目描述：
       川西有很多景区，比如理塘。但是位于山区的景区的无线网络都不太好，现在我们设法提供一种解决方案。

       山区山峰密集，因此我们假设基站大部分之间通过有线光缆联通，但是在山区之中检修基站非常危险。所以我们想找到必要的基站予以定期检修。必要的基站是指，如果这个基站故障无法工作，则网络之中会有其他的一些基站之间无法绕过这个基站连通。即在由基站构成的连通图中，去掉该基站和与之相连的边，剩下的图就不是一个连通图。

       现在给定基站数量n和线路数量m，无自环，无重复的线路。给定每条线路的基站，请你计算必要的基站的数量。



输入描述
对于每一组数据，包含三行数据，第一行是基站数量n和线路数量m, 第二行有m组数据分别是ui,i=1,2,..., m, 第三行有m组数据分别是vi,i=1,2,...,m。

ui号基站和vi号基站之间有一条线路。

3≤n≤500,2≤m≤min((n(n-1))/2,1000),1≤ui≤n,1≤vi≤n

保证网络连通，无自环，无重边。

输出描述
输出一个整数，表示必要的基站的数量。


样例输入
4 4
1 2 3 4
2 3 1 3
样例输出
1

提示
样例解释：

除了3号基站以外，剩下基站故障都不会影响其他基站连通性。
 */
import java.util.Scanner;

public class jd2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] w=new int[2][m];
        int[] count=new int[n];
        int ans=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<m;j++){
                w[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<m;j++){
                for(int x=1;x<=n;x++){
                    if(w[i][j]==x) count[x-1]++;
                }

            }
        }
        for(int i=0;i<n;i++){
            if(count[i]>n/2) ans++;
        }
        System.out.println(ans);
    }
}
