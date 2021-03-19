package com.dvt.main;

public interface InsuranceProfileInterface {
    void calculateInsuranceContribution(double annualGrossSalary);
    double getInsuranceRate();
    double getMonthlyInsuranceContribution();
}
