package cn.school.thoughtworks.section3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
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
            if (foldedCollection.get(string) == null) {
                foldedCollection.put(string, 1);
                continue;
            }
            foldedCollection.put(string, foldedCollection.get(string) + 1);
        }
        return foldedCollection;
    }

    private void updateCollectionValue(Map<String, Integer> foldedCollection, String key) {
        Integer originalValue = foldedCollection.get(key);
        Integer destinationValue = originalValue - originalValue / 3;
        foldedCollection.put(key, destinationValue);
    }
}
