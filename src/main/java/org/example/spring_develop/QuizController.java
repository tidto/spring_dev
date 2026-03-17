package org.example.spring_develop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuizController {
    @GetMapping("/quiz")
    public ResponseEntity<String> quiz(@RequestParam("code") int code) {
        switch (code) {
            case 1:
                return ResponseEntity.created(null).body("created!");
            case 2:
                return ResponseEntity.badRequest().body("Bad Request!");
            default :
                return ResponseEntity.ok().body("OK!");

        }
    }

    @PostMapping("/quiz")
    public ResponseEntity<String> quiz2(@RequestBody Code code){
        switch(code.value()) {
            case 1:
                return ResponseEntity.status(404).body("NOT FOUND!");
            case 2:
                return ResponseEntity.badRequest().body("BAD Request");
            default :
                return ResponseEntity.ok().body("OK");
        }
    }
}

record Code(int value) {

}
