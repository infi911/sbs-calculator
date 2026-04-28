package com.infi911.sbs.calculations.financial.domain;

import lombok.Getter;
import lombok.Setter;

public class Expenses {
    /**
     * Overall business expenses for certain period of time.
     * Must be null if ... values are specified.
     *
     * @param overall New overall expenses value.
     * @return The current overall expenses value.
     */
    @Getter
    @Setter
    private Double overall;

    /**
     * Loan payments for certain period of time (usually monthly, quarterly or annual).
     * Includes all loan payments to one or more bank(s), fund(s) and/or other institution(s).
     * Does not include any loan payments to individual(s).
     * Must be null if overall value is specified.
     *
     * @param loanPayments New loanPayments value.
     * @return The current loanPayments value.
     */
    @Getter
    @Setter
    private Double loanPayments;

    /**
     * Rental payments for certain period of time (usually monthly, quarterly or annual).
     * Must be null if overall value is specified.
     *
     * @param rentalPayments New rentalPayments value.
     * @return The current rentalPayments value.
     */
    @Getter
    @Setter
    private Double rentalPayments;

    /**
     * Payroll costs for certain period of time (usually monthly, quarterly or annual).
     * Must be null if overall value is specified.
     *
     * @param payrollCosts New payrollCosts value.
     * @return The current payrollCosts value.
     */
    @Getter
    @Setter
    private Double payrollCosts;

    /**
     * All business taxes payments for certain period of time (usually monthly, quarterly or annual).
     * Must be null if overall or flatTaxPercent value is specified.
     *
     * @param taxes New taxes value.
     * @return The current taxes value.
     */
    @Getter
    @Setter
    private Double taxes;

    /**
     * Flat-rate tax percent for certain period of time (usually monthly, quarterly or annual),
     * Used in case a tax with a single rate on the taxable amount is applicable for the business.
     * Must be null if overall or taxes value is specified.
     *
     * @param flatTaxPercent New flatTaxPercent value.
     * @return The current flatTaxPercent value.
     */
    @Getter
    @Setter
    private Double flatTaxPercent;

    /**
     * All social security payments of a business for certain period of time (usually monthly, quarterly or annual).
     * Must be null if overall or flatSocialSecurityPercent value is specified.
     *
     * @param socialSecurityPayments New socialSecurityPayments value.
     * @return The current socialSecurityPayments value.
     */
    @Getter
    @Setter
    private Double socialSecurityPayments;

    /**
     * Flat-rate social security tax percent for a business for certain period of time (usually monthly, quarterly or annual).
     * Used in case a social security tax with a single rate on the taxable amount is applicable for the business.
     * Must be null if overall or socialSecurityPayments value is specified.
     *
     * @param socialSecurityFlatTaxPercent New socialSecurityFlatTaxPercent value.
     * @return The current socialSecurityFlatTaxPercent value.
     */
    @Getter
    @Setter
    private Double socialSecurityFlatTaxPercent;

    /**
     * Business expenses on acquiring for certain period of time (usually monthly, quarterly or annual),
     * Must be null if overall or taxes value is specified.
     *
     * @param acquiring New acquiring value.
     * @return The current acquiring value.
     */
    @Getter
    @Setter
    private Double acquiring;

    /**
     * Any other business expenses/payments for certain period of time (usually monthly, quarterly or annual).
     * Must be null if overall or taxes value is specified.
     *
     * @param otherPayments New otherPayments value.
     * @return The current otherPayments value.
     */
    @Getter
    @Setter
    private Double otherPayments;
}
