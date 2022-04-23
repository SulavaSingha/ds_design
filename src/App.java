public class App {
    public static void main(String[] args){
    MyHashSet myHashSet = new MyHashSet();
    myHashSet.add(1);
    myHashSet.add(2);
    myHashSet.contains(1);
    myHashSet.contains(3);
    myHashSet.add(2);
    myHashSet.contains(2);
    myHashSet.remove(2);
    myHashSet.contains(2);
    }
    /*
    ["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
     */
}
