public class MessageBuilder {


    private String message;  // To be initialized in part (a)
    private int numWords;    // To be initialized in part (a)
    /**
     * Builds a message starting with the word specified by the
     * parameter and counts the number of words in the message,
     * as described in part (a)
     * Precondition: startingWord is a single word with no spaces.
     */
    public MessageBuilder(String startingWord) {
        String fullMessage = startingWord;
        int counter = 1;
        startingWord = getNextWord(startingWord);
        while (startingWord != null){
            fullMessage += " " + startingWord;
            startingWord = getNextWord(startingWord);
            counter++;
        }
        message = fullMessage;
        numWords = counter;
    }



    // GETTER METHODS ADDED TO ENABLE TESTING:
    public String getMessage() {
        return message;
    }


    public int getNumWords() {
        return numWords;
    }


    /**
     * Returns a word to follow the word specified by the
     * parameter or null if there are no remaining words.
     * Precondition: s is a single word with no spaces.
     * Postcondition: Returns an individual word with no spaces.
     */
    public String getNextWord(String s) {
        // CODE FOR THIS METHOD WAS NOT SHOWN IN FRQ, BUT IT WAS ADDED HERE TO ENABLE TESTING
        String[] tests = {"The", "book", "on", "the", "table", null, "good", "morning", "sunshine", null, "a", "b", "c", "d", "e", "f", "g", "h", null, "nice", "job", null, "yikes", null, "As", "soon", "as", "possible", null};
        for (int i = 0; i < tests.length; i++) {
            if (tests[i] != null) {
                if (tests[i].equals(s)) {
                    return tests[i + 1];
                }
            }
        }
        return null;
    }


    /**
     * Returns an abbreviation for the instance variable message,
     * as described in part (b)
     * Preconditions: Each word in message is separated by a
     * Postcondition: message is unchanged.
     */
    public String getAbbreviation() {
        String myMessage = message;
        String abv = myMessage.substring(0,1);
        int index = 0;
        while (myMessage.indexOf(" ") > -1){
            index = myMessage.indexOf(" ");
            abv += "" + myMessage.charAt(index+1);
            myMessage = myMessage.substring(index+1);
        }
        return abv;
    }



   /* There may be instance variables, constructors,
   and methods that are not shown. */
}
