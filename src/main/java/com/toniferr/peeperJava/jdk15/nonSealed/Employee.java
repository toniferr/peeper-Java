package com.toniferr.peeperJava.jdk15.nonSealed;

import java.util.Date;

/** non-sealed **/
public non-sealed class Employee extends Person {

    public Date getHiredDate() {
        return new Date();
    }
}
