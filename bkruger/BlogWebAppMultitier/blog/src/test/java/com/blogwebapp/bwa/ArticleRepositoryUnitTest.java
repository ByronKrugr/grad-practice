package com.blogwebapp.bwa;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.repositories.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ArticleRepositoryUnitTest {

    private Article validArticle = new Article("title", "tldr", "content");
    private Article articleToTest = new Article("title", "tldr", "content");
    private Article validUpdatedArticle = new Article("newTitle", "newTldr", "newContent");

    @Autowired
    private ArticleRepository articleRepository;

    private void assertArticlesEqual(Article actual, Article valid){
        assertThat(actual.getTitle()).isEqualTo(valid.getTitle());
        assertThat(actual.getTldr()).isEqualTo(valid.getTldr());
        assertThat(actual.getContent()).isEqualTo(valid.getContent());
    }

    private Article getNewlySavedArticle(String id){
        return articleRepository.findById(id).get();
    }

    private Article saveArticle(Article article){
        return articleRepository.save(this.articleToTest);
    }

    private Article updateArticle(Article article){
        article.setTitle("newTitle");
        article.setTldr("newTldr");
        article.setContent("newContent");
        return article;
    }

    @Test
    public void findByIdReturnsArticleWhenExists(){
        Article savedArticle = saveArticle(this.articleToTest);
        assertArticlesEqual(getNewlySavedArticle(savedArticle.getId()), this.validArticle);
    }

    @Test
    public void findByIdReturnsNothingWhenNotExists(){
        Optional<Article> emptyArticle = articleRepository.findById("nonExistingArticleId");
        assertThat(emptyArticle).isEmpty();
    }

    @Test
    public void saveUpdatesArticleWhenAlreadyExists(){
        Article article = saveArticle(this.articleToTest);
        Article updatedArticle = updateArticle(article);
        Article newlySavedArticle = saveArticle(updatedArticle);
        assertArticlesEqual(newlySavedArticle, this.validUpdatedArticle);
    }

}
