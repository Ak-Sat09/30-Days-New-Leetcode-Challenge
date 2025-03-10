class Solution {
    public int findKthLargest(int[] arr, int k) {
       PriorityQueue<Integer> queue = new PriorityQueue<>();

       for(int i : arr){
        queue.add(i);
        if(queue.size() > k)queue.poll();
       }
       return queue.peek();
    }
}