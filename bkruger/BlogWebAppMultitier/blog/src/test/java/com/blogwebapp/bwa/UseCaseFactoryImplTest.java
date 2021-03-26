package com.blogwebapp.bwa;

import com.blogwebapp.bwa.useCases.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class UseCaseFactoryImplTest {

//    commenting out instead of removing for demonstration and learning purposes.
//    @Test
//    public void canCreateUseCaseInterface(){
//        UseCase usecase;
//    }

//    commenting out instead of removing for demonstration and learning purposes.
//    This should not have been tested at this point. We only care to test whether
//    UseCaseFactory is correctly producing use cases, right? so all the irrelevant
//    stuff includes: Request class and its derivatives, Response class and its derivatives,
//    execute method of UseCaseInterface. ***
//    @Test
//    public void canCreateUseCaseDerivativeSaveArticleUseCase(){
//        SaveArticleUseCase saveArticleUseCase = new SaveArticleUseCase();
//        assertThat(saveArticleUseCase).isInstanceOf(UseCase.class);
//    }

//    commenting out instead of removing for demonstration and learning purposes.
//    @Test
//    ***
//    public void canCreateDegenerateRequest(){
//        Request request;
//    }

//    commenting out instead of removing for demonstration and learning purposes.
//    @Test
//    ***
//    public void canCreateDegenerateResponse(){
//        Response response;
//    }

//    pending question about TDD technique.
//    @Test
//    ***
//    public void canCallExecuteMethodOfUseCaseInterface(){
//        UseCase useCase = new UseCase() {
//            @Override
//            public Response execute(Request request) {
//                return null;
//            }
//
//            @Override
//            public String toString() {
//                return super.toString();
//            }
//        };
//        Request request = new Request() {
//            @Override
//            public String toString() {
//                return super.toString();
//            }
//        };
//        Response response = useCase.execute(request);
//        assertThat(response).isInstanceOf(Response.class);
//    }

//    commenting out instead of removing for demonstration and learning purposes.
//    @Test
//    ***
//    public void canCreateSaveArticleRequestDerivativeOfRequest(){
//        SaveArticleRequest saveArticleRequest = new SaveArticleRequest();
//        assertThat(saveArticleRequest).isInstanceOf(Request.class);
//    }

//    commenting out instead of removing for demonstration and learning purposes.
//    @Test
//    ***
//    public void canCreateSaveArticleResponseDerivativeOfResponse(){
//        SaveArticleResponse saveArticleResponse = new SaveArticleResponse();
//        assertThat(saveArticleResponse).isInstanceOf(Response.class);
//    }

//    commenting out instead of removing for demonstration and learning purposes.
//    ***
//    @Test
//    public void canCallExecuteMethodOfSaveArticleUseCase(){
//        SaveArticleUseCase saveArticleUseCase = new SaveArticleUseCase();
//        SaveArticleRequest saveArticleRequest = new SaveArticleRequest();
//        SaveArticleResponse saveArticleResponse = saveArticleUseCase.execute(saveArticleRequest);
//        assertThat(saveArticleResponse).isInstanceOf(SaveArticleResponse.class);
//    }

//    commenting out instead of removing for demonstration and learning purposes.
//    @Test
//    public void canCreateUseCaseFactoryInterface(){
//        UseCaseFactory useCaseFactory;
//    }

    @Test
    public void canCreateUseCaseFactoryImplDerivateOfUseCaseFactory(){
        UseCaseFactoryImpl useCaseFactoryImpl = new UseCaseFactoryImpl();
        assertThat(useCaseFactoryImpl).isInstanceOf(UseCaseFactory.class);
    }

//    commenting out instead of removing for demonstration and learning purposes.
//    @Test
//    public void canCallMakeUseCaseMethodOfUseCaseFactoryImpl(){
//        UseCaseFactoryImpl useCaseFactoryImpl = new UseCaseFactoryImpl();
//        useCaseFactoryImpl.makeUseCase("");
//    }

    @Test
    public void makeUseCaseMethodThrowsExceptionWhenInvalidString(){
        UseCaseFactoryImpl useCaseFactoryImpl = new UseCaseFactoryImpl();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
                useCaseFactoryImpl.makeUseCase("INVALID");
        });
        assertThat(e.getMessage()).isEqualTo("Invalid use case specified");
    }

    @Test
    public void makeUseCaseMethodUseCaseReturnsSaveArticleUseCaseWhenSaveArticleString(){
        UseCaseFactoryImpl useCaseFactoryImpl = new UseCaseFactoryImpl();
        SaveArticleUseCase saveArticleUseCase = useCaseFactoryImpl.makeUseCase("SAVE_ARTICLE");
        assertThat(saveArticleUseCase).isInstanceOf(SaveArticleUseCase.class);
    }

}