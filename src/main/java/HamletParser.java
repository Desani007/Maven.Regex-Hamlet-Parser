import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

    public  String replaceHamelt(){
        getHamletData().toLowerCase();

  hamletData=getHamletData().replaceAll("Hamlet","Leon");
        return hamletData;
    }

    public  String replaceTariq(){
        getHamletData().toLowerCase();
        hamletData=getHamletData().replaceAll("Horatio","Tariq");
        return  hamletData;
    }

    public boolean findHoratio () {
        getHamletData().toLowerCase();
        return getHamletData().contains("Horatio");
    }
    public boolean findHamlet () {
        getHamletData().toLowerCase();
        return getHamletData().contains("Hamlet");
    }



}
