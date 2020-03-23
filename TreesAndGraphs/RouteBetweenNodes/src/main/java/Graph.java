public class Graph<E> implements Cloneable {
    // Adjacency matrix. n x n 2-dimensional array
    private boolean edges[][];
    // 1-D array of the vertices and their corresponding label (any data type, generic)
    private Object[] labels;

    public Graph(int n) {
        edges = new boolean[n][n];
        labels = (E[]) new Object[n];
    }

    public Graph<E> clone() {
        Graph<E> answer;
        try {
            answer = (Graph<E>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This class does not implement Cloneable");
        }
        answer.edges = edges.clone();
        answer.labels = labels.clone();

        return answer;
    }

    public void addEdge(int source, int target) {
        edges[source][target] = true;
    }

    public boolean isEdge(int source, int target) {
        return edges[source][target];
    }

    public void removeEdge(int source, int target) {
        edges[source][target] = false;
    }

    @SuppressWarnings("unchecked")
    public E getLabel(int vertex) {
        return (E) labels[vertex];
    }

    public void setLabel(int vertex, E newLabel) {
        labels[vertex] = newLabel;
    }

    public int size() {
        return labels.length;
    }

    public int[] neighbors(int vertex) {
        int i;
        int count;
        int[] answer;

        // Iterate thru row containing vertex of adjacency matrix to find where vertex points to other node (neighbor)
        count = 0;
        for(i=0; i < labels.length; i++) {
            if (edges[vertex][i])
                count++;
        }

        //  Create the new edge list array based on size found in previous for loop
        answer = new int[count];

        /***
         * The edge list will be provided as an array of integers that contains all of the
         * vertex numbers for the targets of edges that start at a specified source
         */
        count = 0;
        for (i = 0; i < labels.length; i++) {
            // if vertex points to node == true, then it is a neighbor
            if(edges[vertex][i])
                answer[count++] = i; // i is the node that the vertex points to
        }
        return answer;
    }

    public static <E> void depthFirstPrint(Graph<E> g, int start) {
        boolean[] marked = new boolean[g.size()];
        depthFirstRecurse(g, start, marked);
    }

    public static <E> void depthFirstRecurse(Graph<E> g, int v, boolean[] marked) {
        int[] connections = g.neighbors(v);

        // mark the visit vertex in the 1-D array as "1" or true
        marked[v] = true;
        System.out.println(g.getLabel(v));

        // Traverse all the neighbors, looking for unmarked vertices:
        for(int nextNeighbor : connections) {
            if(!marked[nextNeighbor]) {
                depthFirstRecurse(g, nextNeighbor, marked);
            }
        }
    }
}
