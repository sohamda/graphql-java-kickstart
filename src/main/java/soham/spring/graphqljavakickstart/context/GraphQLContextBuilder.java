package soham.spring.graphqljavakickstart.context;

import graphql.kickstart.execution.context.GraphQLKickstartContext;
import graphql.kickstart.servlet.context.GraphQLServletContextBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soham.spring.graphqljavakickstart.context.dataloader.DataLoaderRegistryFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import javax.websocket.server.HandshakeRequest;

@Component
public class GraphQLContextBuilder implements GraphQLServletContextBuilder {

    @Autowired
    private DataLoaderRegistryFactory dataLoaderRegistryFactory;

    @Override
    public GraphQLKickstartContext build(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return GraphQLKickstartContext.of(dataLoaderRegistryFactory.buildDataLoaderRegistry());
    }

    @Override
    public GraphQLKickstartContext build(Session session, HandshakeRequest handshakeRequest) {
        throw new IllegalStateException("No Session supported");
    }

    @Override
    public GraphQLKickstartContext build() {
        throw new IllegalStateException("No default supported");
    }
}
