package com.javalab.tutorial.mapper;

import com.javalab.tutorial.dto.CarDto;
import com.javalab.tutorial.entity.Car;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarMapperTest {

    private static Logger LOGGER = LoggerFactory.getLogger(CarMapperTest.class);

    @Test
    public void givenCarEntityToCarMapper_whenMaps_thenCorrect() {

        LOGGER.info("CarMapperTest#givenCarEntityToCarMapper_whenMaps_thenCorrect");

        Car carEntity = new Car();
        carEntity.setId(1L);
        carEntity.setName("Benz");

        CarDto carDtO = CarMapper.INSTANCE.carToCarDTO(carEntity);

        assertEquals(carDtO.getId(), carEntity.getId());
        assertEquals(carDtO.getName(), carEntity.getName());
    }

}