package uol.compass.ms.order.domain.dto.request;

import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDTO {

    @NotNull
    @CPF
    private String cpf;

    @NotEmpty
    @NotNull
    private List<Long> itemsIds;

    @NotNull
    @Size(min = 8, max = 9)
    private String cep;

    @NotNull
    private Integer number;
}
