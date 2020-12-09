/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author George.Pasparakis
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String tel;
    private String email;

    public Customer() {}
    
    public Customer(String firstName, String lastName, String tel, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tel = tel;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", tel=").append(tel);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
