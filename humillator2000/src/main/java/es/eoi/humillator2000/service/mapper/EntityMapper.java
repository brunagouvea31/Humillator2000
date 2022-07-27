package es.eoi.humillator2000.service.mapper;

import org.springframework.data.domain.Page;

import java.util.List;

public interface EntityMapper<D, E> {
    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);
}