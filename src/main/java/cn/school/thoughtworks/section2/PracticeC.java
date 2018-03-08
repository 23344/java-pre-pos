package cn.school.thoughtworks.section2;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        List<String> list = transformOriginCollection(collection1);
        Map<String, Integer> result = new HashMap<>();
        for (String s : list) {
            Integer count = Collections.frequency(list, s);
            result.put(s, count);
        }

        return result;
    }

    private List<String> transformOriginCollection(List<String> collection1) {
        List<String> specialElementList = collection1.stream().filter(e -> e.length() > 1).collect(Collectors.toList());
        List<String> result = new ArrayList<>(collection1.stream().filter(e -> e.length() == 1).collect(Collectors.toList()));
        for (String s : specialElementList) {
            String value = getValue(s);
            int count = countAmount(s);
            pushElementInList(value, count, result);
        }

        return result;
    }

    private void pushElementInList(String value, int count, List<String> list) {
        for (int i = 0; i < count; i++) {
            list.add(value);
        }
    }

    private Integer countAmount(String s) {
        if (s.contains("-") || s.contains(":")) {
            return Integer.valueOf(s.split("-|:")[1]);
        }

        return Integer.parseInt(s.split("\\[")[1].split("]")[0]);
    }

    private String getValue(String s) {
        if (s.contains("-") || s.contains(":")) {
            return s.split("-|:")[0];
        }

        return s.split("\\[")[0];
    }
}
