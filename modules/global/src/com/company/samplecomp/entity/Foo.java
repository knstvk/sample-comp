package com.company.samplecomp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "KKCOMP1_FOO")
@Entity(name = "kkcomp1$Foo")
public class Foo extends StandardEntity {
    private static final long serialVersionUID = 7738423594809305510L;

    @Column(name = "NAME")
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}