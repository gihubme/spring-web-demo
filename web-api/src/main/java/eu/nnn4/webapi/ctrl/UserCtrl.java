package eu.nnn4.webapi.ctrl;

import eu.nnn4.webapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserCtrl {

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/", produces = { "application/json" }, consumes = { "application/json" })
    public ResponseEntity<ShippingAddress> getShippingAddress4Name(
            @RequestBody String name) {
        return ResponseEntity.ok(userService.getByName(name));
    }
}
