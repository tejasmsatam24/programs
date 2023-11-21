#include <stdio.h>
int linearSearch(int input, int intArray[]);
int main (void) {
    int intArray[] = {1,2,3,4,5,6,7,8,9}; 
    int input;
    printf("Enter the number you want to search in the array: ");
    scanf("%d", &input);
    if(linearSearch(input, intArray) == 1){
        printf("Number found");
    } else {
        printf("Number not found");
    }
    printf("\n");
}

int linearSearch(int input, int intArray[]) {
    for (int i = 0; i < 9; i++) {
        if(intArray[i] == input) {
            return 1;
        }
    }
    return 0;
}