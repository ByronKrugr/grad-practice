package com.designpatterns.dp;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    UseCaseFactoryImpl useCaseFactory = new UseCaseFactoryImpl();
    SaveArticleUseCase saveArticleUseCase = (SaveArticleUseCase) useCaseFactory.makeUseCase("SAVE_ARTICLE", new HashMap<>() {{
      put("title", "myTitle");
      put("content", "myContent");
    }});
    System.out.println(saveArticleUseCase.execute());

    ReadArticleUseCase readArticleUseCase = (ReadArticleUseCase) useCaseFactory.makeUseCase("READ_ARTICLE", new HashMap<>() {{
      put("id", "6058e8fb8802567cac894045");
    }});
    System.out.println(readArticleUseCase.execute());
  }
}
