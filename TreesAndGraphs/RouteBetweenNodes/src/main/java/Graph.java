public class Graph<E> implements Cloneable {
    // n x n 2-dimensional array
    private boolean edges[][];
    private Object[] labels;

    public Graph(int n) {
        edges = new boolean[n][n];
        labels = new Object[n];
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

        // First count how many edges have the vertex as their source
        count = 0;
        for(i=0; i < labels.length; i++) {
            if (edges[vertex][i])
                count++;
        }

        // Allocate the array for the answer
        answer = new int[count];

        // Fill the array for the answer
        count = 0;
        for (i = 0; i < labels.length; i++) {
            if(edges[vertex][i])
                answer[count++] = i;
        }

        return answer;
    }

    public static <E> void depthFirstPrint(Graph<E> g, int start) {
        boolean[] marked = new boolean[g.size()];
        depthFirstRecurse(g, start, marked);
    }

    public static <E> void depthFirstRecurse(Graph<E> g, int v, boolean[] marked) {
        int[] connections = g.neighbors(v);
        int i;

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
