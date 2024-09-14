// A C program for breadth first search of a graph
// Uses Adjacency Matrix representation of graphs
// input:
// 1. number of vertices
// matrix of size n x n of 1's and 0's
// starting vertex
// Goal vertex
// 1 if there is an edge between the vertices
// 0 otherwise
// The nodes are lettered from 0 = A, 1 = B, 2 = C, etc.

#include <stdio.h>
#include <stdlib.h>

typedef struct Queue {
    int front, rear, size;
    unsigned capacity;
    int *array;
} Queue;

Queue *createQueue(unsigned capacity) {
    Queue *Q = (Queue *)malloc(sizeof(Queue));
    if (!Q)
        return NULL;
    Q->capacity = capacity;
    Q->front = Q->size = 0;
    Q->rear = capacity - 1;
    Q->array = (int *)malloc(Q->capacity * sizeof(int));
    if (!Q->array)
        return NULL;
    return Q;
}

int isFullQueue(Queue *Q) {
    return (Q->size == Q->capacity);
}

int isEmptyQueue(Queue *Q) {
    return (Q->size == 0);
}

void enqueue(Queue *Q, int data) {
    if (isFullQueue(Q))
        printf("Queue Overflow");
    else {
        Q->rear = (Q->rear + 1) % Q->capacity;
        Q->array[Q->rear] = data;
        Q->size = Q->size + 1;
    }
}

int dequeue(Queue *Q) {
    if (isEmptyQueue(Q))
        printf("Queue is Empty");
    else {
        int data = Q->array[Q->front];
        Q->front = (Q->front + 1) % Q->capacity;
        Q->size = Q->size - 1;
        return data;
    }
}

void deleteQueue(Queue *Q) {
    if (Q) {
        if (Q->array)
            free(Q->array);
        free(Q);
    }
}

// A function to do breadth first search of a graph
// graph is the adjacency matrix
// size is the number of vertices
// start is the starting vertex
// goal is the goal vertex
void breadthFirstSearch(int **graph, int size, int start, int goal) {
    // Create a queue for BFS
    Queue *Q = createQueue(size);

    // Mark all the vertices as not visited
    int *visited = (int *)malloc(size * sizeof(int));
    for (int i = 0; i < size; i++)
        visited[i] = 0;

    // Create an array to store the path
    int *path = (int *)malloc(size * sizeof(int));
    for (int i = 0; i < size; i++)
        path[i] = -1;

    // Mark the current node as visited and enqueue it
    enqueue(Q, start);

    int j = 0;

    while (!isEmptyQueue(Q)) {
        // Dequeue a vertex from queue and print it
        int current = dequeue(Q);

        // Mark the current node as visited
        if (!visited[current]) {
            visited[current] = 1;
            path[j++] = current;
        }

        // Get all adjacent vertices of the dequeued vertex current
        // If a adjacent has not been visited, then mark it visited
        // and enqueue it
        for (int i = 0; i < size; i++) {
            if (graph[current][i] == 1 && visited[i] == 0) {
                enqueue(Q, i);
            }
        }
    }

    // Print the path
    for (int i = 0; i < size; i++) {
        if (path[i] == goal) {
            printf("%c ", path[i] + 'A');
            break;
        } else if (path[i] != -1) {
            printf("%c ", path[i] + 'A');
        }
    }

    // Free memory
    deleteQueue(Q);
    free(visited);
    free(path);
}

// Driver program to test above functions
int main() {
    int size;

    scanf("%d", &size);

    int **graph = (int **)malloc(size * sizeof(int *));

    for (int i = 0; i < size; i++) {
        graph[i] = (int *)malloc(size * sizeof(int));
        for (int j = 0; j < size; j++) {
            scanf("%d", &graph[i][j]);
        }
    }

    char startChar, goalChar;
    scanf(" %c %c", &startChar, &goalChar);

    int start = startChar - 'A';
    int goal = goalChar - 'A';

    breadthFirstSearch(graph, size, start, goal);

    return 0;
}


// 6
// 0 1 1 0 0 0
// 1 0 0 1 0 0
// 1 0 0 1 1 0
// 0 1 1 0 0 1
// 0 0 1 0 0 0
// 0 0 0 1 0 0
// A
// F
// A B C D E F 
