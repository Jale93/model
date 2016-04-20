
package filedemo;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        getAllFiles("C:\\Users\\Natavan\\Desktop\\ZooProject");
    }
  public static void getAllFiles(String path) {
      try{  
      File f = new File(path);
        for (File files : f.listFiles()) {
               if (files.isDirectory()) {
                   System.out.println(files);
                    getAllFiles(files.toString());
               } else{
                    System.out.println("" + files);
               }
            }
      }
      catch(Exception ex){
          ex.printStackTrace();
      }

        }   
}
