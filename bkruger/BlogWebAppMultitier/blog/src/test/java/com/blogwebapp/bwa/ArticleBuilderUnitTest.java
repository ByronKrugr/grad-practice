package com.blogwebapp.bwa;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.repositories.ArticleBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ArticleBuilderUnitTest {

    @Test
    public void canCreateArticleBuilder(){
        ArticleBuilder articleBuilder = new ArticleBuilder();
    }
}
