package com.bank.loan_payment_service.PaymentService;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class PaymentService {
public String processpayment(String loanId, BigDecimal amount){
return "Payment of " + amount + " applied to loan" + loanId;

}
}
