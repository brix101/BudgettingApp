package com.brix.budgetingapplication.AsyncTask;


import android.os.AsyncTask;

import com.brix.budgetingapplication.models.ExpenseCategory;
import com.brix.budgetingapplication.persistance.ExpenseCatDao;

public class DeleteExpense extends AsyncTask<ExpenseCategory,Void,Void> {

    private ExpenseCatDao mExpenseCatDao;

    public DeleteExpense(ExpenseCatDao mExpenseCatDao) {
        this.mExpenseCatDao = mExpenseCatDao;
    }


    @Override
    protected Void doInBackground(ExpenseCategory... expenseCategories) {
        mExpenseCatDao.delete(expenseCategories);
        return null;
    }
}
