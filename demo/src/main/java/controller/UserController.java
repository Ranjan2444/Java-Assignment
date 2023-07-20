package controller;


import dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

@Controller
public class UserController {
    private UserService userService;
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/login")
    public String login(Model model, UserDto userDto){
        model.addAttribute("user", userDto);
        return "login";
    }
    @GetMapping("/register")
    public String register(Model model, UserDto userDto){
        model.addAttribute("user", userDto);
        return "register";
    }
    @PutMapping("/register")
    public String registerSave(@ModelAttribute("user") UserDto userDto){
        userService.save(userDto);
        return "register";
    }

}
