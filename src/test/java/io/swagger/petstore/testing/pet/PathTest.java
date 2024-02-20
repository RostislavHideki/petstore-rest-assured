package io.swagger.petstore.testing.pet;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.junit.jupiter.api.BeforeAll;

public class PathTest {

    @BeforeAll
    public static void setUp() {
        Config config = ConfigFactory.load();
        RestAssured.baseURI = config.getString("base.uri");
        RestAssured.basePath = config.getString("base.path.pet");
        RestAssured.defaultParser = Parser.JSON;
    }
}
