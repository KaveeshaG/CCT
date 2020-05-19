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
public class Variable_weight implements Serializable {

    private int Globle_V;
    private int Local_v;
    private int Primitive_V;
    private int Composite_V;

    public Variable_weight() {
        Composite_V = 2;
        Primitive_V = 1;
        Local_v = 1;
        Globle_V = 2;

    }

    /**
     * @return the Globle_V
     */
    public int getGloble_V() {
        return Globle_V;
    }

    /**
     * @param Globle_V the Globle_V to set
     */
    public void setGloble_V(int Globle_V) {
        this.Globle_V = Globle_V;
    }

    /**
     * @return the Local_v
     */
    public int getLocal_v() {
        return Local_v;
    }

    /**
     * @param Local_v the Local_v to set
     */
    public void setLocal_v(int Local_v) {
        this.Local_v = Local_v;
    }

    /**
     * @return the Primitive_V
     */
    public int getPrimitive_V() {
        return Primitive_V;
    }

    /**
     * @param Primitive_V the Primitive_V to set
     */
    public void setPrimitive_V(int Primitive_V) {
        this.Primitive_V = Primitive_V;
    }

    /**
     * @return the Composite_V
     */
    public int getComposite_V() {
        return Composite_V;
    }

    /**
     * @param Composite_V the Composite_V to set
     */
    public void setComposite_V(int Composite_V) {
        this.Composite_V = Composite_V;
    }

}
