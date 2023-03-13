package com.fastcampus.projectboardstudy.repository;

import com.fastcampus.projectboardstudy.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}