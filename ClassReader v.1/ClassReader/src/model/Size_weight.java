/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author PK
 */
public class Size_weight implements Serializable {

    public Size_weight() {
        keyword = 1;
        identifier = 1;
        operator = 1;
        numericle_V = 1;
        sting_lttrl = 1;
    }

    private int keyword;
    private int identifier;
    private int operator;
    private int numericle_V;
    private int sting_lttrl;

    /**
     * @return the keyword
     */
    public int getKeyword() {
        return keyword;
    }

    /**
     * @param keyword the keyword to set
     */
    public void setKeyword(int keyword) {
        this.keyword = keyword;
    }

    /**
     * @return the identifier
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    /**
     * @return the operator
     */
    public int getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(int operator) {
        this.operator = operator;
    }

    /**
     * @return the numericle_V
     */
    public int getNumericle_V() {
        return numericle_V;
    }

    /**
     * @param numericle_V the numericle_V to set
     */
    public void setNumericle_V(int numericle_V) {
        this.numericle_V = numericle_V;
    }

    /**
     * @return the sting_lttrl
     */
    public int getSting_lttrl() {
        return sting_lttrl;
    }

    /**
     * @param sting_lttrl the sting_lttrl to set
     */
    public void setSting_lttrl(int sting_lttrl) {
        this.sting_lttrl = sting_lttrl;
    }

}
