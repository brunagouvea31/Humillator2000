package es.eoi.humillator2000.service;


import es.eoi.humillator2000.data.entity.IEntity;
import es.eoi.humillator2000.service.mapper.EntityMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;

public abstract class AbstractService<ID, E extends IEntity<ID>, R extends JpaRepository<E, ID>,  DTO, M extends EntityMapper<DTO,E>>{
    private final R repository;
    private final  M mapper;

    public AbstractService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    /*
    public Page<DTO> findAll(Pageable pageable) {
        return mapper.toDto(repository.findAll(pageable));
    }
    */

    public DTO findById(ID id) {
        return mapper.toDto(repository.findById(id).orElse(null));
    }

    public Page<DTO> findAll(Pageable pageable) {

        return this.repository.findAll(pageable).map(mapper::toDto);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    public DTO save(DTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    protected R getRepository() {
        return repository;
    }
}
