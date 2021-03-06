package com.brix.budgetingapplication.AsyncTask;

import android.os.AsyncTask;

import com.brix.budgetingapplication.models.FinancialStatement;
import com.brix.budgetingapplication.persistance.FinancialStatementDao;

public class DeleteFinState extends AsyncTask<FinancialStatement,Void,Void> {

    private FinancialStatementDao mFinancialStatementDao;

    public DeleteFinState(FinancialStatementDao FinancialStatementDao) {
        this.mFinancialStatementDao = FinancialStatementDao;
    }


    @Override
    protected Void doInBackground(FinancialStatement... financialStatements) {
        mFinancialStatementDao.delete(financialStatements);
        return null;
    }
}
