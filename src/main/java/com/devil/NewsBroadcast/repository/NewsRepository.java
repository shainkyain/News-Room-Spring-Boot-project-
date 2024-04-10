package com.devil.NewsBroadcast.repository;

import com.devil.NewsBroadcast.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {
//   public List<News> findAllByOrderByIdDesc();
      public List<News>  findAllByOrderByNewsIdDesc();

      public List<News> findByUserUserIdOrderByNewsIdDesc(Integer id);
}
