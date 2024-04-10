package com.devil.NewsBroadcast.controller;

import com.devil.NewsBroadcast.model.News;
import com.devil.NewsBroadcast.model.User;
import com.devil.NewsBroadcast.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    @Autowired
    private UserController userController;


    @GetMapping("/")
    public ModelAndView getAllNews() {
        if(!userController.getLogin()){  return new ModelAndView("login" );}
        List<News> list = newsService.getAllNews();
        return new ModelAndView("index", "News", list);
    }

    @GetMapping("/contact")
    public String goToContactHtml(){
        if(!userController.getLogin()){  return "login" ;}
        return "contact";
    }


    @GetMapping("/addNews")
    public String addNews() {
        if(!userController.getLogin()){  return "login" ;}
        return "AddNews";
    }

    @PostMapping("/addNews")
    public String addNewNews(@ModelAttribute News news) {
        news.setCreatedAt(LocalDate.now());
        news.setLikes(0);
        news.setUser(userController.getCurrUser());
        newsService.saveNews(news);
        return "redirect:/";
    }

    @PostMapping("/newsPage/likes/{id}")
    public String addLikes(@PathVariable("id") int id){
        newsService.plusLikes(id);
        return "redirect:/newsPage/"+id;
    }

    @GetMapping("/newsPage/{id}")
    public ModelAndView getFullNews(@PathVariable("id") int id) {
        if(!userController.getLogin()){  return new ModelAndView("login" );}

        News news = newsService.getNewsById(id);
        return new ModelAndView("newsPage", "News", news);
    }

    @GetMapping("/newsPage/user/{id}")
    public ModelAndView getFullNews01(@PathVariable("id") int id) {
        if(!userController.getLogin()){  return new ModelAndView("login" );}

        News news = newsService.getNewsById(id);
        return new ModelAndView("newsPage01", "News", news);
    }

    @RequestMapping("/newsPage/delete/{id}")
    public String newsDeleteById(@PathVariable("id") int id){

        newsService.deleteByid(id);
        return  "redirect:/";
    }

    @GetMapping("/newsPage/edit/{id}")
    public ModelAndView editNewsPage(@PathVariable("id") int id){
        if(!userController.getLogin()){  return new ModelAndView("login" );}

        News news = newsService.getNewsById(id);
        return new ModelAndView("editNews", "News" , news);
    }

    @PostMapping("/editNews/{id}")
    public String saveEditNews(@PathVariable("id") int id , @ModelAttribute News news){
        news.setUser(userController.getCurrUser());
        news.setNewsId(id);
        newsService.saveNews(news);

        return "redirect:/newsPage/"+id;
    }


}
