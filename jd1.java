package jd;/*

殊途同归
时间限制： 3000MS
内存限制： 589824KB
题目描述：
有一个由传送带和终点组成的n行m列矩阵M，传送带有向右、向下两种方向，分别用R、D表示；终点用T表示，固定位于Mn,m处。若货物某时刻处于Mi,j=R，它会被移动到Mi,j+1；若货物处于Mi,j=D，它会被移动到Mi+1,j；但，货物移动到矩阵之外则会丢失。你每次操作可以改变一个传送带的方向，最少操作几次，可以使具有任意初始位置的货物都能到达终点。



输入描述
输入两个整数n,m(1≤n,m≤1000)，表示有n行m列。

然后输入n行，第i行为长度为m的字符串Mi,1,Mi,2,...,Mi,m(Mi,j∈{R,D,T})，表示该传送带矩阵。

输出描述
输出一个整数S，表示最少需要改变S个传送带的方向，使任意初始位置的货物都能抵达终点。


样例输入
3 4
RDDR
DDDD
DRDT
样例输出
3
 */


import javafx.scene.transform.Scale;

import java.util.Scanner;

import java.util.Scanner;

public class jd1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] w=new int[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            String ww=scanner.next();
            for(int j=0;j<ww.length();j++){
                if(ww.charAt(j)=='R') w[i][j]=1;//1代表向左
                else if(ww.charAt(j)=='D') w[i][j]=2;//2代表向下
                else w[i][j]=3;//3代表终点
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==m-1&&w[i][j]==1) ans++;
                if(i==n-1&&w[i][j]==2) ans++;
            }
        }
        System.out.println(ans);
    }
}
