# Exam Preparation Schedule

Friday, April 28:
- 9am-12pm: Review materials on Divide-and-Conquer Algorithms, Graph Traversal and Shortest Paths, and Dynamic Programming.
- 1pm-4pm: Review materials on Maximum-Flow/Min-Cut and Matching and Linear Programming.

Sunday, April 30:
- 11am-3pm: Review materials on Divide-and-Conquer Algorithms, Graph Traversal and Shortest Paths, and Dynamic Programming.

Monday, May 1:
- 9am-11:30am: Review materials on Maximum-Flow/Min-Cut and Matching and Linear Programming.
- 12:15pm-1:45pm: Attend review session on Divide-and-Conquer Algorithms, Graph Traversal and Shortest Paths, and Dynamic Programming.
- 3pm-4pm: Review material from review session that is still confusing
- 4:30pm-8pm: Review midterm 1 and the ones from previous years as well

Tuesday, May 2:
- 9am-11am: Attend review session on Maximum-Flow/Min-Cut and Matching and Linear Programming.
- 11am-4pm: Learn more about NP-Completeness and Hashing/Sketches.
- 2pm-4pm: Attend review session on NP-Completeness 
- 4:30pm-8pm: Review midterm 2 and the ones from previous years as well

Wednesday, May 3:
- 8:30am-9am: Review materials on NP-Completeness and Hashing/Sketches, or anything else that may still be slightly unclear.
- Exam day! Give yourself time to review and prepare before the exam.

---

# Review Sheet for Algorithms Final Exam

## Divide-and-Conquer Algorithms

### Solving Problems:
Divide-and-conquer is a problem-solving technique that divides a problem into subproblems of the same type and recursively solves them. The solutions to the subproblems are combined to solve the original problem. To solve a problem using divide-and-conquer, we follow three steps:
- **Divide:** Break the problem into smaller subproblems that are similar to the original problem.
- **Conquer:** Solve the subproblems recursively. If the subproblems are small enough, solve them in a brute-force manner.
- **Combine:** Combine the solutions to the subproblems to solve the original problem.

### Proving Correctness:
To prove the correctness of a divide-and-conquer algorithm, we use mathematical induction. We first prove that the algorithm works correctly for the base case, which is the smallest input size. Then, we assume that the algorithm works correctly for all input sizes smaller than n and prove that it works correctly for input size n. 

### Finding Runtimes:
To find the runtime of a divide-and-conquer algorithm, we use the Master Theorem, which provides a formula to compute the runtime of divide-and-conquer algorithms. 

<img width="500" alt="image" src="https://user-images.githubusercontent.com/53449254/235208532-758ddc24-06b4-4b3b-b6f7-29164e4700a7.png">
<img width="500" alt="image" src="https://user-images.githubusercontent.com/53449254/235208678-69a19efe-119d-4bcd-9ef7-b14247add4c0.png">

***Consider the example for HW1 below***

<img width="500" alt="image" src="https://user-images.githubusercontent.com/53449254/235208852-12312de1-a172-4158-aa0e-372c48d86de8.png">

There is also the **recursion tree method**, where the recurrence is defined by the length of the longst subtree times the work at each level.

<img width="500" alt="image" src="https://user-images.githubusercontent.com/53449254/235210012-e65c243e-e6d9-4207-976d-ccfeb7429680.png">

### ***Write Any Notes Below or On The Back***
---

## Graph Traversal and Shortest Paths

### Solving Problems:
Graph traversal and shortest path algorithms are used to explore and find paths in graphs. Breadth-first search (BFS) and depth-first search (DFS) are examples of graph traversal algorithms. For shortest path algorithms:
- Dijkstra: shortest path with **positive** weights
- Bellman-Ford: shortest path with **negative** weights
- Floyd-Marsh: shortest path from **every** node to **very** node (so like Bellman-Ford on all possible pairs)

There is also:
- **Topological order** can also be helpful, where we order all vertices "as they occur earliest"

<img width="500" alt="image" src="https://user-images.githubusercontent.com/53449254/235227966-4f492196-e9ad-49b6-a181-dd445aa879cb.png">

- **"Reverse" topological order** where we sort in increasing order of $v.post$ for a vertex $v$. This is important as it basically allows us to iterate out from $t$ (our "sink"/"destination" node)
- **Penalizing weights** in a way that accomplishes the algorithms's goal (i.e. the shortest path with fewest edges, which is addressed by adding a weight of $\frac{1}{|E|}$ to each edge)

### Proving Correctness:
To prove the correctness of a graph traversal or shortest path algorithm, we typically use induction on the number of nodes in the graph.

### Finding Runtimes:
The runtime of a graph traversal or shortest path algorithm depends on the size of the input graph and the specific algorithm used. Typically, graph traversal algorithms have a runtime of $O(|V|+|E|)$, where |V| is the number of vertices in the graph and |E| is the number of edges. Shortest path algorithms have runtimes of $O((|V|+|E|)log|V|)$, $O(|V||E|)$, and $O(|V|^3)$, respectively.

