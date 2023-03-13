package com.fastcampus.projectboardstudy.repository;

import com.fastcampus.projectboardstudy.config.JpaConfig;
import com.fastcampus.projectboardstudy.domain.Article;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.Assertions.*;



@DisplayName("연결테스트")
@Import(JpaConfig.class)
@DataJpaTest

class JpaRepositoryTest {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    public JpaRepositoryTest(
         @Autowired ArticleRepository articleRepository,
         @Autowired ArticleCommentRepository articleCommentRepository
    ) {
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
    }

    @DisplayName("인서트 테스트")
    @Test

    void given_when_then(){
        long previousCount = articleRepository.count();


        Article savedArticle = articleRepository.save(Article.of("new article", "new content", "#spring"));


        assertThat(articleRepository.count()).isEqualTo(previousCount +1);

        
        
        
    }
}