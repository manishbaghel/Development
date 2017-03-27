package learn.tdd;

/**
 * Created by mb00549 on 3/24/2017.
 */
public abstract class PrinterService {
    public abstract boolean isPrinterConfigured();

    public void printInvoice(Invoice invoice) {
        System.out.println("Printing Invoice");
    }
}
