package Hwsommerr;

import com.github.javafaker.Faker;

import java.util.*;

public class Generator {
//    private static final Random random = new Random();


    public static Car generateCar() {
        Random rd = new Random();
        int randomIndex = rd.nextInt(Color.values().length);
        Color color = Color.values()[randomIndex];
        int sportCar = rd.nextInt(10);

        boolean isSport;
        if (sportCar > 6) {
            isSport = true;
        } else {
            isSport = false;
        }

        int randomSpeed;
        if (isSport) {
            randomSpeed = rd.nextInt(220, 391);
        } else {
            randomSpeed = rd.nextInt(180, 221);
        }

        Brand brand = Brand.values()[rd.nextInt(Brand.values().length)];
        return new Car(color, isSport, brand, randomSpeed);
    }


//    public static Car generateCar() {
//        Color color = Color.values()[random.nextInt(Color.values().length)];
//        boolean isSportCar = random.nextBoolean();
//
//        int maxSpeed = random.nextInt(300) + 100; // Максимальная скорость от 100 до 400 км/ч
//        return new Car(color, isSportCar, brand, maxSpeed);
//    }

    private static char getGenderByName(String name) {
        List<Character> genderName = Arrays.asList('a', 'e', 'u');
        if (genderName.contains(name.charAt(name.length() - 1))) {
            return 'F';
        } else {
            return 'M';
        }
    }


    public static Developer generateDeveloper() {

        Faker faker = new Faker(new Locale("en-US"));


        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        char gender = getGenderByName(firstName);

        int salary = new Random().nextInt(5000, 35001);

        return new Developer(firstName, lastName, salary, gender, generateCar());
    }

    public static List<Developer> generateDeveloperList(Integer i) {
        List<Developer> dev = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            dev.add(generateDeveloper());
        }
        return dev;
    }
}

