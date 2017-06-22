package com.engage.backendcodingchallenge.config;

import com.engage.backendcodingchallenge.endpoints.ExpensesEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by alp3 on 21/6/17.
 */
@Component
@ApplicationPath("/app")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }
    private void registerEndpoints() {
        register(ExpensesEndpoint.class);
    }
}
