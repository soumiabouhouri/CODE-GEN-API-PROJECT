package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-05T07:18:09.974Z[GMT]")
@Controller
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<User> createuser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"UserName\" : \"johndoe\",\n  \"FirstName\" : \"John\",\n  \"id\" : \"1L3\",\n  \"LastName\" : \"Doe\",\n  \"Gender\" : \"Male\",\n  \"Password\" : \"password\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.CREATED);
    }

    public ResponseEntity<User> deleteuserbyid(@ApiParam(value = "ID of article to retun",required=true) @PathVariable("id") Long id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"UserName\" : \"johndoe\",\n  \"FirstName\" : \"John\",\n  \"id\" : \"1L3\",\n  \"LastName\" : \"Doe\",\n  \"Gender\" : \"Male\",\n  \"Password\" : \"password\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<User> getuserbyid(@ApiParam(value = "ID of article to retun",required=true) @PathVariable("id") Long id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"UserName\" : \"johndoe\",\n  \"FirstName\" : \"John\",\n  \"id\" : \"1L3\",\n  \"LastName\" : \"Doe\",\n  \"Gender\" : \"Male\",\n  \"Password\" : \"password\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.valueOf(200));
    }

    public ResponseEntity<List<User>> getusers(@ApiParam(value = "Filtering user by gender") @Valid @RequestParam(value = "filterGender", required = false) String filterGender
,@ApiParam(value = "Max of number of users to return") @Valid @RequestParam(value = "limit", required = false) Integer limit
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"UserName\" : \"johndoe\",\n  \"FirstName\" : \"John\",\n  \"id\" : \"1L3\",\n  \"LastName\" : \"Doe\",\n  \"Gender\" : \"Male\",\n  \"Password\" : \"password\"\n}, {\n  \"UserName\" : \"johndoe\",\n  \"FirstName\" : \"John\",\n  \"id\" : \"1L3\",\n  \"LastName\" : \"Doe\",\n  \"Gender\" : \"Male\",\n  \"Password\" : \"password\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> login(@ApiParam(value = ""  )  @Valid @RequestBody User body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"authType\" : \"authType\",\n  \"tokenValue\" : \"tokenValue\"\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> updateuser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User body
,@ApiParam(value = "ID of article to retun",required=true) @PathVariable("id") Long id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"UserName\" : \"johndoe\",\n  \"FirstName\" : \"John\",\n  \"id\" : \"1L3\",\n  \"LastName\" : \"Doe\",\n  \"Gender\" : \"Male\",\n  \"Password\" : \"password\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.valueOf(200));
    }

}
