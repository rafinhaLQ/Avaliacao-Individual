package uol.compass.ms.order.domain.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    BAD_REQUEST("Pedido inválido"),
    INVALID_PARAMETER("Paramêtro do pedido inválido"),
    INTERNAL_SERVER_ERROR("Erro interno do servidor"),

    INVALID_CEP("CEP inválido"),
    INVALID_DATE("O item expira antes de ser criado"),

    ORDER_NOT_FOUND("Pedido não encontrado"),
    ITEM_NOT_FOUND("Item não encontrado");

    private final String message;
}
