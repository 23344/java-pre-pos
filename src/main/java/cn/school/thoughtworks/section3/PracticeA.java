package cn.school.thoughtworks.section3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> keys = object.get("value");
        for (String key: keys) {
            updateCollectionValue(collectionA, key);
        }
        return collectionA;
    }

    private void updateCollectionValue(Map<String, Integer> collectionA, String key) {
        collectionA.put(key, collectionA.get(key) - 1);
    }
}
