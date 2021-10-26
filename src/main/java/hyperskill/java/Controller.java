package hyperskill.java;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/public")
    public String testPublic() {
        return "/public is accessed";
    }

    @GetMapping("/authenticated")
    public String testAuth() {
        return "/authenticated is accessed";
    }

    @GetMapping("/user")
    public String testUser() {
        return "/user is accessed";
    }

    @GetMapping("/admin")
    public String testAdmin() {
        return "/admin is accessed";
    }
}