package haikuanalysis;

import data.HaikuWriter;


public class HaikuAnalysisEngine {
    HaikuWriter haikuWriter = new HaikuWriter();

    //fået hjælp og inspiration af mikkel
    public boolean checkForVowels(String line, int numberOfVowels) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int vowelcounter = 0;
        char[] charArray = line.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            for (int j = 0; j < vowels.length; j++) {
                if (currentChar == vowels[j]) {
                    vowelcounter++;
                }
            }
        }

        if (vowelcounter == numberOfVowels) {
            return true;
        } else {
            return false;
        }
    }

    public void isHaikuValid(HaikuPoem poem) {
        String firstLine = poem.getFirstLine();
        String secondLine = poem.getSecondLine();
        String thirdLine = poem.getThirdLine();

        if (checkForVowels(firstLine, 5) && checkForVowels(secondLine, 7) && checkForVowels(thirdLine, 5)) {
            System.out.println("it is a correct haiku-poem and the poem will be saved in the file");
            System.out.println(poem);
            haikuWriter.saveHaikuToFile(poem);
        } else {
            System.out.println("this is not a correct haiku-poem");
        }
    }
}
