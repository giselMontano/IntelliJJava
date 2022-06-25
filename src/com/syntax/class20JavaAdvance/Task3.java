package com.syntax.class20JavaAdvance;
public class Task3 {

    //MAIN METHOD CAN ALSO BE AT THE TOP OF THE CLASS
    public static void main(String[] args) {
        ChemistryTeacher Teacher = new ChemistryTeacher();
        Teacher.name = "Adem";
        Teacher.favoriteChemSubject = "Organic";
        Teacher.teacheChemistry();
    }
}
  /*
Write a Java program called Teacher.
  Identify features and behaviour of that Class.
  Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
   that would have it their own features and behaviour. Test all 4 classes
 */

//INHERITANCE HIERARCHICAL ONE SINGLE PARENT MANY CHILDREN
class Teacher {
    String name;
    String typeOfTeacher;

    public void teach() {
        System.out.println(name + " Teaches " + typeOfTeacher);
    }
}

class MathTeacher extends Teacher {
    String favoriteMathSubject;

    public void teachesMath() {
        System.out.println(name + " Teaches Math and his favorite math subject is " + favoriteMathSubject);
    }
}

class ChemistryTeacher extends Teacher {
    String favoriteChemSubject;

    public void teacheChemistry() {
        System.out.println(name + " Teaches Chemistry and his favorite Chemistry subject is " + favoriteChemSubject);
    }
}

class PianoTeacher extends Teacher {//EVERYTHING IS INHERITANCE FROM PARENT CLASS
    String favoriteModelOfPiano;

    public void teachesPiano() {
        System.out.println(name + " Teaches Piano and his favorite Piano Model is " + favoriteModelOfPiano);
    }
}


