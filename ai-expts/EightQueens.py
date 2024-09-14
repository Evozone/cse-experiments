# To solve the eight queens problem using A* search

# Imports
from queue import PriorityQueue


def is_goal_state(state):
    """Return True if state is a goal state, False otherwise"""
    # Check if all queens are in different rows
    if len(set(state)) != len(state):
        return False

    # Check if all queens are in different diagonals
    for i in range(len(state)):
        for j in range(i + 1, len(state)):
            if abs(state[i] - state[j]) == j - i:
                return False

    return True


def get_successors(state):
    """Return a list of successors of state"""
    successors = []
    for i in range(len(state)):
        for j in range(len(state)):
            if state[i] != j:
                new_state = state[:]
                new_state[i] = j
                successors.append(new_state)

    return successors


def get_heuristic(state):
    """Return the heuristic value of state"""
    # The heuristic value is the number of pairs of queens
    # that are in the same row, column, or diagonal
    heuristic = 0
    for i in range(len(state)):
        for j in range(i + 1, len(state)):
            if state[i] == state[j]:
                heuristic += 1
            elif abs(state[i] - state[j]) == j - i:
                heuristic += 1

    return heuristic


def a_star_search(initial_state):
    """Return a list of states from the initial state to the goal state"""
    # Create a priority queue
    queue = PriorityQueue()

    # Add the initial state to the queue
    queue.put((0, [initial_state]))

    # Create a set to store visited states
    visited = set()

    # Loop until the queue is empty
    while not queue.empty():
        # Remove the first item from the queue
        item = queue.get()

        # Get the last state from the list of states
        state = item[1][-1]

        # Check if the state is a goal state
        if is_goal_state(state):
            return item[1]

        # Check if the state is visited
        if str(state) not in visited:
            # Add the state to the visited set
            visited.add(str(state))

            # Get the successors of the state
            successors = get_successors(state)

            # Add the successors to the queue
            for successor in successors:
                # Create a new list of states
                new_list = item[1][:]

                # Add the successor to the list
                new_list.append(successor)

                # Get the heuristic value of the successor
                heuristic = get_heuristic(successor)

                # Add the new list to the queue
                queue.put((heuristic, new_list))

    return None


if __name__ == "__main__":
    # Get initial state from the user as a list of 8 integers
    # Each integer represents the column of the queen in the row

    initial_state = [int(x)
                     for x in input("Enter the initial state: ").split()]

    # Check if the initial state is valid
    if len(initial_state) != 8:
        print("Invalid initial state")
        exit()

    # Get the goal
    goal = a_star_search(initial_state)

    # Check if a solution is found
    if goal is None:
        print("No solution")
    else:
        # Print the goal state
        print("\nGoal path:", goal, end="\n\n")

        # Print the number of moves
        print("Number of moves:", len(goal) - 1)

        # Print the solution
        print("Solution:")
        for state in goal:
            for i in range(len(state)):
                for j in range(len(state)):
                    if state[i] == j:
                        print("Q", end=" ")
                    else:
                        print("-", end=" ")
                print()
            print()
