package lk.zeon.carrental.Controller;

import lk.zeon.carrental.dto.rentDto;
import lk.zeon.carrental.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ze on 11/3/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/rent")
public class RentController {

    @Autowired
    private RentService rentService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public  boolean addRent(@RequestBody rentDto rentDto){
        return rentService.addRent(rentDto);
    }


}
