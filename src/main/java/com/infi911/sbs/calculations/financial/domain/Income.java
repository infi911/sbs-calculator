package com.infi911.sbs.calculations.financial.domain;

import lombok.Getter;
import lombok.Setter;

public class Income {
    /**
     * Overall business income for certain period of time.
     * Must be null if both averageBill and salesNumber values are specified.
     *
     * @param overall New overall income value.
     * @return The current overall income value.
     */
    @Getter
    @Setter
    private Double overall;

    /**
     * Average bill value for certain period of time.
     * Must be null if overall value is specified.
     *
     * @param averageBill New averageBill value.
     * @return The current averageBill value.
     */
    @Getter
    @Setter
    private Double averageBill;

    /**
     * Average sales number for certain period of time.
     * Must be null if overall value is specified.
     *
     * @param salesNumber New salesNumber value.
     * @return The current salesNumber value.
     */
    @Getter
    @Setter
    private Integer salesNumber;

}
