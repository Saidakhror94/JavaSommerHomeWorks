package Hwsommerr;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Handler {
    public static void printMaleDeveloperWithSportCars(List<Developer> developers) {
        developers.stream()
                .filter(developer -> developer.getGender() == 'M' && developer.getCar().isSportCar())
                .forEach(System.out::println);
    }

    public static Map<Character, List<Car>> groupCarsByGender(List<Developer> developers) {
        return developers.stream()
                .collect(Collectors.groupingBy(Developer::getGender,
                        Collectors.mapping(Developer::getCar, Collectors.toList())));

    }
}
