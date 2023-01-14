package uol.compass.ms.order.framework.adpater.out.repositories;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;

import uol.compass.ms.order.domain.model.entities.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
    ItemEntity findByNameAndCreationDateAndExpirationDateAndValueAndDescription(
        String name,
        LocalDate creationDate,
        LocalDate expirationDate,
        Double value,
        String description
    );
}