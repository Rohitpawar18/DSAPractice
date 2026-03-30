import java.util.*;
class MyHashMap{
    private int[] hashMap;

    public MyHashMap(){
        hashMap = new int[1000001];
        Arrays.fill(hashMap, -1);
    }

    public void put(int key, int value){
        hashMap[key] = value;
    }

    public int get(int key){
        return hashMap[key];
    }

    public void remove(int key){
        hashMap[key] = -1;
    }
}
public class DesignHashMap{
    public static void main(String[] args) {
        MyHashMap obj = new MyHashMap();

        //Input simulation
        String[] operations = {"MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"};
        int[][] values = {
            {}, {1,1}, {2,2}, {1}, {3}, {2,11}, {2}, {2}, {2}
        };

        List<Object> output = new ArrayList<>();

        for(int i = 0; i < operations.length; i++){
            String op = operations[i];

            switch(op){
                case "MyHashMap":
                    output.add(null);
                    break;
                
                case "put":
                    obj.put(values[i][0], values[i][1]);
                    output.add(null);
                    break;
                
                case "get":
                    output.add(obj.get(values[i][0]));
                    break;
                
                case "remove":
                    obj.remove(values[i][0]);
                    output.add(null);
                    break;
            }
        }

        System.out.println(output);
    }
}