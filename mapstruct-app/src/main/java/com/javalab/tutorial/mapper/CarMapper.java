package com.javalab.tutorial.mapper;


import com.javalab.tutorial.dto.CarDto;
import com.javalab.tutorial.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDto carToCarDTO(Car car);
}
