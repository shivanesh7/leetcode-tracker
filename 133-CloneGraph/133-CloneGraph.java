// Last updated: 7/9/2026, 9:51:01 AM
class Solution {
    Map<Node,Node> map=new HashMap<>();
    
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        if(map.containsKey(node)) return map.get(node);
        
        Node copy=new Node(node.val);
        map.put(node,copy);
        
        for(Node nei:node.neighbors)
            copy.neighbors.add(cloneGraph(nei));
        
        return copy;
    }
}