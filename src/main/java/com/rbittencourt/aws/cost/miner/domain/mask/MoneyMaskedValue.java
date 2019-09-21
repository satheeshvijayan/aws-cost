package com.rbittencourt.aws.cost.miner.domain.mask;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_EVEN;

public class MoneyMaskedValue implements MaskedValue {

    private BigDecimal value;

    public MoneyMaskedValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String getMaskedValue() {
        if (value == null) {
            return "";
        }

        return "$" + value.setScale(2, HALF_EVEN).toString();
    }

}