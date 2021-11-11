package eu.nnn4.webapi.service;

import eu.nnn4.webmodel.ShippingAddress;
import eu.nnn4.webmodel.User;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class FakeDataGenerator {

    public static ShippingAddress createShippingAddress(){
        ShippingAddress a1=new ShippingAddress();
        a1.setCountryName("DE");
        a1.setPostalCode(""+(new Random().nextInt(20000)+10000));
        a1.setStreetAddress(RandomStringUtils.randomAlphanumeric(10)+(new Random().nextInt(20)+10));
        a1.setPostOfficeBox("box"+(new Random().nextInt(200)+100));
        return a1;
    }

    public static User createUser(){
        User a1=new User();
        a1.setFirstName("Illy"+(new Random().nextInt(200)+1));
        a1.setSecondName("Piromu"+(new Random().nextInt(200)+1));
        a1.setEmail(RandomStringUtils.randomAlphanumeric(6)+"@ik.com");
        a1.setPhone(""+(new Random().nextInt(10090909)+100909090));
        a1.setBillingAddress(createShippingAddress());
        if(new Random().nextBoolean())
            a1.setShippingAddress(createShippingAddress());
        return a1;
    }
}
