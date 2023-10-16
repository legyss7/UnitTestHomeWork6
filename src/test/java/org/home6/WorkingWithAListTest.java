package org.home6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorkingWithAListTest {

    private List<Integer> listOne;
    private List<Integer> listTwo;

    WorkingWithAList workingWithAList;

    /**
     * initialRandomList(int sizeListOne, int sizeListTwo,
     *                                   int minListOne, int maxListOne,
     *                                   int minListTwo, int maxListTwo)
     */
    @Test
    void testInitialRandomList() {
        workingWithAList = new WorkingWithAList();
        workingWithAList.initialRandomList(2, 0, 10);
        assertTrue(workingWithAList.getListNumbersOne().size() == 2,
                "Ошибка: Длина сгенерированного листа A не равна заданной");
        assertTrue(workingWithAList.getListNumbersTwo().size() == 2,
                "Ошибка: Длина сгенерированного листа В не равна заданной");
        assertTrue(workingWithAList.getListNumbersOne() !=
                        workingWithAList.getListNumbersTwo(),
                "Ошибка: Сгенерированные рандомно списки равны");
    }

    /**
     * Double averageValue(List<Integer> listNumbers)
     */
    @Test
    void testAverageValue() {
        listOne = new ArrayList<>();
        listOne.add(-1);
        listOne.add(3);
        workingWithAList = new WorkingWithAList();
        assertEquals(workingWithAList.averageValue(listOne), 1);
    }

    /**
     * ComparisonOfAverages()
     * listA == listB
     * listA > listB
     * listA < listB
     */
    @Test
    void testAEquallyBComparisonOfAverages() {
        listOne = new ArrayList<>();
        listTwo = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listTwo.add(6);
        listTwo.add(-3);
        workingWithAList = new WorkingWithAList(listOne, listTwo);
        assertEquals(workingWithAList.comparisonOfAverages(),
                "Средние значения равны");
    }
    @Test
    void testAMoreBComparisonOfAverages() {
        listOne = new ArrayList<>();
        listTwo = new ArrayList<>();
        listOne.add(3);
        listOne.add(3);
        listTwo.add(2);
        listTwo.add(2);
        workingWithAList = new WorkingWithAList(listOne, listTwo);
        assertEquals(workingWithAList.comparisonOfAverages(),
                "Первый список имеет большее среднее значение");
    }
    @Test
    void testBMoreAComparisonOfAverages() {
        listOne = new ArrayList<>();
        listTwo = new ArrayList<>();
        listOne.add(3);
        listOne.add(-3);
        listTwo.add(2);
        listTwo.add(2);
        workingWithAList = new WorkingWithAList(listOne, listTwo);
        assertEquals(workingWithAList.comparisonOfAverages(),
                "Второй список имеет большее среднее значение");
    }

    /**
     * SetListNumbersOne()
     * GetListNumbersOne()
     */
    @Test
    void testSetGetListNumbersOne() {
        workingWithAList = new WorkingWithAList();
        listOne = new ArrayList<>();
        listOne.add(2);
        listOne.add(2);
        workingWithAList.setListNumbersOne(listOne);
        assertEquals(workingWithAList.getListNumbersOne(), listOne);
    }

    /**
     * SetListNumbersTwo()
     * GetListNumbersTwo()
     */
    @Test
    void testSetGetListNumbersTwo() {
        workingWithAList = new WorkingWithAList();
        listTwo = new ArrayList<>();
        listTwo.add(2);
        listTwo.add(2);
        workingWithAList.setListNumbersTwo(listTwo);
        assertEquals(workingWithAList.getListNumbersTwo(), listTwo);
    }

    /**
     * PrintLists()
     */
    @Test
    void testPrintLists() {
        listOne = new ArrayList<>();
        listTwo = new ArrayList<>();
        listOne.add(1);
        listOne.add(3);
        listTwo.add(2);
        listTwo.add(2);
        workingWithAList = new WorkingWithAList(listOne, listTwo);
        assertEquals(workingWithAList.printLists(), "[1, 3]\n[2, 2]");
    }
}