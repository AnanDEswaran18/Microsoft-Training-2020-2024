class MedianFinder {
    
    private PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> min=new PriorityQueue<>();
    private boolean Even=true;
    
    public void addNum(int num) {
        if(Even){
            min.offer(num);
            max.offer(min.poll());
        }
        else{
            max.offer(num);
            min.offer(max.poll());
        }
        Even=!Even;
    }
    
    public double findMedian() {
        if(Even){
            return (max.peek()+min.peek())/2.0;
        }
        else{
            return max.peek();
        }
    }
}
