class MinStack {
Stack<Integer> normalst;
Stack<Integer> minst;
    public MinStack() {
        normalst=new Stack<>();
        minst= new Stack<>();
    }
    
    public void push(int value) {
        normalst.push(value);
        if(minst.isEmpty() || minst.peek()>=value){
            minst.push(value);
        }
    }
    
    public void pop() {
        int temp= normalst.pop();
        if(temp==minst.peek()){
            minst.pop();
        }
    }
    
    public int top() {
        return normalst.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */