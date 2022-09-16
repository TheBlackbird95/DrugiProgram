package com.bootcamp.nedelja4OOP;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class IspisUFajl {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String roba = "12312, Meso-Piletina, 0.5kg";
        FileOutputStream stream = new FileOutputStream(LocalDateTime.now().toString().replaceAll(":",".") + ".txt", true);
        stream.write(roba.getBytes());
    }
}
