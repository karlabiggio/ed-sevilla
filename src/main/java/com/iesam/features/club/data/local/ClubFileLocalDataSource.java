package com.iesam.features.club.data.local;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.features.club.domain.Club;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ClubFileLocalDataSource {


    /**
     * Esta clase la proporciona el profesor
     */

        private String nameFile = "club.txt";

        private Gson gson = new Gson();

        private final Type type = new TypeToken<Club>() {
        }.getType();


        public Club obtain(String id) {
            try {
                File myObj = new File(nameFile);
                if (!myObj.exists()) {
                    myObj.createNewFile();
                }
                Scanner myReader = new Scanner(myObj);
                if (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    myReader.close();
                    return gson.fromJson(data, type);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Ha ocurrido un error al obtener el listado.");
                throw new RuntimeException(e);
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error al crear el fichero.");
                throw new RuntimeException(e);
            }
            return null;
        }
        public void save(Club club){
            try {
                if(!Files.exists(Paths.get(nameFile))){
                    Files.createFile(Paths.get(nameFile));
                }

            }catch (IOException e){
                System.out.println("no se guardo correctamente");
            }
        }

        public void clear() {
            try {
                FileWriter myWriter = new FileWriter(nameFile);
                myWriter.write("");
                myWriter.close();
                System.out.println("Datos guardados correctamente");
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error al guardar la información.");
            }
        }
    }

