package com.marketplacebook.validation

import com.marketplacebook.service.CustomerService
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class EmailAvailableValidator(var customerService: CustomerService): ConstraintValidator<EmailAvailable, String> {
    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        if (value.isNullOrEmpty()) {
            return false
        }
        return customerService.emailAvailible(value)
    }
}
