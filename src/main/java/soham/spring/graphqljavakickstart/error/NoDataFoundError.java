package soham.spring.graphqljavakickstart.error;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class NoDataFoundError extends RuntimeException implements GraphQLError {

    private String errorCode;

    public NoDataFoundError(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return this.errorCode + " : " + super.getMessage();
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return Collections.singletonMap("errorCode", this.errorCode);
    }
}
