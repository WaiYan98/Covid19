package com.example.covid19.util;

import com.annimon.stream.Stream;
import com.example.covid19.model.Covid19;
import java.util.List;

public class Sorting {

    public static List<Covid19> sortCovid19List(List<Covid19> covid19List) {

        List<Covid19> sortedCovid19List = Stream.of(covid19List)
                .sorted((o1, o2) -> Integer.compare(o2.getCases(), o1.getCases()))
                .collect(com.annimon.stream.Collectors.toList());

        return sortedCovid19List;
    }
}
