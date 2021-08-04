package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
  public static void main(String[] args) {

   /* String[] langs = new String[4];
    langs[0] = "Java";
    langs[1] = "C#";
    langs[2] = "Python";
    langs[3] = "PHP"; */

    String[] langs = {"Java", "C#", "Python", "PHP"}; //tablica
  /*  for (int i=0; i< langs.length; i++){
      System.out.println("Chce nauczyc sie "+ langs[i]);
    }*/

  /*  List<String> languages = new ArrayList<String>(); //lista
    languages.add("Java");
    languages.add("C3");
    languages.add("Python");*/

    List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");
    for (String l : langs) {
      System.out.println("Chce nauczyc sie " + l);


  /*  for (String l: langs){
      System.out.println("Chce nauczyc sie "+ l);
    }*/


    }
  }
}
