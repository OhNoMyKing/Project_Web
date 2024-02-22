package test.demo.controller;

import org.springframework.web.bind.annotation.*;
import test.demo.entity.Home;
import test.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/api/home")
public class HomeController {
    @Autowired
    private HomeService homeService;
    @GetMapping("/index")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/buy")
    public String toNextBuy(){
        return "buy";
    }

    @GetMapping("/rent")
    public String toNextRent(){
        return "rent";
    }
    @GetMapping("/properties")
    public String toNextProperties(){
        return "properties";
    }

    @GetMapping("/property-details")
    public String toNextPropertydetails(){
        return "property-details";
    }
    @GetMapping("/blog")
    public String toNextBlog(){
        return "blog";
    }
    @GetMapping("/about")
    public String toNextAbout(){
        return "about";
    }

    @GetMapping("/contact")
    public String toNextContact(){
        return "contact";
    }
    @GetMapping("/showdata")
    public String processFormData(@RequestParam("list-types") String listTypes,
                                  @RequestParam("offer-types") String offerTypes,
                                  @RequestParam("select-city") String selectCity,
                                  Model model){
        List<Object[]> homes = homeService.findHomeService(listTypes, offerTypes, selectCity);
        model.addAttribute("homes", homes);
        return "thanh";
    }
    //crud
    @GetMapping("/list")
    public String getListHome(Model model){
        List<Home> home = homeService.getAllHome();
        model.addAttribute("home",home);
        return "listhome";
    }

    @GetMapping("/toadd")
    public String toAdd(Model model){
        Home home = new Home();
        model.addAttribute("home",home);
        return "addhome";
    }
    @PostMapping("/add")
    public String save(@ModelAttribute("home") Home home){
        homeService.updateHome(home);
        return "redirect:list";
    }
    @GetMapping("/update")
    public String updateHome(@RequestParam("id") Long id, Model model) {
        Home home = homeService.getHomeById(id);
        model.addAttribute("home",home);
        return "addhome";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id, Model model){
        homeService.Delete(id);
        return "redirect:list";
    }

    @GetMapping("/showLoginPage")
    public String showLoginPage(){
        return "login";
    }

    @GetMapping("/showPage403")
    public String showPage403(){
        return "403";
    }

    @PostMapping("/authenticateTheUser")
    public String authenticateTheUser(@RequestParam("username") String username, @RequestParam("password") String password){
        // Thực hiện xác thực người dùng ở đây
        return "redirect:/api/home/index"; // Điều hướng sau khi đăng nhập thành công
    }
}

