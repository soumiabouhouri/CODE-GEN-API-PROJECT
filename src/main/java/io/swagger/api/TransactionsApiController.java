package io.swagger.api;

import io.swagger.model.Transaction;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-07T13:28:51.174Z[GMT]")
@Controller
public class TransactionsApiController implements TransactionsApi {

    private static final Logger log = LoggerFactory.getLogger(TransactionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransactionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Transaction>> getAllTransactions() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Transaction>>(objectMapper.readValue("[ {\n  \"amount\" : 500,\n  \"userAccount\" : \"userAccount\",\n  \"id\" : 1,\n  \"user\" : \"user\",\n  \"receiverAccount\" : \"receiverAccount\",\n  \"timestamp\" : \"2017-07-21T17:32:28Z\"\n}, {\n  \"amount\" : 500,\n  \"userAccount\" : \"userAccount\",\n  \"id\" : 1,\n  \"user\" : \"user\",\n  \"receiverAccount\" : \"receiverAccount\",\n  \"timestamp\" : \"2017-07-21T17:32:28Z\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Transaction>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Transaction>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Transaction>> getTransaction(@ApiParam(value = "id of the transaction",required=true) @PathVariable("TransactionID") List<Transaction> transactionID
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Transaction>>(objectMapper.readValue("[ {\n  \"amount\" : 500,\n  \"userAccount\" : \"userAccount\",\n  \"id\" : 1,\n  \"user\" : \"user\",\n  \"receiverAccount\" : \"receiverAccount\",\n  \"timestamp\" : \"2017-07-21T17:32:28Z\"\n}, {\n  \"amount\" : 500,\n  \"userAccount\" : \"userAccount\",\n  \"id\" : 1,\n  \"user\" : \"user\",\n  \"receiverAccount\" : \"receiverAccount\",\n  \"timestamp\" : \"2017-07-21T17:32:28Z\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Transaction>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Transaction>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Transaction> transfer(@ApiParam(value = "transaction for the transfer"  )  @Valid @RequestBody Transaction body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Transaction>(objectMapper.readValue("{\n  \"amount\" : 500,\n  \"userAccount\" : \"userAccount\",\n  \"id\" : 1,\n  \"user\" : \"user\",\n  \"receiverAccount\" : \"receiverAccount\",\n  \"timestamp\" : \"2017-07-21T17:32:28Z\"\n}", Transaction.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Transaction>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Transaction>(HttpStatus.NOT_IMPLEMENTED);
    }

}
