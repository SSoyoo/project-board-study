package com.fastcampus.projectboardstudy.repository;

import com.fastcampus.projectboardstudy.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment,Long> {
}
