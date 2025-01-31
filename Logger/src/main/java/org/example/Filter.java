package org.example;

import java.util.ArrayList;
import java.util.List;


class Filter {
    private int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int value : source) {
            if (value >= threshold) {
                result.add(value);
                logger.log("Элемент \"" + value + "\" проходит");
            } else {
                logger.log("Элемент \"" + value + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}