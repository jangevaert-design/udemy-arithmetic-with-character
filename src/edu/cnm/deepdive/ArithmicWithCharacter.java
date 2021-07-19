package edu.cnm.deepdive;

class ArithmeticWithCharacter {

  public static void main(String[] args) {
    //char 0 - 65535
    char myCharA = 'A';
    char myCharNum = '1';

    System.out.println("myCharA = " + myCharA);
    System.out.println("myCharA isLetter = " + Character.isLetter(myCharA));//returns true
    System.out.println("myCharA isDigit = " + Character.isDigit(myCharA));//returns false

    System.out.println("\nmyCharNum = " + myCharNum);
    System.out.println("myCharNum isLetter = " + Character.isLetter(myCharNum));//returns false
    System.out.println("myCharNum isDigit = " + Character.isDigit(myCharNum));

    //exam examples.
    char letter = 65;//A
    int myInt = letter + 3;
    char myNewLetter = (char)myInt;

    System.out.println("\nletter = " + letter);
    System.out.println("myInt = " + myInt);
    System.out.println("myNewLetter = " + myNewLetter);

    char myChar = 65;
    char newChar = (char)(myChar + 1);//66 -> B
    boolean b = newChar == 'B';//will give true
    boolean c = (newChar++ < 'D');//incrementing has a higher priority than <. So first increment
    //to 67 and then compare with 'D' -> will give true as well.
  }
}

