package uol.compass.mshistory.framework.adpater.out.repository;

import java.time.LocalDate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import uol.compass.mshistory.domain.model.OrderHistory;

public interface OrderHistoryMongoRepository extends MongoRepository<OrderHistory, String> {
    Page<OrderHistory> findByOrderDateGreaterThan(LocalDate starDate, Pageable pageable);

    Page<OrderHistory> findByOrderDateLessThan(LocalDate endDate, Pageable pageable);

    Page<OrderHistory> findByOrderDateBetween(LocalDate starDate, LocalDate endDate, Pageable pageable);

    OrderHistory findByOrderId(Long orderId);
}
