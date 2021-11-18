package haikuanalysis;

public class HaikuPoem {


    private String author;
    private String firstLine;
    private String secondLine;
    private String thirdLine;


    public HaikuPoem(String author, String firstLine, String secondLine, String thirdLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
        this.author = author;
    }


    public String getFirstLine() {
        return firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public String getThirdLine() {
        return thirdLine;
    }

    @Override
    public String toString() {
        return "The author of this haiku poem is: " + author +
                "\n" + firstLine +
                "\n" + secondLine +
                "\n" + thirdLine;
    }
}
