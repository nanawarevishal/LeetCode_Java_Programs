package Stack.Medium;

import java.util.Stack;

class pairElement{
    int x;
    int y;

    pairElement(int x,int y){
        this.x = x;
        this.y = y;
    }
}

class MinStack {

    static Stack<pairElement>st;
    
    MinStack(){
        st = new Stack<>();
    }

    static void push(int val) {
        int min;
        if(st.isEmpty()){
            min = val;
        }

        else{
            min = Math.min(st.peek().y, val);
        }

        st.push(new pairElement(val, min));
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().x;
    }

    public int getMin() {
        return st.peek().y;
    }
    
}
