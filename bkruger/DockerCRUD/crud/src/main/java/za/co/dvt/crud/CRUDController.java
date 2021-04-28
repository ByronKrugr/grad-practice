package za.co.dvt.crud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CRUDController {

    @GetMapping("/read/{id}")
    public ResponseEntity<String> read(@PathVariable("id") String id){
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
