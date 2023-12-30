package com.example.controle.web;
import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController =
public class UserGraphQLController {
    @Autowired
    private GraphQL graphQL;


    public ResponseEntity<Object> graphQL(@RequestBody String query) {
        ExecutionResult executionResult = graphQL.execute(query);
        return ResponseEntity.ok(executionResult.getData());
    }

}
