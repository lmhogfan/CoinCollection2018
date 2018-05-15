package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Penny extends Coin
{
    public Penny(int year)
    {
        super(year);
    }

    public BigDecimal getFaceValue()
    {
        BigDecimal faceValue =new BigDecimal("0.01");
        return faceValue;
    }

    public BigDecimal getCollectibleValue()
    {
        BigDecimal totalValue=new BigDecimal("0.00");
        if (getYear()<1945)
        {
            BigDecimal age= new BigDecimal(1945-getYear());
            BigDecimal multiplier= new BigDecimal("0.03");
            BigDecimal addedValue =age.multiply(multiplier);
            totalValue= addedValue.add(getFaceValue());
        }
        else
        {
            totalValue=getFaceValue();
        }
        return totalValue;
    }
}
