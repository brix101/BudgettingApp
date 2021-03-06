package com.brix.budgetingapp.persistance;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.brix.budgetingapp.models.ExpenseCategory;

import java.util.List;

@Dao
public interface ExpenseCatDao {

    @Insert
    void insert(ExpenseCategory[] expenseCategories);

    @Query("SELECT * FROM expenseCat")
    LiveData<List<ExpenseCategory>> getData();

    @Delete
    int delete(ExpenseCategory[] expenseCategories);

    @Update
    int update(ExpenseCategory[] expenseCategories);

    @Query("SELECT * FROM expenseCat WHERE Id = :Id")
    ExpenseCategory findById(int Id);
}

