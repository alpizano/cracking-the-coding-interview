public class RoutesBetweenNodes {

    public static void main (String[] args) {
        System.out.println("Hello world");

        Graph<String> t = new Graph<String>(7);

        t.setLabel(0, "v0"); // Provides vertex number 0 with label of "v0"
        t.setLabel(1, "v1"); // Provides vertex number 1 with label of "v1"
        t.setLabel(2, "v2"); // Provides vertex number 1 with label of "v2"
        t.setLabel(3, "v3"); // Provides vertex number 1 with label of "v3"
        t.setLabel(4, "v4"); // Provides vertex number 1 with label of "v4"
        t.setLabel(5, "v5"); // Provides vertex number 1 with label of "v5"
        t.setLabel(6, "v6"); // Provides vertex number 1 with label of "v6"

        t.addEdge(0,1); // Adds an edge from vertex 1 to vertex 0
        t.addEdge(1,3); // Adds an edge from vertex 1 to vertex 0
        t.addEdge(3,0); // Adds an edge from vertex 1 to vertex 0
        t.addEdge(0,4); // Adds an edge from vertex 1 to vertex 0
        t.addEdge(2,0); // Adds an edge from vertex 1 to vertex 0
        t.addEdge(6,1); // Adds an edge from vertex 1 to vertex 0
        t.addEdge(3,6); // Adds an edge from vertex 1 to vertex 0
        t.addEdge(3,5); // Adds an edge from vertex 1 to vertex 0

        Graph.depthFirstPrint(t,0);
    }
}
