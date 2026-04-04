import java.util.*;
class MyStack{
    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public MyStack(){
        q1 = new LinkedList();
        q2 = new LinkedList();
    }

    public void push(int x) {
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }

    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        
        MyStack obj = new MyStack();

        String[] operations = {"MyStack", "push", "push", "top", "pop", "empty"};
        int[][] values = {
            {},{1},{2},{},{},{}
        };

        List<Object> output = new ArrayList<>();

        for(int i = 0; i < operations.length; i++){
            String op = operations[i];

            switch(op){
                case "MyStack":
                    output.add(null);
                    break;
                
                case "push":
                    obj.push(values[i][0]);
                    output.add(null);
                    break;
                case "pop":
                    output.add(obj.pop());
                    break;

                case "top":
                    output.add(obj.top());
                    break;
                
                case "empty":
                    output.add(obj.empty());
                    break;
            }
        }

        System.out.println(output);
    }
}
