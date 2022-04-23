public class MyHashSet {
    LinkedHash[] bucket ;
    int keyRange;
    public MyHashSet() {
        keyRange=769;
        bucket = new LinkedHash[keyRange];
        for(int i=0;i<keyRange;i++){
            bucket[i]=new LinkedHash();
        }
    }
    public int hash(int key){
        return key% keyRange;
    }

    public void add(int key) {
        int index=hash(key);
        LinkedHash linkedHash=bucket[index];
        linkedHash.insert(key);
    }

    public void remove(int key) {
        int index=hash(key);
        LinkedHash linkedHash=bucket[index];
        linkedHash.remove(key);
    }

    public boolean contains(int key) {
        int index=hash(key);
        LinkedHash linkedHash=bucket[index];
        return linkedHash.containsKey(key);
    }
}
