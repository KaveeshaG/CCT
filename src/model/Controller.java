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
public class Controller implements Serializable {

    private int if_stm;
    private int for_stm;
    private int switch_stm;
    private int case_stm;

    public Controller() {
        if_stm = 2;
        for_stm = 3;
        switch_stm = 2;
        case_stm = 1;
    }

    /**
     * @return the if_stm
     */
    public int getIf_stm() {
        return if_stm;
    }

    /**
     * @param if_stm the if_stm to set
     */
    public void setIf_stm(int if_stm) {
        this.if_stm = if_stm;
    }

    /**
     * @return the for_stm
     */
    public int getFor_stm() {
        return for_stm;
    }

    /**
     * @param for_stm the for_stm to set
     */
    public void setFor_stm(int for_stm) {
        this.for_stm = for_stm;
    }

    /**
     * @return the switch_stm
     */
    public int getSwitch_stm() {
        return switch_stm;
    }

    /**
     * @param switch_stm the switch_stm to set
     */
    public void setSwitch_stm(int switch_stm) {
        this.switch_stm = switch_stm;
    }

    /**
     * @return the case_stm
     */
    public int getCase_stm() {
        return case_stm;
    }

    /**
     * @param case_stm the case_stm to set
     */
    public void setCase_stm(int case_stm) {
        this.case_stm = case_stm;
    }
}
