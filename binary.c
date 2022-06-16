#include <stdio.h>
#include <stdbool.h>

int countOnes(int num){
        int count = 0;
        while (num > 0){
            if( (num&1)==1){
                count ++;
            }
            num = (num >> 1);//数字往右移一位
        }
        return count;
}

int main(){
    int c = countOnes(13);
    printf("%d\n", c);
    return 0;
}

