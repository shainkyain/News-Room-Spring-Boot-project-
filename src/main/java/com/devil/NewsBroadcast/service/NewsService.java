package com.devil.NewsBroadcast.service;

import com.devil.NewsBroadcast.model.News;
import com.devil.NewsBroadcast.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;


    public List<News> getAllNews(){
        return newsRepository.findAllByOrderByNewsIdDesc();
    }

    public void saveNews(News news){
        newsRepository.save(news);
    }

    public News getNewsById(int id){
        return newsRepository.findById(id).get();
    }

    public void plusLikes(int id){
        News news = newsRepository.findById(id).orElse(null);
        if(news !=null) {
            news.setLikes(news.getLikes() + 1);
            newsRepository.save(news);
        }
    }

    public void deleteByid(int id){
        newsRepository.deleteById(id);
    }






}
