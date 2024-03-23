package mediaproject.its.response.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Builder
@AllArgsConstructor
@Getter
public class ErrorResponseDto {
    private String errorStatus;
    private String message;
    private HttpStatus httpStatus;
}