//package Leetcode_Easy.Week_6;
//
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///**
// * @author ynz
// * create at 2020-06-03 00:03
// * @description:this is the class for
// **/
//
//public class LRUCache {
//    int capacity;
//    LinkedHashMap<Integer,Integer> hashMap;
//    public LRUCache(int capacity) {
//        this.capacity=capacity;
//        hashMap=new LinkedHashMap<Integer, Integer>(capacity,0.75f,true){
//            @Override
//            protected boolean removeEldestEntry(Map.Entry eldest){
//                return hashMap.size()>capacity;
//            }
//        };
//
//    }
//
//    public int get(int key) {
//        if(hashMap.containsKey(key)){
//            return hashMap.get(key);
//        }else {
//            return -1;
//        }
//
//    }
//
//    public void put(int key, int value) {
//        hashMap.put(key,value);
//    }
//}
