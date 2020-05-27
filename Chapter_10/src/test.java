import javax.swing.*;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;

public class test {
  public static void main(String[] args){
    StringBuilder str =
            new StringBuilder("We have lived in Chicago, " +
                    "Trenton, and Atlanta.");
    str.replace(17, 24, "Tampa");

    System.out.println(str);
  }
  }
