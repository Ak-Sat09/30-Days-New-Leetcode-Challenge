public class Solution {
    public int[] topKFrequent(int[] arr, int k) {
       HashMap<Integer ,Integer> map = new HashMap<>();
       for(int i : arr){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparing(map::get));
       for(int i : map.keySet()){
        queue.add(i);
        if(queue.size() > k){
            queue.poll();
        }
       }
       int res[] = new int[k];
       for(int i=0; i<k; i++){
        res[i] = queue.poll();
       }
       return res;
    }
}
