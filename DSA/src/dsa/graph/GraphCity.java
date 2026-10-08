package dsa.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphCity {
	private Map<String, List<String>> adjacencyList;

	public GraphCity() {
		super();
		this.adjacencyList = new HashMap<>();
	}

	public void addConnection(String source, String destination) {
		adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
		adjacencyList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
	}

	public void dfs(String startVertex) {
		System.out.println("Traversing graph using DFS......");
		Set<String> visited = new HashSet<String>();
		dfs(startVertex, visited);

	}

	private void dfs(String source, Set<String> visited) {
		visited.add(source);
		System.out.print(source + "-> ");
		List<String> neighbours = adjacencyList.get(source);
		for (String neighbour : neighbours) {
			if (!visited.contains(neighbour)) {
				dfs(neighbour, visited);
			}
		}

	}

	public static void main(String[] args) {
		GraphCity graph = new GraphCity();
		graph.addConnection("Pune", "Mumbai");
		graph.addConnection("Amrvati", "Nagpur");
		graph.addConnection("Mumbai", "Indore");
		graph.addConnection("Pune", "Hyd");
		graph.addConnection("Hyd", "Blr");

		graph.dfs("Indore");
	}

}
