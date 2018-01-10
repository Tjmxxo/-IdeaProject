package com.lcn.demo1.service;

import com.lcn.demo1.dao.BankTbMapper;
import com.lcn.demo1.po.BankTb;
import com.lcn.demo1.po.BankTbExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 *
 * @auther: TJM
 * @Date: 2017/12/31
 * @Time: 10:23
 * @From: XRZJ
 */
@Service
public class BankService {

    @Autowired
    private BankTbMapper bankTbMapper;

    @Transactional
    public int bankMoneyChange(int bankId ,int bankMoney){
        if (bankId == 0 && bankMoney == 0){
            return 0;
        }
        return 1;
    }
}
