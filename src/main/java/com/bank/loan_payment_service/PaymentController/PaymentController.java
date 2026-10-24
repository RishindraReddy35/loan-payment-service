package com.bank.loan_payment_service.PaymentController;
import com.bank.loan_payment_service.PaymentService.PaymentService;

import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;


@RestController 
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService service;
    
    public PaymentController(PaymentService service) {
        this.service= service;

    }

    @PostMapping("/{loanId}")
    public String pay(@PathVariable String loanId, @RequestParam BigDecimal amount) {
        return service.processpayment(loanId, amount);
    }

}
