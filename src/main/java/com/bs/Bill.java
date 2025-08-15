package com.bs;

import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class Bill implements InitializingBean{
private int price;
private int quantity;
private int amount;

public  void  compute()
{
	amount=price*quantity;
}

@Override
public void afterPropertiesSet() throws Exception
{
	compute();
}
}
