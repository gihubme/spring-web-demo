package eu.nnn4.webapi.service;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    static List<ShippingAddress> shippingAddses = new ArrayList<>();
    static List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){

    }

    public ShippingAddress getByName(String Name){
        return null;
    }

    public List<ShippingAddress> getAllShippingAddresses(){
        return null;
    }
}
