package soham.spring.graphqljavakickstart.exceptionhandler;

import graphql.kickstart.spring.error.ThrowableGraphQLError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import soham.spring.graphqljavakickstart.error.NoDataFoundError;

@Component
@Slf4j
public class CustomGraphQLExceptionHandler {

    @ExceptionHandler(NoDataFoundError.class)
    public ThrowableGraphQLError handleNoDataFoundError(NoDataFoundError noDataFoundError) {
        return new ThrowableGraphQLError(noDataFoundError);
    }
}
