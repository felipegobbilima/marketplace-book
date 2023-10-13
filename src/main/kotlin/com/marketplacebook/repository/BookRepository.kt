package com.marketplacebook.repository

import com.marketplacebook.enums.BookStatus
import com.marketplacebook.model.BookModel
import com.marketplacebook.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface BookRepository: CrudRepository<BookModel, Int> {
    fun findByStatus(status: BookStatus): List<BookModel>
    fun findByCustomer(customer: CustomerModel): List<BookModel>
}