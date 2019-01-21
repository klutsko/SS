package homework.task;

public class Printer implements Printable {

    public Printer() {
    }

    @Override
    public String print(String inputString) {
        System.out.println(inputString);
        return inputString;
    }


}


