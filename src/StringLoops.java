public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() {
    }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP
      */
    public int countCharacters(String character, String searchString) {
        int sum = 0;
        for (int i = 0; i < searchString.length(); i++) {
            String currentChar = searchString.substring(i, i + 1);
            if (currentChar.equals(character.toLowerCase()) || currentChar.equals(character.toUpperCase())) {
                sum++;
            }
        }
        return sum;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        String newstring = "";
        for (int i = origString.length(); i > 0; i--) {
            newstring += origString.substring(i - 1, i);
        }
        return newstring;
    }


    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
        int index = origStr.indexOf(searchChar);
        while (index != -1) {
            origStr = origStr.substring(0, index) + replaceChar + origStr.substring(index + 1);
            index = origStr.indexOf(searchChar);
        }
        return origStr;
    }

    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar) {
        for (int i = 0; i < origStr.length(); i++) {
            if (origStr.substring(i, i + 1).equals(searchChar)) {
                origStr = origStr.substring(0, i) + replaceChar + origStr.substring(i + 1);
            }
        }
        return origStr;
    }

    /*

   Examples:
   - if searchString = "an" and origString = "canned beans and bananas",
     this method returns 5: canned beans and bananas
   - if searchString = "tat" and origString = "Ratatattat",
     this method returns 3: Ratatattat (note the overlap!)
   - if searchString = "lower" and origString = "sunflower",
     this method returns 1: sunflower
   - if searchString = "haha" and origString = "Hahahahaha",
     this method returns 3: Hahahahaha (note the overlap!)
   - if searchString = "rain" and origString = "rain drain pain train",
     this method returns 3: rain drain pain train
   - if searchString = "was" and origString = "I was about to call you",
     this method returns 1: I was about to call you
   - if searchString = "but" and origString = "I was about to call you",
     this method returns 0: I was about to call you
   - searchString = "i", origString = "iiiit's supercalifragilisticexpialidociousi",
     this method returns 12: iiiit's supercalifragilisticexpialidociousi
     Returns the number of times "searchString" appears in "origString";
   matches should be case sensitive (i.e. no need to worry about lower vs. uppercase)
  */
    public int countString(String searchString, String origString) {
        int length = searchString.length();
        int counter = 0;
        for (int i = 0; i <= origString.length() - length; i++) {
            if (origString.substring(i, i + length).equals(searchString)) {
                counter++;
            }
        }
        return counter;
    }
    /*

  - if searchString = "an" and origString = "canned beans and bananas",
    this method returns "cned bes d bas"
  - if searchString = "tat" and origString = "Ratatattat",
    this method returns "Raat"
  - if searchString = "lower" and origString = "sunflower",
    this method returns "sunf"
  - if searchString = "haha" and origString = "Hahahahaha",
    this method returns "Ha" (case sensitive, so leading "Haha" isn’t a match)
  - if searchString = "HAHA" and origString = "Hahahahaha",
    this method returns "Hahahahaha" (no matches due to case)
  - if searchString = "rain" and origString = "it’s the brain drain pain train",
    this method returns "it’s the b d pain t"
  - if searchString = "lol" and origString = "lolololol",
    this method returns "ool"
  - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
    this method returns "I  about to call you, n’t I?"
  - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
    this method returns "I was about to call you, wasn’t I?" (no matches)
  - if searchString = "AB" and origString = "ABABABABABC",
    this method returns "C"
  - if searchString = "AB" and origString = "AAAAABBBBBC",
    this method returns "C"
    Returns a String with all instances of "searchString" removed from "origString";
    matches should be case sensitive (i.e. no need to worry about lowercase vs. uppercase)
 */
    public String removeString(String searchString, String origString) {
        int length = searchString.length();
        for (int i = 0; i <= origString.length() - length; i++) {
            if ( i > -1 && origString.substring(i, i + length).equals(searchString)) {
                origString = origString.substring(0, i) + origString.substring(i + length);
                i -= length;
            }
        }
        return origString;
    }
    /* Prints all integers from fromNum through toNum, separated by
         a commas and a space, on a single line;
         there should NOT be a comma after the final number.
         If fromNum == toNum, print just the number and no comma.
         If fromNum > toNum, the numbers should be printed in descending order.
         After all numbers are printed, move the cursor to the next line.

         Examples:
         - if fromNum = 0 and toNum = 5, this method should print: 0, 1, 2, 3, 4, 5
         - if fromNum = -3 and toNum = 2, this method should print: -3, -2, -1, 0, 2
         - if fromNum = 8 and toNum = 1, this method should print: 8, 7, 6, 5, 4, 3, 2, 1
         - if fromNum = 4 and toNum = 4, this method should print: 4
         - if fromNum = 0 and toNum = 0, this method should print: 0
        */
    public void commaSeparated(int fromNum, int toNum) {

        if (fromNum < toNum){
            for (int x = fromNum;x <= toNum;x++){
                System.out.print(x + ", ");
            }
        }else{
            for (int x = fromNum;x >= toNum;x--){
                System.out.print(x + ", ");
            }
        }
        if (fromNum == toNum){
            System.out.println(fromNum);
        }
        System.out.println();
    }


}
