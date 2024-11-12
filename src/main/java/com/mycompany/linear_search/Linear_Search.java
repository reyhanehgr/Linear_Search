/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linear_search;

import java.util.Scanner;

///Linear Search
public class Linear_Search {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr={1,12,5,0,17,25,36,74,10,};
        System.out.print("Enter key:");
        int key=scanner.nextInt();
        for(int i=0;i<=arr.length;i++){
            if(key==arr[i]){
                System.out.println("key found in index :"+ i);
                break;
            }
            else
                System.out.println("key not founded!");
        }
    }
}
