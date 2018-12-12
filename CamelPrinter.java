package homework.task;

public class CamelPrinter implements Printable {
    Printer printer;

    public CamelPrinter() {

    }

    @Override
    public String print(String inputString) {
        inputString = inputString.replaceAll(" ", "");
        System.out.println(inputString);
        return inputString;
    }


}
