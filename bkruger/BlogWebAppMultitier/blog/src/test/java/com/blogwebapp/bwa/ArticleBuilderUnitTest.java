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
    public void canBuildArticleWithIdAndTitle(){
        Article article = articleBuilder.withId("id").withTitle("title").build();
        assertThat(article.getId()).isEqualTo("id");
        assertThat(article.getTitle()).isEqualTo("title");
    }

    @Test
    public void canBuildArticleWithIdTitleAndTldr(){
        Article article = articleBuilder.withId("id").withTitle("title").withTldr("tldr").build();
        assertThat(article.getId()).isEqualTo("id");
        assertThat(article.getTitle()).isEqualTo("title");
        assertThat(article.getTldr()).isEqualTo("tldr");
    }

    @Test
    public void canBuildArticleWithIdTitleTldrAndContent(){
        Article article = articleBuilder.withId("id").withTitle("title").withTldr("tldr").withContent("content").build();
        assertThat(article.getId()).isEqualTo("id");
        assertThat(article.getTitle()).isEqualTo("title");
        assertThat(article.getTldr()).isEqualTo("tldr");
        assertThat(article.getContent()).isEqualTo("content");
    }

    @Test
    public void canBuildArticleWithIdTitleTldrAndContentOfDynamicValie(){
        Article article = articleBuilder.withId("id1").withTitle("title1").withTldr("tldr1").withContent("content1").build();
        assertThat(article.getId()).isEqualTo("id1");
        assertThat(article.getTitle()).isEqualTo("title1");
        assertThat(article.getTldr()).isEqualTo("tldr1");
        assertThat(article.getContent()).isEqualTo("content1");
    }

    @Test
    public void canBuildArticleWithIdTitleTldrAndContentOfDynamicValie2(){
        Article article = articleBuilder.withId("abcd123").withTitle("efgh456").withTldr("ijkl7890").withContent("mnop9876").build();
        assertThat(article.getId()).isEqualTo("abcd123");
        assertThat(article.getTitle()).isEqualTo("efgh456");
        assertThat(article.getTldr()).isEqualTo("ijkl7890");
        assertThat(article.getContent()).isEqualTo("mnop9876");
    }

}
