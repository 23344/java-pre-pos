package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> result = new ArrayList<>(collection1); //防止collection1被修改
        result.retainAll(collection2.get("value"));
        return result;
    }
}
