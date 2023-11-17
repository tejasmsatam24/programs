#include<stdio.h>
int add (int firstNum, int secondNum);
int sub (int firstNum, int secondNum);

int main (void) {
    printf("Hello World!\n");
    int firstNum, secondNum, answer, choice;
    printf("1 - Add\n2 - Subtract\n");
    scanf("%d", &choice);
    do{
        printf("Enter first number: ");
        scanf("%d", &firstNum);
        printf("Enter second number: ");
        scanf("%d", &secondNum);
        if(choice == 1) {
            answer = add(firstNum, secondNum);
            printf("The answer is %d\n", answer);
        } else if(choice == 2) {
            answer = sub(firstNum, secondNum);
            printf("The answer is %d\n", answer);
        }
        printf("1 - Add\n2 - Subtract\n3 - Stop\n");
        scanf("%d", &choice);
    } while (choice != 3);
}

int add (int firstNum, int secondNum){
    return firstNum + secondNum;
}

int sub (int firstNum, int secondNum) {
    return firstNum - secondNum;
}