### ***Write Any Notes Below or On The Back***
---

## Dynamic Programming

### Solving Problems:
Dynamic programming is a technique for solving optimization problems by breaking them down into smaller subproblems and solving each subproblem only once. The solutions to the subproblems are stored in a table and used to solve the larger problem.

### Proving Correctness:
To prove the correctness of a dynamic programming algorithm, we typically use mathematical induction on the size of the subproblems. We show that the solution to a larger subproblem can be computed using the solutions to smaller subproblems.

### Finding Runtimes:
The runtime of a dynamic programming algorithm depends on the number of subproblems and the cost of solving each subproblem. In some cases, the runtime can be exponential, but in most cases, it is polynomial.

### ***Write Any Notes Below or On The Back***
---

## Maximum-Flow/Min-Cut and Matching

### Solving Problems:
Maximum-flow/min-cut and matching are optimization problems that involve finding the maximum flow or minimum cut in a flow network, or finding a maximum matching in a bipartite graph.

### Proving Correctness:
To prove the correctness of a maximum-flow/min-cut or matching algorithm, we typically use duality theory or the augmenting path theorem. 

### Finding Runtimes:
The runtime of a maximum-flow/min-cut or matching algorithm depends on the specific algorithm used and the size of the input. Some algorithms have a runtime of O(|V|^2|E|), while others have a runtime of O(|V||E|^2).

### ***Write Any Notes Below or On The Back***
---

## Linear Programming

### Problem Solving
- Linear programming is used to solve optimization problems, where we want to maximize or minimize a linear objective function subject to some linear constraints.
- In order to solve a linear programming problem, we first need to set up a mathematical model of the problem, which involves defining the decision variables, objective function, and constraints.
- The simplex algorithm is a widely-used method for solving linear programming problems, which involves iteratively moving from one feasible solution to another in a way that improves the objective function value.

### Proving Correctness
- The correctness of linear programming algorithms relies on the theory of linear algebra and convex optimization.
- The simplex algorithm is guaranteed to terminate with an optimal solution if certain conditions are met, such as the problem being bounded and having a finite optimal solution.
- Other algorithms for solving linear programming problems, such as interior-point methods, also have theoretical guarantees of correctness.

### Finding Runtimes
- The runtime of the simplex algorithm depends on the size of the problem, measured by the number of decision variables and constraints.
- The worst-case runtime of the simplex algorithm is exponential in the size of the problem, but in practice it tends to perform much better than this worst-case bound.
- Other algorithms for solving linear programming problems, such as interior-point methods, have polynomial runtimes in the size of the problem.

### ***Write Any Notes Below or On The Back***
---

## NP-Completeness

### Problem Solving
- NP-completeness is a class of computational problems that are believed to be intractable, meaning that no efficient algorithm exists for solving them.
- In order to solve an NP-complete problem, we typically use approximation algorithms or heuristics that provide a good enough solution within a reasonable amount of time.
- Many important computational problems in a wide range of fields, such as scheduling, optimization, and game theory, are known to be NP-complete.

### Proving Correctness
- Proving that a problem is NP-complete typically involves reduction, which means showing that the problem can be transformed into another known NP-complete problem in polynomial time.
- The correctness of approximation algorithms and heuristics for NP-complete problems is typically analyzed in terms of their approximation ratios, which measure how close the solution they provide is to the optimal solution.

### Finding Runtimes
- The runtime of an algorithm for an NP-complete problem is typically exponential in the size of the problem.
- Approximation algorithms and heuristics for NP-complete problems often have polynomial runtimes, but the quality of the solutions they provide may be lower than that of an optimal solution.

### ***Write Any Notes Below or On The Back***
---

## Hashing/Sketches

### Solving Problems
Hashing and sketches are used in a variety of problems where data needs to be quickly searched, updated or queried. Some common examples include:

- Checking if an item exists in a set
- Counting the frequency of items in a stream
- Detecting duplicates in a dataset
- Approximating heavy hitters (i.e., items with the highest frequency) in a stream

### Proving Correctness
The correctness of hashing and sketches generally depends on the probability of collision (i.e., two distinct items being hashed to the same value). The probability of collision can be calculated using various techniques, including the birthday paradox and the coupon collector's problem. 

The analysis of sketch algorithms often involves showing that the expected error (i.e., the difference between the approximate answer and the true answer) is within a certain bound with high probability.

### Finding Runtimes
The runtime of hashing and sketch algorithms depend on several factors, including the size of the input data, the size of the hash table or sketch, and the probability of collision.

For hashing, the average-case runtime for inserting and searching an item is O(1) with high probability. However, in the worst case (when all items hash to the same value), the runtime is O(n), where n is the number of items.

For sketches, the runtime depends on the size of the sketch and the number of hash functions used. For example, the Count-Min sketch has a runtime of O(k), where k is the size of the sketch, and the number of hash functions used affects the accuracy of the sketch.

### ***Write Any Notes Below or On The Back***
