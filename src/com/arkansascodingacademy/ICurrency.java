package com.arkansascodingacademy;

import java.math.BigDecimal;

public interface ICurrency
{
    public BigDecimal getFaceValue();
    public BigDecimal getCollectibleValue();
    public String getName();


}
