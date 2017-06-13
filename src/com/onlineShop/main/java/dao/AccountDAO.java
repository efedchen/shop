package com.onlineShop.main.java.dao;

import com.onlineShop.main.java.entity.Account;

public interface AccountDAO {
    public Account findAccount(String username);
}
