package edu.kpi.iasa.mmsa.bd.car.delership.controler;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Car;
import edu.kpi.iasa.mmsa.bd.car.delership.servise.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping(value = "/car")
    public ResponseEntity<List<Car>> getCar(){
        return ResponseEntity.ok(carService.getCar());
    }

    @PostMapping(value = "/car")
    public ResponseEntity<Car> postCar(@RequestBody Car newCar){
        return ResponseEntity.ok(carService.saveCar(newCar));
    }

    @GetMapping(value = "/car/{id}")
    public ResponseEntity<Car> getCar(@PathVariable Long id){
        return ResponseEntity.ok(carService.getCarById(id));
    }

    @PutMapping(value = "/car/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable Long id, @Valid @RequestBody Car updatedCar){
        return ResponseEntity.ok(carService.updateCarById(id, updatedCar));
    }

    @DeleteMapping(value = "/car/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Long id){
        return ResponseEntity.ok(carService.deleteCarById(id));
    }
}
