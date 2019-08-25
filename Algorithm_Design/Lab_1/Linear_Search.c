//
// Aim : - To perform Linear Search and Binary Search and Analyse it's time complexity.
//
#include <stdio.h>
int search(int arr[],int x, int n){
    int i;
    for (int j = 0; j < n; ++j) {
        if (arr[j] == x){
            return j;
        }}
    return -1;
}
int main(){
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int x = 6;
    int n = sizeof(arr)/ sizeof(arr[0]);  // This yields the length of the function, i.e. to divide the whole array by
    // type of value it holds.
    int check = search(arr,x,n);
    (check == -1) ? printf(" 404 :Element not found !") : printf(" Element found at index: %d",check);
    return 0;
}
