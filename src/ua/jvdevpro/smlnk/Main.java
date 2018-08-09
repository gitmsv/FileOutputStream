package ua.jvdevpro.smlnk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String str = "Hello Serg!";
        byte[] mass = str.getBytes();

        // Создание объекта типа FileOutputStream;
        FileOutputStream f = null;

        try {
            f = new FileOutputStream("a.txt");

            try {
                f.write(mass); // Запись байтового массива в файл;

            } catch (IOException e) {
                System.out.println("I/O Error");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Закрытие файла после записи;

        finally {
            try {
                f.close();
            } catch (IOException e) {
                System.out.println("Error close file");
            }
        }
    }
}
