package com.dvt.blog;

public class ArticleRepositoryBuilderImpl implements Builder{

    @Override
    public ArticleRepository build(String articleRepository) {
        if (articleRepository.equals("MONGO"))
            return new MongoArticleRepository();
        else
            return new SQLArticleRepository();
    }
}
