package com.example.covid19;

import com.example.covid19.model.Covid19;
import com.example.covid19.util.Sorting;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class SortingTest {

    @Mock
    private Covid19 covid191;
    @Mock
    private Covid19 covid192;
    @Mock
    private Covid19 covid193;
    @Mock
    private Covid19 covid194;
    @Mock
    private Covid19 covid195;


    @Test
    public void test_sortCovid19List() {

        when(covid191.getCases()).thenReturn(1);
        when(covid192.getCases()).thenReturn(2);
        when(covid193.getCases()).thenReturn(3);
        when(covid194.getCases()).thenReturn(4);
        when(covid195.getCases()).thenReturn(5);

        System.out.println(covid191.getCases());

        assertThat(Sorting.sortCovid19List(Arrays.asList(covid195, covid193, covid192, covid194, covid191)), hasSize(5));

    }
}
