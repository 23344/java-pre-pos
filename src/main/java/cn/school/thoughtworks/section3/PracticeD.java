package cn.school.thoughtworks.section3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> foldedCollection = foldCollection(collectionA);

        List<String> keys = object.get("value");
        for (String key: keys) {
            updateCollectionValue(foldedCollection, key);
        }

        return foldedCollection;
    }

    private Map<String, Integer> foldCollection(List<String> collectionA) {
        Map<String, Integer> foldedCollection = new HashMap<>();
        for (String string: collectionA) {
            String[] components = string.split("-");
            Integer newCount = components.length > 1 ? new Integer(components[1]) : 1;
            String key = components[0];
            Integer count = foldedCollection.get(key) == null ? newCount : foldedCollection.get(key) + newCount;
            foldedCollection.put(key, count);
        }
        return foldedCollection;
    }

    private void updateCollectionValue(Map<String, Integer> foldedCollection, String key) {
        Integer originalValue = foldedCollection.get(key);
        Integer destinationValue = originalValue - originalValue / 3;
        foldedCollection.put(key, destinationValue);
    }
}
