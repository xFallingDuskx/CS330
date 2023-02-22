import java.util.*;
import java.lang.Math;

public class Arbitrage {
    Set<Integer> nodes = new TreeSet<>();

    // Code Source (lines 7-74): GeeksForGeeks - https://www.geeksforgeeks.org/bellman-ford-algorithm-dp-23/
    static class Graph {
    
        // A class to represent a weighted edge in graph
        class Edge {
            int src, dest;
            double weight;
            Edge() { 
                src = dest = 0; 
                weight = 0;
            }
        };
      
        int V, E;
        Edge edge[];
      
        // Creates a graph with V vertices and E edges
        Graph(int v, int e) {
            V = v;
            E = e;
            edge = new Edge[e];
            for (int i = 0; i < e; ++i) {
                edge[i] = new Edge();
            }
        }
      
        List<Integer> BellmanFord(Graph graph, int src, Set<Integer> nodes) {
            int V = graph.V, E = graph.E;
            double dist[] = new double[V];
      
            // Initialize distances from src to all other vertices as infinity
            for (int i = 0; i < V; ++i) {
                dist[i] = Double.MAX_VALUE;
            }
            dist[src] = 0;
      
            // Relax all edges |V| - 1 times
            for (int i = 1; i < V; ++i) {
                for (int j = 0; j < E; ++j) {
                    int u = graph.edge[j].src;
                    int v = graph.edge[j].dest;
                    double weight = graph.edge[j].weight;

                    if ((dist[u] != Double.MAX_VALUE) && (dist[u] + weight < dist[v])) {
                        dist[v] = dist[u] + weight;
                    }

                }
            }
      
            // Look for negative-weight cycles (aka our arbitrage path)
            Iterator<Integer> iterator = nodes.iterator();
            while (iterator.hasNext()) {
                int startNode = iterator.next();
                // System.out.println("Node is " + startNode);
                List<Integer> currPath = new ArrayList<>();
                currPath.add(startNode);
                double currWeight = 0;
                double currValue;
                for (int j = 0; j < E; j++) {
                    int u = graph.edge[j].src;
                    int v = graph.edge[j].dest;
                    double weight = graph.edge[j].weight;

                    currPath.add(v);
                    currWeight += weight;
                    if (v == startNode) {
                        currValue = Math.pow(10, currWeight);
                        if (currValue > 1) {
                            return currPath;
                        }
                    }
                }
            }


            // for (int j = 0; j < E; ++j) {
            //     System.out.println("--- ITERATION: " + j);
            //     int u = graph.edge[j].src;
            //     int v = graph.edge[j].dest;
            //     double weight = graph.edge[j].weight;

            //     System.out.println("The edge is " + 
            //     u + "-" + v + " with weight " + weight); 
            //     System.out.println("Original distance is " + dist[v]);

            //     if ((dist[u] != Double.MAX_VALUE) && (dist[u] + weight < dist[v])) {
            //         System.out.println("Graph contains negative weight cycle");
            //         return null;
            //     }
            // }

            printArr(dist, V);
            return null;
        }

        // A utility function used to print the solution
        void printArr(double dist[], int V) {
            // System.out.println("Vertex Distance from Source");
            for (int i = 0; i < V; ++i)
                System.out.println(i + "\t\t" + dist[i]);
        }
    }

    private List<Integer> createGraph(int[][] currencies, double[] adjWeights) {
        int V = adjWeights.length * 2;
        int E = adjWeights.length;
  
        Graph graph = new Arbitrage.Graph(V, E);
  
        for (int i = 0; i < adjWeights.length; i++) {
            graph.edge[i].src = currencies[i][0];
            graph.edge[i].dest = currencies[i][1];
            graph.edge[i].weight = adjWeights[i];
            nodes.add(graph.edge[i].src);
            nodes.add(graph.edge[i].dest);
            // System.out.println("The new edge is " + 
            // graph.edge[i].src + "-" + graph.edge[i].dest +
            // " with weight " + graph.edge[i].weight);
        }


        return graph.BellmanFord(graph, 0, nodes);
    }
    

    // Apply Math.log10() to all weights so addition can be used in Bellman-Ford
    private double[] adjustWeights(double[] weights) {
        double[] adjWeights = new double[weights.length];
        for (int i = 0; i < weights.length; i++) {
            adjWeights[i] = Math.log10(weights[i]);
        }
        return adjWeights;
    }


    public List<Integer> arbitrage(int[][] currencies, double[] weights) {
        List<Integer> path = new ArrayList<>();
        if (currencies.length <= 1) {
            return null;
        }

        double[] adjWeights = adjustWeights(weights);
        path = createGraph(currencies, adjWeights);
        if (path.size() == 0) {
            return null;
        }

        List<Integer> truePath = new ArrayList<>();

        for (int i = path.size() - 1; i >= 0; i--) {
            truePath.add(path.get(i));
        }

        return path;
    }


    public static void main(String[] args) {
        System.out.println("SUM - first two: " + (Math.log10(130) + Math.log10(0.006)));
        System.out.println("SUM - all three: " + (Math.log10(130) + Math.log10(0.006) + Math.log10(1.3)));
        Arbitrage A = new Arbitrage();
        int[][] tCurrencies = new int[3][2];
        tCurrencies[0] = new int[]{1,2};
        tCurrencies[1] = new int[]{2,3};
        tCurrencies[2] = new int[]{3,1};
        double[] tWeights = new double[]{130.0, 0.006, 1.3};
        List<Integer> ans = A.arbitrage(tCurrencies, tWeights);
        System.out.println("Return value: ");
        for (Integer i : ans) {
            System.out.println(i);
        }
    }

}