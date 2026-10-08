package dsa.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Graph {
	int noOfVertices;
	List<List<Integer>> adjacencyList;

	public Graph(int noOfVertices) {
		this.noOfVertices = noOfVertices;
		adjacencyList = new ArrayList<>();

		for (int i = 0; i < noOfVertices; i++) {
			adjacencyList.add(new ArrayList<>());
		}
	}

	public void addEdge(int x, int y) {
		adjacencyList.get(x).add(y);
		adjacencyList.get(y).add(x);
	}

	public void display() {
		for (int i = 0; i < adjacencyList.size(); i++) {
			System.out.print(i + "->  ");
			List<Integer> inheritList = adjacencyList.get(i);
			for (int neighbour : inheritList) {
				System.out.print(neighbour + " ");
			}
			System.out.println();
		}
	}

	public void dfs(int startVertex) {
		System.out.println("Depth First Search.......");
		boolean[] visited = new boolean[noOfVertices];
		dfs(startVertex, visited);
	}

	private void dfs(int vertex, boolean[] visited) {
		visited[vertex] = true;
		System.out.print("-> " + vertex + " ");
		for (int neighbour : adjacencyList.get(vertex)) {
			if (!visited[neighbour])
				dfs(neighbour, visited);
		}

	}

	public void dfsIterative(int startVertex) {
		Deque<Integer> stackDeque = new ArrayDeque<Integer>();
		boolean visited[] = new boolean[noOfVertices];
		stackDeque.push(startVertex);

		while (!stackDeque.isEmpty()) {
			int vertex = stackDeque.pop();
			if (!visited[vertex]) {
				visited[vertex] = true;
				System.out.print(vertex + " ");

				for (int neighbour : adjacencyList.get(vertex)) {
					if (!visited[neighbour])
						stackDeque.push(neighbour);
				}
				for (int i = adjacencyList.get(vertex).size() - 1; i >= 0; i--) {
					int neighbor = adjacencyList.get(vertex).get(i);
					if (!visited[neighbor])
						stackDeque.push(neighbor);
				}
			}
		}

	}

	public void bfs(int startVertex) {

		Deque<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[noOfVertices];

		queue.add(startVertex);
		visited[startVertex] = true;
		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			System.out.print(vertex + " ");
			for (int neighbour : adjacencyList.get(vertex)) {
				if (!visited[neighbour]) {
					visited[neighbour] = true;
					queue.add(neighbour);
				}
			}
		}
	}

	public static void main(String[] args) {
		int vertices = 8;
		int vertex = 0;
		Graph graph = new Graph(vertices);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 6);
		graph.addEdge(6, 7);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);

		graph.display();
		graph.dfs(0);
		System.out.println();
		System.out.println("DFS by Iterative...");
		graph.dfsIterative(0);
		System.out.println();
		System.out.println("BFS.......");
		graph.bfs(vertex);
	}
}
