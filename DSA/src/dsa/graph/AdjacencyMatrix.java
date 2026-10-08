package dsa.graph;

public class AdjacencyMatrix {
	int noOfVertices;
	int[][] matrix = new int[noOfVertices][noOfVertices];

	public AdjacencyMatrix(int noOfVertices) {
		super();
		this.noOfVertices = noOfVertices;
		this.matrix = new int[noOfVertices][noOfVertices];
	}

	public void addEdge(int source, int destination) {
		matrix[source][destination] = 1;
		matrix[destination][source] = 1; // Creates the mutual/reverse path
	}

	public void display() {
		for (int i = 0; i < noOfVertices; i++) {
			for (int j = 0; j < noOfVertices; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int vertices = 6;
		AdjacencyMatrix graph = new AdjacencyMatrix(vertices);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);
		graph.display();

	}
}
