package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Dime
{
    int year;

    public Dime(int year)
    {
        this.year=year;
    }
    public BigDecimal getFaceValue()
    {
        BigDecimal faceValue =new BigDecimal("0.10");
        return faceValue;
    }
    public BigDecimal getCollectibleValue()
    {
        return getFaceValue();
    }
}
