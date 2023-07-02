package coreHw5.tsk1;

import java.io.*;

public class SaveFile {
    public static void copyDirectory() throws IOException {
        File srcFolder = new File("coreHw5/tsk1/saveDir");
        File destFolder = new File("coreHw5/tsk1/backup");

        if (!srcFolder.exists()) {
            System.out.println("Wrong directory/not exist");
            System.exit(0);
        } else {
            copyFolder(srcFolder, destFolder);
        }
        System.out.println("Done");

    }

    public static void copyFolder(File src, File dst) throws IOException {
        if (src.isDirectory()) {
            if (!dst.exists()) {
                dst.mkdir();
                System.out.println("Copy from " + src + " to " + dst);
            }
            String[] files = src.list();
            assert files != null;
            for (String file : files) {
                File srcFile = new File(src, file);
                File dstFie = new File(dst, file);
                copyFolder(srcFile, dstFie); // рекурсия для папок
            }
        } else { // фаилы
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst);

            byte[] buffer = new byte[1024];

            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
            System.out.println("Files copied from " + src + " to " + dst);
        }


    }

    public static void main(String[] args) throws IOException {
        copyDirectory();
    }
}
