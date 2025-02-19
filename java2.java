package com.mycompany.mavenproject1;
public class RecIntegral {
    private double lowerBound;
    private double upperBound;
    private double step;
    private double result;

    public RecIntegral(double lowerBound, double upperBound, double step, double result) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.step = step;
        this.result = result;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public double getStep() {
        return step;
    }

    public double getResult() {
        return result;
    }

    public void setLowerBound(double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public void setUpperBound(double upperBound) {
        this.upperBound = upperBound;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
