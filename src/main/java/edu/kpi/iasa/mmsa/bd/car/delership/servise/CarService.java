package edu.kpi.iasa.mmsa.bd.car.delership.servise;

import edu.kpi.iasa.mmsa.bd.car.delership.exepcions.CarNotFoundExcepcion;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Body;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Car;
import edu.kpi.iasa.mmsa.bd.car.delership.model.FullCar;
import edu.kpi.iasa.mmsa.bd.car.delership.repository.BodyRepository;
import edu.kpi.iasa.mmsa.bd.car.delership.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public List<Car> getCar(){
        return carRepository.findAll();
    }

    public Car saveCar(Car newCar) {
        return carRepository.save(newCar);
    }

    public Car getCarById(Long id){
        Optional<Car> car = carRepository.findById(id);
        if(car.isPresent()){
            return car.get();
        }
        throw new CarNotFoundExcepcion();
    }

    public Car updateCarById(Long id, Car updatedCar) {
        Optional<Car> car = carRepository.findById(id);
        if(car.isPresent()){
            Car oldCar = car.get();
            updateCar(oldCar, updatedCar);
            return carRepository.save(oldCar);
        }
        throw new CarNotFoundExcepcion();
    }
    private void updateCar(Car oldCar, Car updatedCar) {
        oldCar.setColor(updatedCar.getColor());
        oldCar.setDescription(updatedCar.getDescription());
        oldCar.setBodyId(updatedCar.getBodyId());
        oldCar.setEngine(updatedCar.getEngine());
        oldCar.setMileage(updatedCar.getMileage());
        oldCar.setGearbox(updatedCar.getGearbox());
        oldCar.setPhoto(updatedCar.getPhoto());
        oldCar.setPrice(updatedCar.getPrice());
        oldCar.setYear(updatedCar.getYear());
    }

    public String deleteCarById(Long id) {
        carRepository.deleteById(id);
        return "Car was successfully deleted!";
    }
}
