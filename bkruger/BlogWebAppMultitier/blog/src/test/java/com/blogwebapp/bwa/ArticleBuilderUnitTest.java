package com.blogwebapp.bwa;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.repositories.ArticleBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class ArticleBuilderUnitTest {

//    @Test
//    public void canCreateArticleBuilder(){
//        ArticleBuilder articleBuilder = new ArticleBuilder();
//    }
//
//    @Test
//    public void canBuildEmptyArticle(){
//        ArticleBuilder articleBuilder = new ArticleBuilder();
//        Article article = articleBuilder.build();
//    }
//
//    @Test
//    public void canCreateArticleUsingBuilder(){
//        ArticleBuilder articleBuilder = new ArticleBuilder();
//        Article article = new Article(articleBuilder);
//    }
    private ArticleBuilder articleBuilder;

    @Before
    public void setUp(){
        this.articleBuilder = new ArticleBuilder();
    }

    @Test
    public void canbBuildArticleWithId(){
        Article article = articleBuilder.withId("id").build();
        assertThat(article.getId()).isEqualTo("id");
    }

    @Test
    public void canBuildArticleWithTitle(){
        Article article = articleBuilder.withId("id").withTitle("title").build();
        assertThat(article.getId()).isEqualTo("id");
        assertThat(article.getTitle()).isEqualTo("title");
    }

    @Test
    public void canBuildArticleWithTldr(){
        Article article = articleBuilder.withId("id").withTitle("title").withTldr("tldr").build();
        assertThat(article.getId()).isEqualTo("id");
        assertThat(article.getTitle()).isEqualTo("title");
        assertThat(article.getTldr()).isEqualTo("tldr");
    }

    @Test
    public void canBuildArticleWithContent(){
        Article article = articleBuilder.withId("id").withTitle("title").withTldr("tldr").withContent("content").build();
        assertThat(article.getId()).isEqualTo("id");
        assertThat(article.getTitle()).isEqualTo("title");
        assertThat(article.getTldr()).isEqualTo("tldr");
        assertThat(article.getContent()).isEqualTo("content");
    }

}
