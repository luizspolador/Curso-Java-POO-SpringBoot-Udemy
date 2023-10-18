package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double parcelaBasica = contract.getTotalValue()/months;
        for(int i=1; i<=months; i++){
            LocalDate vencimento = contract.getDate().plusMonths(i);
            double juro = onlinePaymentService.interest(parcelaBasica, i);
            double taxa = onlinePaymentService.paymentFee(parcelaBasica + juro);
            double valorTotalParcela = parcelaBasica + juro +taxa;
            contract.getInstallmentList().add(new Installment(vencimento, valorTotalParcela));
        }
    }
}
