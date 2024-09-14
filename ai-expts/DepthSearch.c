// A C program for depth first search of a graph

#include <stdio.h>
#include <stdlib.h>

typedef struct Stack {
    int top;
    int capacity;
    int *array;
} Stack;

Stack *createStack(int capacity) {
    Stack *S = (Stack *)malloc(sizeof(Stack));
    if (!S)
        return NULL;
    S->capacity = capacity;
    S->top = -1;
    S->array = (int *)malloc(S->capacity * sizeof(int));
    if (!S->array)
        return NULL;
    return S;
}

int isEmptyStack(Stack *S) {
    return (S->top == -1);
}

int isFullStack(Stack *S) {
    return (S->top == S->capacity - 1);
}

void push(Stack *S, int data) {
    if (isFullStack(S))
        printf("Stack Overflow");
    else
        S->array[++S->top] = data;
}

int pop(Stack *S) {
    if (isEmptyStack(S)) {
        printf("Stack is Empty");
        return -1;
    } else
        return (S->array[S->top--]);
}

void deleteStack(Stack *S) {
    if (S) {
        if (S->array)
            free(S->array);
        free(S);
    }
}

// A function to do depth first search of a graph
// graph is the adjacency matrix
// size is the number of vertices
// start is the starting vertex
// goal is the goal vertex
void depthFirstSearch(int **graph, int size, int start, int goal) {
    // Create a stack for depth first search
    Stack *stack = createStack(size);

    // Mark all the vertices as not visited
    int *visited = (int *)malloc(size * sizeof(int));
    for (int i = 0; i < size; i++)
        visited[i] = 0;

    // Push the current source node
    push(stack, start);

    while (!isEmptyStack(stack)) {
        // Pop a vertex from stack and print it
        int current = pop(stack);

        // Stack may contain same vertex twice. So
        // we need to print the popped item only
        // if it is not visited.
        if (!visited[current]) {
            printf("%c ", current + 'A');
            visited[current] = 1;
        }

        // Get all adjacent vertices of the popped vertex s
        // If a adjacent has not been visited, then push it
        // to the stack.
        for (int i = size - 1; i >= 0; i--) {
            if (graph[current][i] && !visited[i])
                push(stack, i);
        }
    }

    deleteStack(stack);
    free(visited);
}

// Driver program to test above functions
int main() {
    int size;

    // Input the size of the graph (number of nodes)
    scanf("%d", &size);

    int **graph = (int **)malloc(size * sizeof(int *));

    // Input the adjacency matrix
    for (int i = 0; i < size; i++) {
        graph[i] = (int *)malloc(size * sizeof(int));
        for (int j = 0; j < size; j++) {
            scanf("%d", &graph[i][j]);
        }
    }

    // Input the start and goal vertices
    char startChar, goalChar;
    scanf(" %c %c", &startChar, &goalChar);

    int start = startChar - 'A';
    int goal = goalChar - 'A';

    printf("The path from %c to %c is: ", startChar, goalChar);

    depthFirstSearch(graph, size, start, goal);

    return 0;
}



// 5
// 0 1 1 0 0
// 1 0 0 1 1
// 1 0 0 0 0
// 0 1 0 0 0
// 0 1 0 0 0
// A
// C
// The path from A to C is: A B D E C
