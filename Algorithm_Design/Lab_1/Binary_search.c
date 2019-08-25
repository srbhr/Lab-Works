//
// Created by Saurabh on 23-08-2019.
//
#include <stdio.h>
int Binary(int arr[], int x, int l, int r){
    while (l<=r){
        int m = l + (r - l)/2;
        if (arr[m] == x){
            return m;
        }
        if (arr[m] < x){
            l = m + 1;
        }
        else{
            r = m - 1;
        }
    }
    return -1;
}
int main(){
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int x = 6;
    int n = sizeof(arr)/ sizeof(arr[0]);
    int check = Binary(arr, x, 0, n-1);
    (check == -1) ? printf(" 404 :Element not found !") : printf(" Element found at index: %d",check);
    return 0;
}


