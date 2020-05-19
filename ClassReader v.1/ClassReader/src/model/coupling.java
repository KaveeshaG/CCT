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
public class coupling implements Serializable {

    private int recursive_cal;
    private int RM_call_RM_SF;
    private int RM_call_RM_DF;
    private int RM_RCM_SF;
    private int RM_RCM_DF;
    private int RCM_RCM_SF;
    private int RCM_RCM_DF;
    private int RCM_RM_SF;
    private int RCM_RM_DF;
    private int RM_R_GLV_SF;
    private int RM_R_GLV_DF;
    private int RCM_R_GLV_SF;
    private int RCM_R_GLV_DF;

    public coupling() {
        recursive_cal = 2;
        RM_call_RM_SF = 2;
        RM_call_RM_DF = 3;
        RM_RCM_SF = 3;
        RM_RCM_DF = 4;
        RCM_RCM_SF = 4;
        RCM_RCM_DF = 5;
        RCM_RM_SF = 3;
        RCM_RM_DF = 4;
        RM_R_GLV_SF = 1;
        RM_R_GLV_DF = 2;
        RCM_R_GLV_SF = 1;
        RCM_R_GLV_DF = 2;
    }

    /**
     * @return the recursive_cal
     */
    public int getRecursive_cal() {
        return recursive_cal;
    }

    /**
     * @param recursive_cal the recursive_cal to set
     */
    public void setRecursive_cal(int recursive_cal) {
        this.recursive_cal = recursive_cal;
    }

    /**
     * @return the RM_call_RM_SF
     */
    public int getRM_call_RM_SF() {
        return RM_call_RM_SF;
    }

    /**
     * @param RM_call_RM_SF the RM_call_RM_SF to set
     */
    public void setRM_call_RM_SF(int RM_call_RM_SF) {
        this.RM_call_RM_SF = RM_call_RM_SF;
    }

    /**
     * @return the RM_call_RM_DF
     */
    public int getRM_call_RM_DF() {
        return RM_call_RM_DF;
    }

    /**
     * @param RM_call_RM_DF the RM_call_RM_DF to set
     */
    public void setRM_call_RM_DF(int RM_call_RM_DF) {
        this.RM_call_RM_DF = RM_call_RM_DF;
    }

    /**
     * @return the RM_RCM_SF
     */
    public int getRM_RCM_SF() {
        return RM_RCM_SF;
    }

    /**
     * @param RM_RCM_SF the RM_RCM_SF to set
     */
    public void setRM_RCM_SF(int RM_RCM_SF) {
        this.RM_RCM_SF = RM_RCM_SF;
    }

    /**
     * @return the RM_RCM_DF
     */
    public int getRM_RCM_DF() {
        return RM_RCM_DF;
    }

    /**
     * @param RM_RCM_DF the RM_RCM_DF to set
     */
    public void setRM_RCM_DF(int RM_RCM_DF) {
        this.RM_RCM_DF = RM_RCM_DF;
    }

    /**
     * @return the RCM_RCM_SF
     */
    public int getRCM_RCM_SF() {
        return RCM_RCM_SF;
    }

    /**
     * @param RCM_RCM_SF the RCM_RCM_SF to set
     */
    public void setRCM_RCM_SF(int RCM_RCM_SF) {
        this.RCM_RCM_SF = RCM_RCM_SF;
    }

    /**
     * @return the RCM_RCM_DF
     */
    public int getRCM_RCM_DF() {
        return RCM_RCM_DF;
    }

    /**
     * @param RCM_RCM_DF the RCM_RCM_DF to set
     */
    public void setRCM_RCM_DF(int RCM_RCM_DF) {
        this.RCM_RCM_DF = RCM_RCM_DF;
    }

    /**
     * @return the RCM_RM_SF
     */
    public int getRCM_RM_SF() {
        return RCM_RM_SF;
    }

    /**
     * @param RCM_RM_SF the RCM_RM_SF to set
     */
    public void setRCM_RM_SF(int RCM_RM_SF) {
        this.RCM_RM_SF = RCM_RM_SF;
    }

    /**
     * @return the RCM_RM_DF
     */
    public int getRCM_RM_DF() {
        return RCM_RM_DF;
    }

    /**
     * @param RCM_RM_DF the RCM_RM_DF to set
     */
    public void setRCM_RM_DF(int RCM_RM_DF) {
        this.RCM_RM_DF = RCM_RM_DF;
    }

    /**
     * @return the RM_R_GLV_SF
     */
    public int getRM_R_GLV_SF() {
        return RM_R_GLV_SF;
    }

    /**
     * @param RM_R_GLV_SF the RM_R_GLV_SF to set
     */
    public void setRM_R_GLV_SF(int RM_R_GLV_SF) {
        this.RM_R_GLV_SF = RM_R_GLV_SF;
    }

    /**
     * @return the RM_R_GLV_DF
     */
    public int getRM_R_GLV_DF() {
        return RM_R_GLV_DF;
    }

    /**
     * @param RM_R_GLV_DF the RM_R_GLV_DF to set
     */
    public void setRM_R_GLV_DF(int RM_R_GLV_DF) {
        this.RM_R_GLV_DF = RM_R_GLV_DF;
    }

    /**
     * @return the RCM_R_GLV_SF
     */
    public int getRCM_R_GLV_SF() {
        return RCM_R_GLV_SF;
    }

    /**
     * @param RCM_R_GLV_SF the RCM_R_GLV_SF to set
     */
    public void setRCM_R_GLV_SF(int RCM_R_GLV_SF) {
        this.RCM_R_GLV_SF = RCM_R_GLV_SF;
    }

    /**
     * @return the RCM_R_GLV_DF
     */
    public int getRCM_R_GLV_DF() {
        return RCM_R_GLV_DF;
    }

    /**
     * @param RCM_R_GLV_DF the RCM_R_GLV_DF to set
     */
    public void setRCM_R_GLV_DF(int RCM_R_GLV_DF) {
        this.RCM_R_GLV_DF = RCM_R_GLV_DF;
    }

}
