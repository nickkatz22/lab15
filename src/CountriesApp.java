import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by nickk on 4/24/2017.
 */
public class CountriesApp {
    public static void main(String[] args) {
        int userInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the countries database!");
        do {
            System.out.println("Press 1: See list of countries. Press 2: Add five countries to the list! 3-9 if you want to exit!");
            userInput = scan.nextInt();
            scan.nextLine();
            if (userInput == 1) {
                readFromFile();
            } else if (userInput == 2) {
                writeToFile(scan);
            }
        } while (userInput == 1 || userInput == 2);
        System.out.println("Bye");


        String fileString = "countries.txt";
        String dirString = "Countries";

        createDirectory(dirString);

        createFile(dirString, fileString);

        writeToFile(scan);

        readFromFile();



    }


    public static void readFromFile() {
        Path filePath = Paths.get("Countries/countries.txt");
        File textFile = filePath.toFile();
        try {
            FileReader r = new FileReader(textFile);
            BufferedReader reader = new BufferedReader(r);
            try {
                String line = reader.readLine();

                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(Scanner s) {
        System.out.println("Country 1: ");
        String count1 = s.nextLine();
        System.out.println("Country 2: ");
        String count2 = s.nextLine();
        System.out.println("Country 3: ");
        String count3 = s.nextLine();
        System.out.println("Country 4: ");
        String count4 = s.nextLine();
        System.out.println("Country 5: ");
        String count5 = s.nextLine();
        CountriesTextFile countriesTextFile = new CountriesTextFile(count1, count2,count3, count4, count5);
        Path testPath = Paths.get("Countries/countries.txt");
        ;
        File testFiles = testPath.toFile(); //Creates a file referance

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(testFiles, true));
            out.println(countriesTextFile);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void createFile(String dirString, String fileString) {
        Path filePath = Paths.get(dirString, fileString);
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                System.out.println("There was an error: " + e);

            }

        }
        System.out.println("File Name: " + filePath.getFileName());
        System.out.println("Absolute Path: " + filePath.toAbsolutePath());
        System.out.println("Is writeable: " + Files.isWritable(filePath));
    }

    public static void createDirectory(String dirString) {
        Path dirPath = Paths.get(dirString);

        if (Files.notExists(dirPath)) {
            try {
                Files.createDirectories(dirPath);
            } catch (IOException e) {
                // e.printStackTrace(); THe sout provides a more userFriendly alternative if an error occurs
                System.out.println("There was an error: " + e);
            }
        }
    }
}

