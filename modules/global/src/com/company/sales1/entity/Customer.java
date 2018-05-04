package com.company.sales1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.validation.constraints.Pattern;
import javax.persistence.Lob;
import javax.validation.constraints.Size;

@NamePattern("%s|name")
@Table(name = "SALES1_CUSTOMER")
@Entity(name = "sales1$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 4786305021548285841L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @Pattern(message = "{msg://Customer.email.validationMsg}", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @Lob
    @Pattern(message = "{msg://com.company.sales1.entity/Customer.phone.validationMsg}", regexp = "^((\\+7|7|8)+([0-9]){10})$")
    @NotNull
    @Column(name = "PHONE", nullable = false)
    protected String phone;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}