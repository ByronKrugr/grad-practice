package com.blogwebapp.bwa.useCaseComponents.readArticle;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.repositories.ArticleRepository;
import com.blogwebapp.bwa.abstractUseCaseComponents.Request;
import com.blogwebapp.bwa.abstractUseCaseComponents.Response;
import com.blogwebapp.bwa.abstractUseCaseComponents.UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadArticleUseCase implements UseCase {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Response execute(Request request) {
        ReadArticleRequest readArticleRequest = (ReadArticleRequest) request;
        Article article = articleRepository.findById(readArticleRequest.getId()).get();
        ReadArticleResponse readArticleResponse = new ReadArticleResponse(article);
        return readArticleResponse;
    }
}
