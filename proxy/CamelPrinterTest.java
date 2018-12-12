package homework.task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CamelPrinterTest {


    @Test
    public void print() {
        Printable camelPrinter = new CamelPrinter();
        String result = camelPrinter.print("hello test");
        assertEquals("hellotest", result);


    }
}
