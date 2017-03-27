package learn.tdd.dummy;

import learn.tdd.Invoice;
import learn.tdd.PrinterService;

/**
 * Created by mb00549 on 3/24/2017.
 */
public class DummyPrinterService  extends PrinterService{
    boolean anInvoiceWasPrinted = false;

    @Override
    public boolean isPrinterConfigured() {
        return true;
    }
    @Override
    public void printInvoice(Invoice invoice) {
        anInvoiceWasPrinted = true;
    }
    public boolean anInvoiceWasPrinted() {
        return anInvoiceWasPrinted;
    }
}
