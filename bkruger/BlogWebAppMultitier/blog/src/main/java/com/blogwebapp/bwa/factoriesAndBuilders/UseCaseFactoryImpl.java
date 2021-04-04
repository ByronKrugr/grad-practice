package com.blogwebapp.bwa.factoriesAndBuilders;

import com.blogwebapp.bwa.abstractFactoriesAndBuilders.UseCaseFactory;
import com.blogwebapp.bwa.abstractUseCaseComponents.UseCase;
import com.blogwebapp.bwa.useCaseComponents.readArticle.ReadArticleUseCase;
import com.blogwebapp.bwa.useCaseComponents.saveArticle.SaveArticleUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class UseCaseFactoryImpl implements UseCaseFactory {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public UseCase makeUseCase(String useCase){
        if (useCase.equals("SAVE_ARTICLE"))
            return applicationContext.getBean(SaveArticleUseCase.class);
//            return new SaveArticleUseCase();
        else if (useCase.equals("READ_ARTICLE"))
            return applicationContext.getBean(ReadArticleUseCase.class);
//            return new ReadArticleUseCase();
        else
            throw new IllegalArgumentException("Invalid use case specified");
    }
}
