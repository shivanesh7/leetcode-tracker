// Last updated: 7/9/2026, 9:49:20 AM
class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,List<Pair>> map=new HashMap<>();

        for(int i=0;i<equations.size();i++){
            String a=equations.get(i).get(0);
            String b=equations.get(i).get(1);
            map.computeIfAbsent(a,k->new ArrayList<>()).add(new Pair(b,values[i]));
            map.computeIfAbsent(b,k->new ArrayList<>()).add(new Pair(a,1.0/values[i]));
        }

        double[] ans=new double[queries.size()];

        for(int i=0;i<queries.size();i++){
            String src=queries.get(i).get(0);
            String dst=queries.get(i).get(1);
            ans[i]=dfs(src,dst,1.0,map,new HashSet<>());
        }

        return ans;
    }

    double dfs(String src,String dst,double val,Map<String,List<Pair>> map,Set<String> vis){
        if(!map.containsKey(src)) return -1.0;
        if(src.equals(dst)) return val;

        vis.add(src);

        for(Pair p:map.get(src)){
            if(!vis.contains(p.s)){
                double res=dfs(p.s,dst,val*p.v,map,vis);
                if(res!=-1.0) return res;
            }
        }

        return -1.0;
    }

    class Pair{
        String s;
        double v;
        Pair(String s,double v){
            this.s=s;
            this.v=v;
        }
    }
}
