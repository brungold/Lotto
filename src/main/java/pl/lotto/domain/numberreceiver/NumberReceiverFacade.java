package pl.lotto.domain.numberreceiver;

import java.util.List;
import java.util.Set;

public class NumberReceiverFacade {

    public String inputNumbers(Set<Integer> numbersFromUser) {
        List<Integer> filteredNumbers = filteredAllNumbersInRange(numbersFromUser);
        if (areAllNumbersInRange(filteredNumbers)) {
            return "success";
        }
        return "failed";
    }

    private static List<Integer> filteredAllNumbersInRange(Set<Integer> numbersFromUser) {
        return numbersFromUser.stream()
                .filter(number -> number >= 1)
                .filter(number -> number <= 99)
                .toList();
    }

    private boolean areAllNumbersInRange(List<Integer> filteredNumbers) {
        return filteredNumbers.size() == 6;
    }
}
