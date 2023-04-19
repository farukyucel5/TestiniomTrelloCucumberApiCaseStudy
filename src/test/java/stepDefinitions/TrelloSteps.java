package stepDefinitions;

import Pojos.CreatingBoardExpectedBody;
import Pojos.CreatingListExpectedBody;
import Pojos.CreatingTwoCardsExpectedBody;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import utilities.ConfigReader;
import utilities.ReuseableMethods;

import java.util.ArrayList;
import java.util.List;

import static hooks.api.HooksAPI.spec;
import static io.restassured.RestAssured.given;

public class TrelloSteps {
    public String fullPath;
    ReuseableMethods reuseableMethods=new ReuseableMethods();

    @Given("seting the endpoint with path parameter {string} and query parameter {string}")
    public void setingTheEndpointWithPathParameterAndQueryParameter(String rawPaths, String operation) {
        fullPath =reuseableMethods.setTheEndPoint(rawPaths,operation);
    }

    @And("send the query associated with {string}")
    public void sendTheQueryAssociatedWith(String operation) {
        reuseableMethods.sendTheQuery(operation,fullPath);
    }
}
