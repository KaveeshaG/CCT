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
public class Method implements Serializable {

    private int M_Primitive_RT;
    private int M_composite_TR;
    private int M_DataType_PM;
    private int M_composite_PM;
    private int M_void_RP;

    public Method() {
        M_Primitive_RT = 1;
        M_composite_TR = 2;
        M_DataType_PM = 1;
        M_composite_PM = 2;
        M_void_RP = 0;

    }

    /**
     * @return the M_Primitive_RT
     */
    public int getM_Primitive_RT() {
        return M_Primitive_RT;
    }

    /**
     * @param M_Primitive_RT the M_Primitive_RT to set
     */
    public void setM_Primitive_RT(int M_Primitive_RT) {
        this.M_Primitive_RT = M_Primitive_RT;
    }

    /**
     * @return the M_composite_TR
     */
    public int getM_composite_TR() {
        return M_composite_TR;
    }

    /**
     * @param M_composite_TR the M_composite_TR to set
     */
    public void setM_composite_TR(int M_composite_TR) {
        this.M_composite_TR = M_composite_TR;
    }

    /**
     * @return the M_DataType_PM
     */
    public int getM_DataType_PM() {
        return M_DataType_PM;
    }

    /**
     * @param M_DataType_PM the M_DataType_PM to set
     */
    public void setM_DataType_PM(int M_DataType_PM) {
        this.M_DataType_PM = M_DataType_PM;
    }

    /**
     * @return the M_composite_PM
     */
    public int getM_composite_PM() {
        return M_composite_PM;
    }

    /**
     * @param M_composite_PM the M_composite_PM to set
     */
    public void setM_composite_PM(int M_composite_PM) {
        this.M_composite_PM = M_composite_PM;
    }

    /**
     * @return the M_void_RP
     */
    public int getM_void_RP() {
        return M_void_RP;
    }

    /**
     * @param M_void_RP the M_void_RP to set
     */
    public void setM_void_RP(int M_void_RP) {
        this.M_void_RP = M_void_RP;
    }

}
