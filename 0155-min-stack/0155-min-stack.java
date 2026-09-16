class MinStack {
Stack<Integer>normalstk;
Stack<Integer>minstk;
    public MinStack() {
        normalstk= new Stack<>();
        minstk= new Stack<>();
    }
    
    public void push(int value) {
        normalstk.push(value);
        if(minstk.isEmpty() || minstk.peek()>=value){
            minstk.push(value);
        }
    }
    
    public void pop() {
        int temp=normalstk.pop();
        if(temp==minstk.peek()){
            minstk.pop();
        }
    }
    
    public int top() {
        return normalstk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
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