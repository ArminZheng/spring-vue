package com.az.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Dog {
    private String Name; // This is the worst because it won't be able to find the attribute.
    private Boolean gender;
    private int age;
    private String dHost;
    private String URL;

    void test() {
        // The Lombok plugin may encounter some issues:
        this.getDHost(); // error. should be getdHost()
        this.getURL();
        this.getName();
        /*
        The JavaBean specification:
            1. uName --> getuName/setuName (The second letter is capitalized, with no change in case.)
            2. URL --> getURL/setURL (The first two letters are in uppercase, and the case remains the same.)
            3. Name -->getName/setName (Capitalize the first letter and keep the case the same.)
        */
    }

}
