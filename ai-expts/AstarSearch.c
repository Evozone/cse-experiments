// A C program to implement A* search of a graph

#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define INT_MAX 0x7ffffff

// Priority Queue Node
typedef struct PQNode {
    int vertex;
    int priority;
    struct PQNode *next;
} PQNode;

// Priority Queue
typedef struct PriorityQueue {
    PQNode *front;
} PriorityQueue;

// Function to create a new priority queue node
PQNode *newPQNode(int vertex, int priority) {
    PQNode *newNode = (PQNode *)malloc(sizeof(PQNode));
    newNode->vertex = vertex;
    newNode->priority = priority;
    newNode->next = NULL;
    return newNode;
}

// Function to create a new priority queue
PriorityQueue *newPriorityQueue() {
    PriorityQueue *newQueue = (PriorityQueue *)malloc(sizeof(PriorityQueue));
    newQueue->front = NULL;
    return newQueue;
}

// Function to check if the priority queue is empty
int isEmpty(PriorityQueue *queue) {
    return queue->front == NULL;
}

// Function to insert a new node in the priority queue
void insert(PriorityQueue *queue, int vertex, int priority) {
    PQNode *newNode = newPQNode(vertex, priority);

    if (isEmpty(queue) || priority < queue->front->priority) {
        newNode->next = queue->front;
        queue->front = newNode;
    } else {
        PQNode *temp = queue->front;
        while (temp->next != NULL && temp->next->priority <= priority) {
            temp = temp->next;
        }
        newNode->next = temp->next;
        temp->next = newNode;
    }
}

// Function to remove the node with the highest priority
int removeHighestPriority(PriorityQueue *queue) {
    if (isEmpty(queue)) {
        return -1;
    }

    PQNode *temp = queue->front;
    queue->front = queue->front->next;
    int vertex = temp->vertex;
    free(temp);
    return vertex;
}

// Function to implement A* search
void aStarSearch(int **graph, int size, int start, int goal, int *heuristic) {
    int *closed = (int *)malloc(size * sizeof(int));
    int *parent = (int *)malloc(size * sizeof(int));
    int *distance = (int *)malloc(size * sizeof(int));

    // Set the cost of reaching all nodes from the start node to INF
    // Set the parent of all nodes to -1
    // Set the closed array to 0
    for (int i = 0; i < size; i++) {
        distance[i] = INT_MAX;
        parent[i] = -1;
        closed[i] = 0;
    }

    PriorityQueue *open = newPriorityQueue();
    insert(open, start, heuristic[start]);

    // The cost of reaching the start node from itself is 0
    distance[start] = 0;

    while (!isEmpty(open)) {
        int current = removeHighestPriority(open);
        closed[current] = 1;

        if (current == goal) {
            break;
        }

        for (int i = 0; i < size; i++) {
            // For each unclosed neighbor of the current node
            if (graph[current][i] != 0 && !closed[i]) {
                // If the distance to the neighbor is shorter by going through the current node
                // g(n) = distance from start to current
                int newDistance = distance[current] + graph[current][i];
                if (newDistance < distance[i]) {
                    // Update the distance and the parent
                    distance[i] = newDistance;
                    parent[i] = current;
                    // Insert the neighbor in the priority queue
                    // with the priority being the evaluated distance f(n) = g(n) + h(n)
                    insert(open, i, distance[i] + heuristic[i]);
                }
            }
        }
    }

    // After the loop, the parent array contains the shortest path from the start to the goal

    // Utility variables
    int path[size];
    int pathSize = 0;
    int current = goal;

    // This loop is just to find the size of the path
    // Also to reverse the path
    while (current != start) {
        path[pathSize++] = current;
        current = parent[current];
    }

    // Because the loop above does not add the start node to the path
    // We add it here
    path[pathSize++] = start;

    // Print the path with the cost
    printf("The path is: \t");
    for (int i = pathSize - 1; i >= 0; i--) {
        printf("%c ", path[i] + 'A');
    }

    printf(" with cost %d\n", distance[goal]);
}

// Driver program to test above functions
int main() {

    int size;

    printf("Enter the number of vertices: ");
    scanf("%d", &size);

    int **graph = (int **)malloc(size * sizeof(int *));

    printf("Enter the adjacency matrix: \n");
    for (int i = 0; i < size; i++) {
        graph[i] = (int *)malloc(size * sizeof(int));
        for (int j = 0; j < size; j++) {
            // The inputs are 0 if there is no edge between the two vertices
            // Otherwise, the input is the weight of the edge
            scanf("%d", &graph[i][j]);
        }
    }

    printf("Enter the heuristic distances for each vertex (to the goal): \n");
    int *heuristic = (int *)malloc(size * sizeof(int));
    for (int i = 0; i < size; i++) {
        scanf("%d", &heuristic[i]);
    }

    printf("Enter the start and goal vertices: \t");

    char startChar, goalChar;
    scanf(" %c %c", &startChar, &goalChar);

    int start = startChar - 'A';
    int goal = goalChar - 'A';

    aStarSearch(graph, size, start, goal, heuristic);

    return 0;
}


// Enter the number of vertices: 5
// Enter the adjacency matrix: 
// 0 9 0 1 0
// 9 0 6 1 12
// 0 6 0 0 5
// 1 1 0 0 0
// 0 12 5 0 0
// Enter the heuristic distances for each vertex (to the goal): 
// 10 9 5 7 0
// Enter the start and goal vertices:      D E
// The path is:    D B C E  with cost 12
