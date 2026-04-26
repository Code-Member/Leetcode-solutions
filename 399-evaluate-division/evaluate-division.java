import java.util.*;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        // Step 1: Build graph
        Map<String, Map<String, Double>> graph = new HashMap<>();
        
        for (int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            double val = values[i];
            
            graph.putIfAbsent(u, new HashMap<>());
            graph.putIfAbsent(v, new HashMap<>());
            
            graph.get(u).put(v, val);
            graph.get(v).put(u, 1.0 / val);
        }
        
        // Step 2: Process queries
        double[] result = new double[queries.size()];
        
        for (int i = 0; i < queries.size(); i++) {
            String src = queries.get(i).get(0);
            String dest = queries.get(i).get(1);
            
            if (!graph.containsKey(src) || !graph.containsKey(dest)) {
                result[i] = -1.0;
            } else if (src.equals(dest)) {
                result[i] = 1.0;
            } else {
                Set<String> visited = new HashSet<>();
                result[i] = dfs(graph, src, dest, 1.0, visited);
            }
        }
        
        return result;
    }
    
    private double dfs(Map<String, Map<String, Double>> graph, 
                       String curr, String target, 
                       double product, Set<String> visited) {
        
        if (curr.equals(target)) return product;
        
        visited.add(curr);
        
        for (Map.Entry<String, Double> neighbor : graph.get(curr).entrySet()) {
            String next = neighbor.getKey();
            double value = neighbor.getValue();
            
            if (!visited.contains(next)) {
                double res = dfs(graph, next, target, product * value, visited);
                if (res != -1.0) return res;
            }
        }
        
        return -1.0;
    }
}