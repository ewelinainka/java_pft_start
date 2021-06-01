package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args){
   String[] langs ={"Java", "C#","Pyton", "PHP"};

   //for(int i=0; i< langs.length; i++){
   //  System.out.println("Chce nauczyc sie "+ langs[i]);
   //
  //  for(String l : langs){
   //   System.out.println("Chce nauczyc sie "+ l);
   // }

  /*  List<String> languages =new ArrayList<String>();
    languages.add("Java");
    languages.add("C#");
    languages.add("Pyton");
       */

    List<String> languages = Arrays.asList("Java","C#","Pyton");


    for(String l: languages){
      System.out.println("Chce nauczyc sie "+ l);

    }
  }
 }

  /*String[] langs=new String[4];    //tablica o rozmiarze 4 (na 4 elementy)
   langs[0]= "java";
    langs[1]= "C#";
    langs[2]= "Pyton";
    langs[3]= "PHP"; */