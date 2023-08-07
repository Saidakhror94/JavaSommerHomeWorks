package Hwsommerr;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> devList = Generator.generateDeveloperList(10);

        Handler.groupCarsByGender(devList).forEach((key, value) ->
                {
                    System.out.println(key);
                    value.forEach(System.out::println);
                }
        );

//      //  System.out.println();

     //   Handler.printMaleDeveloperWithSportCars(devList);

    }

}
