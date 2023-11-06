package praktikum.Base;

import Client.UserClientCreating;
import DTO.UserDTO;
import io.restassured.RestAssured;

import org.junit.Before;

public class BaseUserLogin {
    String baseUrl = RestAssured.baseURI = "https://stellarburgers.nomoreparties.site";

    @Before
    public void creatingUser(){
        UserDTO user = new UserDTO("polina@yandex.ru", "password", "Полина");

        UserClientCreating userClientCreating = new UserClientCreating();
        userClientCreating.Creating(user);
    }
}