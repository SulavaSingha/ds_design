import java.util.LinkedList;

public class LinkedHash {
    LinkedList<Integer> bucketList;
    public LinkedHash(){
        this.bucketList = new LinkedList<>();
    }
    public void insert(int key){
        if(this.bucketList.isEmpty()){
            this.bucketList.addFirst(key);
        }
        else if(!this.bucketList.contains(key)){
            this.bucketList.add(key);
        }

    }
    public void remove(Integer key){
        if(!this.bucketList.isEmpty()){
            this.bucketList.remove(key);
        }
    }
    public boolean containsKey(Integer key){
        if(!this.bucketList.isEmpty()){
            return this.bucketList.contains(key);
        }
        return false;
    }
}
