package org.home6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class WorkingWithAList {
    private List<Integer> listNumbersOne;
    private List<Integer> listNumbersTwo;

    public WorkingWithAList(List<Integer> listNumbersOne, List<Integer> listNumbersTwo) {
        this.listNumbersOne = listNumbersOne;
        this.listNumbersTwo = listNumbersTwo;
    }
    public WorkingWithAList() {
        this.listNumbersOne = new ArrayList<>();
        this.listNumbersTwo = new ArrayList<>();
    }
    public void initialRandomList(int sizeList,
                                  int minList, int maxList) {
        Random random = new Random();
        for (int i = 0; i < sizeList; i++) {
            listNumbersOne.add(random.nextInt(minList, maxList));
            listNumbersTwo.add(random.nextInt(minList, maxList));
        }
    }
    public Double averageValue(List<Integer> listNumbers) {
        return listNumbers.stream().mapToInt(a->a).average().orElse(0);
    }
    public String comparisonOfAverages() {
        Double numberOne = averageValue(listNumbersOne);
        Double numberTwo = averageValue(listNumbersTwo);
        if((int)((Double.doubleToRawLongBits(
                numberOne - numberTwo)) >> 63) + 1
                == (int)((Double.doubleToRawLongBits(
                numberTwo - numberOne)) >> 63) + 1) {
            return "Средние значения равны";
        } else if ((int)((Double.doubleToRawLongBits(
                numberOne - numberTwo)) >> 63) + 1 == 1) {
            return "Первый список имеет большее среднее значение";
        } else {
            return "Второй список имеет большее среднее значение";
        }
    }

    public List<Integer> getListNumbersOne() {
        return listNumbersOne;
    }

    public List<Integer> getListNumbersTwo() {
        return listNumbersTwo;
    }

    public void setListNumbersOne(List<Integer> listNumbersOne) {
        this.listNumbersOne = listNumbersOne;
    }

    public void setListNumbersTwo(List<Integer> listNumbersTwo) {
        this.listNumbersTwo = listNumbersTwo;
    }
    public String printLists() {
        return listNumbersOne.toString() + "\n" +
                listNumbersTwo.toString();
    }
}
