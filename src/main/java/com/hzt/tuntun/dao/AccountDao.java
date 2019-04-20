package com.hzt.tuntun.dao;

import com.hzt.tuntun.beans.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AccountDao {

    void insert(Account account);

    List<Account> findAll();
}
