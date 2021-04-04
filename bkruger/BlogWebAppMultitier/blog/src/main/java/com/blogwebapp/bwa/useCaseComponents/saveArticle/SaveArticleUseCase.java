package com.blogwebapp.bwa.useCaseComponents.saveArticle;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.repositories.ArticleRepository;
import com.blogwebapp.bwa.abstractUseCaseComponents.Request;
import com.blogwebapp.bwa.abstractUseCaseComponents.Response;
import com.blogwebapp.bwa.abstractUseCaseComponents.UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveArticleUseCase implements UseCase {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Response execute(Request request) {
        SaveArticleRequest saveArticleRequest = (SaveArticleRequest) request;
        Article article = new Article(saveArticleRequest.getTitle(), saveArticleRequest.getTldr(), saveArticleRequest.getContent());
        Article savedArticle = articleRepository.insert(article);
        SaveArticleResponse saveArticleResponse = new SaveArticleResponse(savedArticle);
        return saveArticleResponse;
    }
}
