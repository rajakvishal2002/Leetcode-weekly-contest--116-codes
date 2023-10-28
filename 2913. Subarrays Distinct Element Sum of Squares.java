class Solution {
    public int sumCounts(List<Integer> arr) {
        int n = arr.size();
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            int distinctCount = 0;
            boolean[] visited = new boolean[101];
            
            for (int j = i; j < n; j++) {
                if (!visited[arr.get(j)]) {
                    visited[arr.get(j)] = true;
                    distinctCount++;
                }
                result += distinctCount * distinctCount;
            }
        }
        
        return result;
    }
}