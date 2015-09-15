/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas_varias;

import java.util.Date;

/**
 *
 * @author EnriqueJosé
 */
public class MiClase {

    private final String name;
    private final String surname;
    private final Date birthday;
    private String address;
    private String account;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);

    public MiClase(String name, String surname, Date birthday, String address, String account) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getAccount() {
        return account;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getAge() {
        Date today = new Date();

        return (int) milliseconds(today.getTime() - birthday.getTime());
    }

    private long milliseconds(long millis) {
        return (long) (millis / MILLISECONDS_PER_YEAR);
    }

}
