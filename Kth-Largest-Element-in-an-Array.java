class Solution {
    public int findKthLargest(int[] arr, int k) {
       PriorityQueue<Integer> queue = new PriorityQueue<>(); // Min Heap
        
        for (int i : arr) {
            queue.add(i);
            if (queue.size() > k) {
                queue.poll(); // Remove smallest element to maintain top k elements
            }
        }
        return queue.peek();
    }

}