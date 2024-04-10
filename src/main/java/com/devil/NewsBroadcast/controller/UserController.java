package com.devil.NewsBroadcast.controller;

import com.devil.NewsBroadcast.model.News;
import com.devil.NewsBroadcast.model.User;
import com.devil.NewsBroadcast.repository.NewsRepository;
import com.devil.NewsBroadcast.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;


@Controller
public class UserController {

    @Autowired
    private NewsRepository newsRepository;
    private Boolean isLogin  = false;
    private User currUser ;

    public User getCurrUser() {
        return currUser;
    }

    public void setCurrUser(User currUser) {
        this.currUser = currUser;
    }

    public Boolean getLogin() {
        return isLogin;
    }

    public void setLogin(Boolean login) {
        isLogin = login;
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/signup")
    public String signUp(){
        return "SignUp";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user){
         userRepository.save(user);
         return "redirect:/";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }


    @PostMapping("/login")
    public String LoggedCredMatch(@RequestParam String username , @RequestParam String password){
//        System.out.println("user found : " );
        User user = userRepository.findByUsername(username);

        if(user == null){
            return "User not Found";
        }
//        System.out.println("user found : " );

        if(user.getPassword().equals(password)){
            isLogin = true;
            currUser = user;
            return "redirect:/";
        }
        else{
            return "redirect:/demo";
        }

    }
    @GetMapping("/logout")
    public String logout(){
        isLogin = false;
        return "login";
    }

    @GetMapping("/userProfile")
    public ModelAndView currUserProfile(){

    ModelAndView modelAndView =new ModelAndView();
    if(!isLogin){
        modelAndView.setViewName("login");
        return modelAndView;
    }

    modelAndView.setViewName("UserProfile");
    Integer id = currUser.getUserId();
    List<News> newsList =  newsRepository.findByUserUserIdOrderByNewsIdDesc(id);

    modelAndView.addObject("News", newsList);
    modelAndView.addObject("User" , currUser);

    return modelAndView;

    }

}
