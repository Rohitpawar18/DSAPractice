import java.util.*;

class MyQueue{
    
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue(){}

    public void push(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int pop(){
        return s1.pop();
    }

    public int peek(){
        return s1.peek();
    }

    public boolean empty(){
        return s1.isEmpty();
    }
}
public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        
        MyQueue obj = new MyQueue();

        String[] operations = {"MyQueue", "push", "push", "pop", "push", "peek", "push", "pop", "peek"};
        int[][] values = {
            {},{1},{2},{},{3},{},{4},{},{}
        };

        List<Object> output = new ArrayList<>();

        for(int i = 0; i < operations.length; i++){
            String op = operations[i];

            switch(op){
                case "MyQueue":
                    output.add(null);
                    break;
                
                case "push":
                    obj.push(values[i][0]);
                    output.add(null);
                    break;

                case "peek":
                    output.add(obj.peek());
                    break;

                case "pop":
                    output.add(obj.pop());
                    break;
                
                case "empty":
                    output.add(obj.empty());
                    break;
            }
        }

        System.out.println(output);
    }
}
