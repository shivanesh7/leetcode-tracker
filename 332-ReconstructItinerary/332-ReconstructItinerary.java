// Last updated: 7/9/2026, 9:49:49 AM
class Solution {
    Map<String, PriorityQueue<String>> map=new HashMap<>();
    LinkedList<String> ans=new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> t:tickets)
            map.computeIfAbsent(t.get(0),k->new PriorityQueue<>()).offer(t.get(1));

        dfs("JFK");
        return ans;
    }

    void dfs(String src){
        PriorityQueue<String> pq=map.get(src);
        while(pq!=null&&!pq.isEmpty())
            dfs(pq.poll());
        ans.addFirst(src);
    }
}