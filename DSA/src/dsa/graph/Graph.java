package dsa.graph;

public class Graph {
//	int noOfVertices;
//	List<List<Integer>> adjacencyList;
//
//	public Graph(int noOfVertices) {
//		this.noOfVertices = noOfVertices;
//		adjacencyList = new ArrayList<>();
//
//		for (int i = 0; i < noOfVertices; i++) {
//			adjacencyList.add(new ArrayList<>());
//		}
//	}
//
//	public void addEdge(int x, int y) {
//		adjacencyList.get(x).add(y);
//		adjacencyList.get(y).add(x);
//	}
	int noOfVertices;
	int[][] matrix = new int[noOfVertices][noOfVertices];

	public Graph(int noOfVertices) {
		super();
		this.noOfVertices = noOfVertices;
		this.matrix = new int[noOfVertices][noOfVertices];
	}

	public void addEdge(int source, int destination) {
		matrix[source][destination] = 1;
		matrix[destination][source] = 1; // Creates the mutual/reverse path
	}

//	public void display() {
//		for (int i = 0; i < adjacencyList.size(); i++) {
//			System.out.print(i + "->  ");
//			List<Integer> inheritList = adjacencyList.get(i);
//			for (int neighbour : inheritList) {
//				System.out.print(neighbour + " ");
//			}
//			System.out.println();
//		}
//	}
	public void display() {
		for (int i = 0; i < noOfVertices; i++) {
			for (int j = 0; j < noOfVertices; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

//	public void dfs(int startVertex) {
//		System.out.println("Depth First Search.......");
//		boolean[] visited = new boolean[noOfVertices];
//		dfs(startVertex, visited);
//	}

//	private void dfs(int vertex, boolean[] visited) {
//		visited[vertex] = true;
//		System.out.print("-> " + vertex + " ");
//		for (int neighbour : adjacencyList.get(vertex)) {
//			if (!visited[neighbour])
//				dfs(neighbour, visited);
//		}
//
//	}
//
//	public void dfsIterative(int startVertex) {
//		Deque<Integer> stackDeque = new ArrayDeque<Integer>();
//		boolean visited[] = new boolean[noOfVertices];
//		stackDeque.push(startVertex);
//
//		while (!stackDeque.isEmpty()) {
//			int vertex = stackDeque.pop();
//			if (!visited[vertex]) {
//				visited[vertex] = true;
//				System.out.print(vertex + " ");
//
////				for (int neighbour : adjacencyList.get(vertex)) {
////					if (!visited[neighbour])
////						stackDeque.push(neighbour);
////				}
//				for (int i = adjacencyList.get(vertex).size() - 1; i >= 0; i--) {
//					int neighbor = adjacencyList.get(vertex).get(i);
//					if (!visited[neighbor])
//						stackDeque.push(neighbor);
//				}
//			}
//		}
//
//	}

	public static void main(String[] args) {
		int vertex = 8;

		Graph graph = new Graph(vertex);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);
		graph.display();

		// Graph graph = new Graph(vertex);
//		graph.addEdge(0, 1);
//		graph.addEdge(0, 2);
//		graph.addEdge(1, 3);
//		graph.addEdge(2, 4);
//		graph.addEdge(4, 6);
//		graph.addEdge(6, 7);
//		graph.addEdge(3, 5);
//		graph.addEdge(4, 5);
//
//		graph.display();
//		graph.dfs(0);
//		System.out.println();
//		graph.dfsIterative(0);
	}
}
