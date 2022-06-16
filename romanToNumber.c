#include <stdio.h>
#define N 7
char digits[N] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
int  values[N] = {1, 5, 10, 50, 100, 500, 1000};
int digitsToValues(char ch){
    int i;
    for(i=0; i<N; i++){
        if (digits[i] == ch){
            return values[i];
        }
    }
    return 0;
}
int findMaxIndex(char str[], int L, int R){
    int max = digitsToValues(str[L]);
    int maxIndex = L;
    int i;
    for(i=L; i<=R; i++){
        int nums = digitsToValues(str[i]);
        if(nums > max){
            max = nums;
            maxIndex = i;
        }
    }
    return maxIndex;
}
int romanToNumber(char str[], int L, int R){
    if(L == R){
        return digitsToValues(str[L]);
    }
    else if(L>R){
        return 0;
    }
    else{
        int mi = findMaxIndex(str, L, R);
        int max = digitsToValues(str[mi]);
        int left = romanToNumber(str, L, mi-1);
        int right = romanToNumber(str, mi+1, R);
        return max - left + right;
    }
}
int main(){
    char str[] = "MCMLIV";
    int result = romanToNumber(str, 0, 5);
    //int v = digitsToValues('C');
    printf("%d\n", result);
    return 0;
}