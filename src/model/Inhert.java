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
public class Inhert implements Serializable {

    private int no_in;
    private int one_user;
    private int two_user;
    private int three_user;
    private int more_user;

    public Inhert() {
        no_in = 0;
        one_user = 1;
        two_user = 2;
        three_user = 3;
        more_user = 4;
    }

    /**
     * @return the no_in
     */
    public int getNo_in() {
        return no_in;
    }

    /**
     * @param no_in the no_in to set
     */
    public void setNo_in(int no_in) {
        this.no_in = no_in;
    }

    /**
     * @return the one_user
     */
    public int getOne_user() {
        return one_user;
    }

    /**
     * @param one_user the one_user to set
     */
    public void setOne_user(int one_user) {
        this.one_user = one_user;
    }

    /**
     * @return the two_user
     */
    public int getTwo_user() {
        return two_user;
    }

    /**
     * @param two_user the two_user to set
     */
    public void setTwo_user(int two_user) {
        this.two_user = two_user;
    }

    /**
     * @return the three_user
     */
    public int getThree_user() {
        return three_user;
    }

    /**
     * @param three_user the three_user to set
     */
    public void setThree_user(int three_user) {
        this.three_user = three_user;
    }

    /**
     * @return the more_user
     */
    public int getMore_user() {
        return more_user;
    }

    /**
     * @param more_user the more_user to set
     */
    public void setMore_user(int more_user) {
        this.more_user = more_user;
    }

}
