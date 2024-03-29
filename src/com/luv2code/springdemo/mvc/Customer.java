package com.luv2code.springdemo.mvc;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName;

    @Min(value=0, message="must be greater than or equal to 0")
    @Max(value=10, message="Must be less than or equal to 10")
    @NotNull(message="is required")
    private Integer freePasses;

    @NotNull(message="is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message="only 5 characters/digits")
    private String postalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
