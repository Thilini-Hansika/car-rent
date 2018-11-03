package lk.zeon.carrental.service.impl;

import lk.zeon.carrental.dto.VehicleDto;
import lk.zeon.carrental.entity.Cars;
import lk.zeon.carrental.repository.CarRepository;
import lk.zeon.carrental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Created by Ze on 10/31/2018.
 */
public class CarServiceImpl implements CarService {

    @Autowired

    private CarRepository carRepository;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public boolean addVehicles(VehicleDto vehicleDto) {
        Cars cars=new Cars(
                vehicleDto.getVehicleId(),
                vehicleDto.getType(),
                vehicleDto.getBrnad(),
                vehicleDto.getPlateNumber(),
                vehicleDto.getFuelType(),
                vehicleDto.getBrnad(),
                vehicleDto.getDailyPrice(),
                vehicleDto.getSeatQuantity()
        );
        carRepository.save(cars);
    return true;
    }

    @Override
    public boolean deleteVehicle(VehicleDto vehicleDto) {
        return false;
    }

    @Override
    public ArrayList<VehicleDto> getAllvehicles() {
        return null;
    }

    @Override
    public VehicleDto getVehicleByModel(String model) {
        return null;
    }

    @Override
    public VehicleDto getVehicleBYBrand(String brand) {
        return null;
    }

    @Override
    public VehicleDto updateVehicleDetail(VehicleDto vehicleDto) {
        return null;
    }
}
