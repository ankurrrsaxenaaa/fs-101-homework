package com.AI.RobotDemo.Utility;
public final class Weight {
    private final Double weight;
    private final WeightUnit weightUnit;
    private Weight(Double weight, WeightUnit weightUnit) {
        this.weight = weight;
        this.weightUnit = weightUnit;
    }
    private Weight(Builder builder) {
        weight = builder.weight;
        weightUnit = builder.weightUnit;
    }
    public Double getWeight() {
        return weight;
    }
    public WeightUnit getWeightUnit() {
        return weightUnit;
    }
    public static final class Builder {
        private Double weight;
        private WeightUnit weightUnit;
        public Builder() {
        }
        public Builder withWeight(Double val) {
            weight = val;
            return this;
        }
        public Builder withWeightUnit(WeightUnit val) {
            if(val==null)
                weightUnit=WeightUnit.KG;
            else
                weightUnit = val;
            return this;
        }
        public Weight build() {
            return new Weight(this);
        }
    }
}
