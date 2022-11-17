package Program.controller;
import Program.model.Diak;
import Program.model.Szak;
import Program.model.Targy;
import Program.service.DiakService;
import org.apache.logging.log4j.util.PerformanceSensitive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diak")
public class DiakController {

    @Autowired
    DiakService diakService;

    @GetMapping("/getalltargy")
    public List<Targy> getAllTargy(){
        return diakService.getTargyak();
    }

    @GetMapping("/getallszak")
    public List<Szak> getAllSzak(){
        return diakService.getSzakok();
    }

    @GetMapping("/getalldiak")
    public List<Diak> getAllDiak(){
        return diakService.getDiakok();
    }


    @PostMapping(value = "/createSzak", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createSzak(@RequestBody String nev){
        System.out.println("1");
        diakService.createSzak(nev);
    }

    @PostMapping(value = "/createDiak")
    public void createDiak(String nev, String szak_nev){
        System.out.println("2");
        diakService.createDiak(nev, szak_nev);
    }
}