public class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i : arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : arr2){
            if(map.containsKey(i)){
                list.add(i);
                map.remove(i);
            }
        }
     
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
