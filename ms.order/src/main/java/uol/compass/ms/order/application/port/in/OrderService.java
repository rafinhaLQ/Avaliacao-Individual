package uol.compass.ms.order.application.port.in;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uol.compass.ms.order.domain.dto.request.OrderRequestDTO;
import uol.compass.ms.order.domain.dto.request.OrderUpdateRequestDTO;
import uol.compass.ms.order.domain.dto.response.OrderResponseDTO;

public interface OrderService {
    OrderResponseDTO create(OrderRequestDTO request);

    Page<OrderResponseDTO> findAll(String cpf, Pageable pageable);

    OrderResponseDTO findById(Long id);

    OrderResponseDTO updateItems(Long id, List<Long> itemsIds);

    OrderResponseDTO update(Long id, OrderUpdateRequestDTO request);

    void delete(Long id);
}
