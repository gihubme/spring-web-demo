package eu.nnn4.webapi.service;

import eu.nnn4.webmodel.ShippingAddress;
import eu.nnn4.webmodel.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private static List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){
        int numA=9;
        for(int i=0;i<numA;i++)
            users.add(FakeDataGenerator.createUser());
    }

    public List<ShippingAddress> getByName(String name){
        return users.stream()
                .filter(a->a.getFirstName().equals(name)||a.getSecondName().equals(name))
                .map(a->(a.getShippingAddress()==null)?a.getBillingAddress():a.getShippingAddress())
                .collect(Collectors.toList());
    }

    public List<ShippingAddress> getAllShippingAddresses(){
        return users.stream()
                .map(User::getShippingAddress)
                .collect(Collectors.toList());
    }

    public List<User> getAllUsers(){
        return users;
    }
}
