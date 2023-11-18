#include <stdio.h>

const int N = 3;
float average(int scores[]);

int main (void) {
    int scores[3];
    scores[0] = 72;
    scores[1] = 73;
    scores[2] = 33;

    printf("Average: %f\n", average(scores));
}

float average(int array[]) {
    int sum = 0;
    for (int i = 0; i < N; i++) {
        sum += array[i]; 
    }
    return sum/(float)3;
}