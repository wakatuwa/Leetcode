/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {
	//这题与225刚好是一对
	//利用两个栈来实现,定义一个队首变量front
	//push操作，当s1为空时，直接将把新元素推入到s2，再把元素推入到s1
	//当s1不为空时，先把s1元素取出放入s2，这时s2栈顶是s1栈底，s2栈底是s1栈顶
	//再把新元素放到s2栈顶，最后再把s2元素依次压到s1中，这时新元素就跑到了s1栈底，满足队列

	//pop操作，直接弹出，并把弹出的元素赋给front
	//peek操作，返回front
	private Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2 = new Stack<>();
	private int front;//代表队首
    public MyQueue() {

    }
    
    public void push(int x) {
		if(s1.isEmpty()){
			front = x;
		}
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		s2.push(x);
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
    }
    
    public int pop() {
		s1.pop();
		return s1.peek();
    }
    
    public int peek() {
		return front;
    }
    
    public boolean empty() {
		return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

