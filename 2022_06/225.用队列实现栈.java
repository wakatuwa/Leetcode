/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
	//用两个队列实现栈的方法
	//每次压栈的时候，先把新的元素放到q2，在把q1所有的元素从头接入到q2
	//此时q2队首是新元素，其他的元素是q1,
	//然后再把q1和q2互换
	//这时要队首元素就是新元素，对栈顶元素操作就是对队首操作
	Queue<Integer> queue1;
	Queue<Integer> queue2;

    public MyStack() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
		queue2.offer(x);
		while(!queue1.isEmpty()){
			queue2.offer(queue1.poll());
		}
		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
    }
    
    public int pop() {
		return queue1.poll();
    }
    
    public int top() {
		return queue1.peek();
    }
    
    public boolean empty() {
		return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

