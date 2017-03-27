package learn.tdd;

import learn.tdd.dummy.DummyPrinterService;
import org.junit.Before;
import org.junit.Test;
import static  junit.framework.Assert.assertFalse;
import static  junit.framework.Assert.assertTrue;

/**
 * Created by mb00549 on 3/24/2017.
 */
public class FinalInvoiceStepTestImproved {
    private FinalInvoiceStep finalInvoiceStep = null;
    private Customer customer = null;
    private Invoice invoice = null;
    private EmailService emailService = null;
    private DummyPrinterService dummyPrinterService = null;

    @Before
    public void beforeEachTest() {
        dummyPrinterService = new DummyPrinterService();
        emailService = new EmailService();
        customer = new Customer();
        finalInvoiceStep = new FinalInvoiceStep(dummyPrinterService, emailService);
        invoice = new Invoice();
    }

    @Test
    public void normalCustomer() {
        customer.wantsEmail(true);
        finalInvoiceStep.handleInvoice(invoice, customer);
        assertFalse("Nothing should be printed",dummyPrinterService.anInvoiceWasPrinted());
    }

    @Test
    public void customerWithPrintedInvoice() {
        customer.wantsEmail(false);
        finalInvoiceStep.handleInvoice(invoice, customer);
        assertTrue("Invoice was printed",dummyPrinterService.anInvoiceWasPrinted());
    }
}
