package com.lcn.demo1;

import com.lcn.demo1.dao.Bank2TbMapper;
import com.lcn.demo1.dao.BankTbMapper;
import com.lcn.demo1.po.Bank2Tb;
import com.lcn.demo1.po.BankTb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LcnDemo1ApplicationTests {

    @Autowired
	private BankTbMapper bankTbMapper;

    @Autowired
    private Bank2TbMapper bank2TbMapper;

	@Test
	public void contextLoads() {
	}

	@Test
    @Transactional
	public void tset1(){

	}

}
