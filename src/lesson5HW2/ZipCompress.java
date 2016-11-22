package lesson5HW2;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZipCompress {


    public static void main(String[] args) {

        List audioList = new ArrayList();
        List imageList = new ArrayList();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter path of directory");
        String path = scan.nextLine();
        File dirToZip = new File(path);

        if (!dirToZip.exists()) {
            System.out.println("\nNot found: " + path);
            System.exit(0);
        }

        if (!dirToZip.isDirectory()) {
            System.out.println(
                    "\nNot directory: " + path);
            System.exit(0);
        }

        String[] filesList = dirToZip.list();
        int i;
        for (i = 0; i < filesList.length; i++) {

            File f = new File(path + File.pathSeparator + filesList[i]);

            if (f.isFile()) {
                String fName = f.getName();

                if (fName.endsWith("mp3")) {
                    audioList.add(f);
                }
                else if (fName.endsWith("jpg")) {
                    imageList.add(f);
                }
            }
        }

    }
}
