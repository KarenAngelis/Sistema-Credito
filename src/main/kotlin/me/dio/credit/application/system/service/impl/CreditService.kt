package me.dio.credit.application.system.service.impl

import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.exception.BusinessException
import me.dio.credit.application.system.repository.CreditRepository
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class CreditService(
    private val creditRepository: CreditRepository
) {
    fun save(credit: Credit): Credit {
        if (credit.dayFirstInstallment.isAfter(LocalDate.now().plusMonths(3))) {
            throw BusinessException("Invalid Date")
        }
        return creditRepository.save(credit)
    }
}


