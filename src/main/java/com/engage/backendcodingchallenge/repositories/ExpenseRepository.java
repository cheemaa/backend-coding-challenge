package com.engage.backendcodingchallenge.repositories;

import com.engage.backendcodingchallenge.model.Expense;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by alp3 on 21/6/17.
 */
public interface ExpenseRepository extends CrudRepository<Expense, Long> {}