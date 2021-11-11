package eu.nnn4.webapi.ctrl;

import eu.nnn4.webmodel.ShippingAddress;
import eu.nnn4.webapi.service.UserService;
import eu.nnn4.webmodel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserCtrl {

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/shippingAddress/", produces = { "application/json" }, consumes = { "application/json" })
    public ResponseEntity<List<ShippingAddress>> getShippingAddress4Name(
            @RequestBody String name) {
        return ResponseEntity.ok(userService.getByName(name));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/hippingAddress/all/", produces = { "application/json" }, consumes = { "application/json" })
    public ResponseEntity<List<ShippingAddress>> getAllShippingAddress() {
        return ResponseEntity.ok(userService.getAllShippingAddresses());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/", produces = { "application/json" }, consumes = { "application/json" })
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
