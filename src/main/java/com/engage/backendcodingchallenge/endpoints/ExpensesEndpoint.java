package com.engage.backendcodingchallenge.endpoints;

import com.engage.backendcodingchallenge.model.Expense;
import com.engage.backendcodingchallenge.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by alp3 on 21/6/17.
 */
@Component
@Path("/expenses")
@Produces("application/json")
public class ExpensesEndpoint {

    @Autowired
    public ExpenseRepository expenseRepository;

    @GET
    public Iterable<Expense> expenses() {
        return expenseRepository.findAll();
    }

    @POST
    public void createExpense(Expense expense) {
        expenseRepository.save(expense);
    }
}
