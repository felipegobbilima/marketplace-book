package com.marketplacebook.service

import com.marketplacebook.enums.CustomerStatus
import com.marketplacebook.enums.Errors
import com.marketplacebook.exception.NotFoundException
import com.marketplacebook.model.CustomerModel
import com.marketplacebook.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService (
    val customerRepository: CustomerRepository,
    val bookService: BookService
) {

    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customerRepository.findByNameContaining(it)
        }
        return customerRepository.findAll().toList()
    }

    fun create(customer: CustomerModel) {
        customerRepository.save(customer)
    }

    fun findById(id: Int): CustomerModel {
            return customerRepository.findById(id).orElseThrow{ NotFoundException(Errors.MP201.message.format(id), Errors.MP201.code) }
    }

    fun update(customer: CustomerModel) {
        if (!customerRepository.existsById(customer.id!!)){
             throw Exception()
        }

        customerRepository.save(customer)
    }

    fun delete(id: Int) {
        val customer = findById(id)
        bookService.deleteByCustomer(customer)
        customer.status = CustomerStatus.INATIVO

        customerRepository.save(customer)
    }

    fun emailAvailible(email: String): Boolean {
        return !customerRepository.existsByEmail(email)
    }

}