package es.eoi.humillator2000.web.controller;

import es.eoi.humillator2000.data.entity.IEntity;
import es.eoi.humillator2000.service.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;

public class AbstractRestController <S extends AbstractService<ID, E, R extends JpaRepository <E, ID>>,
        E extends IEntity<ID>, ID> {

    private final S Service; //Tiene que darnos kike la solución
}
