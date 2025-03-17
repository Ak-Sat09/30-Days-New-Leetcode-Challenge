public class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> list = new HashSet<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while(i<arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
      return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
