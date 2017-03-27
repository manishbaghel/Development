package learn.tdd;

/**
 * Created by mb00549 on 3/24/2017.
 */
public class FinalInvoiceStep {
    private PrinterService printerService = null;
    private EmailService emailService = null;

    public FinalInvoiceStep(PrinterService printerService, EmailService emailService) {
        this.printerService = printerService;
        this.emailService = emailService;
    }

    public void handleInvoice(Invoice invoice, Customer customer) {
        if(customer.prefersEmails()) {
            emailService.sendInvoice(invoice,customer.getEmail());
        } else {
            printerService.printInvoice(invoice);
        }
    }
}
